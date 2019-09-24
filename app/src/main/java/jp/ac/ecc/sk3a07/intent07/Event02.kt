package jp.ac.ecc.sk3a07.intent07

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Event02 : AppCompatActivity() {

    //sk3a 桑原朋美 ^_^

    //画像を保持するフィールド
    private var img0 : Bitmap? = null
    private var img1 : Bitmap? = null
    //いいねボタン↓
    private var imgE : Bitmap? = null
    private var imgN : Bitmap? = null
    //現在表示されている画像が日本語か英語かのフラグ
    private var flag = true
    //? → null許容型
    //サウンドマネージャーを格納する
    private var mSoundManager : SoundManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        //img0ファイルとimg1ファイルをビットマップに変換する
        img0 = BitmapFactory.decodeResource(resources,R.drawable.img0)
        img1 = BitmapFactory.decodeResource(resources,R.drawable.img1)

        imgE = BitmapFactory.decodeResource(resources,R.drawable.like_english)
        imgN = BitmapFactory.decodeResource(resources,R.drawable.like_normal)

        //ImageViewのidを取得する
        val imageView0 : ImageView = findViewById(R.id.imageView0)
        val imageView1 : ImageView = findViewById(R.id.imageView1)

        //サウンドマネージャーのインスタンス作成
        mSoundManager = SoundManager(context = this)

        //左側のボタンを押したときに呼び出される処理
        val button1: Button =findViewById(R.id.button1)
        button1.setOnClickListener{
            imageView0.setImageBitmap(img0)
            imageView1.setImageBitmap(img0)
            mSoundManager!!.play(SoundManager.SOUND_GUN,100)
        }
        //右側のボタンを押したときに呼び出される処理
        val button2: Button =findViewById(R.id.button2)
        button2.setOnClickListener {
            imageView0.setImageBitmap(img1)
            imageView1.setImageBitmap(img1)
            mSoundManager!!.play(SoundManager.SOUND_EXPLO,100)
        }

        //いいねボタンのとこ
        val imageView : ImageView = findViewById(R.id.imageView)
        var cnt = 0
        val textView : TextView = findViewById(R.id.textView)
        imageView.setOnClickListener{
            cnt++
            textView.setText(Integer.toString(cnt))
        }

        imageView.setOnLongClickListener{
            if(flag == true){
                imageView.setImageBitmap(imgE)
                flag = false
            }else {
                imageView.setImageBitmap(imgN)
                flag = true
            }
            false
        }
    }
}
