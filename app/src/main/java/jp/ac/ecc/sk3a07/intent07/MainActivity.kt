package jp.ac.ecc.sk3a07.intent07

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{
            //課題1を呼び出すintent生成
            val intent = Intent(this, Hello01::class.java)
            //intent呼び出しを実行
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            //課題2を呼び出すintent生成
            val intent = Intent(this, Event02::class.java)
            //intent呼び出しを実行
            startActivity(intent)
        }



        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            //課題4を呼び出すintent生成
            val intent = Intent(this, Calc0::class.java)
            //intent呼び出しを実行
            startActivity(intent)
        }



        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{
            //課題6を呼び出すintent生成
            val intent = Intent(this, Mainlist::class.java)
            //intent呼び出しを実行
            startActivity(intent)
        }
    }
}

//val button3: Button = findViewById(R.id.button3)
//button3.setOnClickListener{
//    //課題3呼び出すintent生成
//    val intent = Intent(this, EventW3::class.java)
//    //intent呼び出しを実行
//    startActivity(intent)
//}
//
//val button5: Button = findViewById(R.id.button5)
//button5.setOnClickListener{
//    //課題5を呼び出すintent生成
//    val intent = Intent(this, CalcWork05::class.java)
//    //intent呼び出しを実行
//    startActivity(intent)
//}