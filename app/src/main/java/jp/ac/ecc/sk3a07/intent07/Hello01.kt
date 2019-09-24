package jp.ac.ecc.sk3a07.intent07
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*
import java.util.Calendar.DAY_OF_YEAR

class Hello01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        //                       現在の日付でインスタンス化
        var birthday : Calendar = Calendar.getInstance()

        var today:Calendar = Calendar.getInstance()
        //日付比べ
        val todY = today.get(Calendar.YEAR)
        birthday.set(todY,6,23,0,0,0)
        //today.get(Calendar.MONTH) == 6
        //today.get(Calendar.DAY_OF_MONTH) == 22

        val textView2: TextView = findViewById(R.id.textView2)


        var day:Long
        if(birthday.timeInMillis < today.timeInMillis){
            birthday.set(todY+1,6,23,0,0,0)
            //何日か調べる
            day = birthday.timeInMillis-today.timeInMillis
        }else{

            //何日か調べる
            day = birthday.timeInMillis-today.timeInMillis
        }
        day=day/1000/60/60/24
        var moji:String = "誕生日まであと"+day+"日です"
        textView2.text=moji
    }
}
