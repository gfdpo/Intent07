package jp.ac.ecc.sk3a07.intent07

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Eventw3 : AppCompatActivity() {
    //sk3a 桑原朋美　^_^

    //画像を保持するフィールド
    private var img0: Bitmap? = null
    private var img1: Bitmap? = null

    //現在表示されている画像がネコかイヌかのフラグ
    //private var flag = true
    //サウンドマネージャーを格納する
    private var mSoundManager: SoundManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eve2)

        //img0ファイルとimg1ファイルをビットマップに変換する
        img0 = BitmapFactory.decodeResource(resources, R.drawable.img03)
        //img1 = BitmapFactory.decodeResource(resources,R.drawable.img1)

        //ImageViewのidを取得する
        val imageView0: ImageView = findViewById(R.id.imageView)
        //val imageView1 : ImageView = findViewById(R.id.imageView1)

        //サウンドマネージャーのインスタンス作成
        mSoundManager = SoundManager(context = this)

        //音声ボタンを押したときに呼び出される処理
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            //imageView0.setImageBitmap(img0)
            //imageView1.setImageBitmap(img0)
            //mSoundManager!!.play(SoundManager.Cat1, 100)

        }
    }
}