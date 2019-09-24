package jp.ac.ecc.sk3a07.intent07


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Calc0 : AppCompatActivity() {
    var calcflg = false
    //Calculateクラスの実体を作成
    var mCalculater = Calculate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val textView1: TextView = findViewById(R.id.textView1)
        textView1.setText("0")

        //クリアボタン
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            textView1.setText("0")
        }
        //０～９のボタン
        setView(R.id.button14)
        setView(R.id.button10)
        setView(R.id.button11)
        setView(R.id.button12)
        setView(R.id.button6)
        setView(R.id.button7)
        setView(R.id.button8)
        setView(R.id.button2)
        setView(R.id.button3)
        setView(R.id.button4)

        setCalc(R.id.button16)
        setCalc(R.id.button13)
        setCalc(R.id.button9)
        setCalc(R.id.button5)



        val plus: Button = findViewById(R.id.button16)

        val equal: Button = findViewById(R.id.button15)
        equal.setOnClickListener { v: View ->
            val btn = v as Button
            val input = btn.text.toString()
            val textvalue = textView1.text.toString()

            mCalculater.putInput(textvalue)
            textView1 . setText (mCalculater.putInput(input))

            calcflg = true
        }
    }
            //０～９ボタンの関数
            fun setView(buttonID: Int) {
                val button: Button = findViewById(buttonID)
                button.setOnClickListener { v: View ->

                    val textView1: TextView = findViewById(R.id.textView1)
                    val btn = v as Button
                    val input = btn.text.toString()
                    val textValue = textView1.text.toString()
                    //12文字制限
                    if (textValue.length < 12) {
                        if (textValue == "0" || calcflg == true) {
                            textView1.setText(input)
                            calcflg = false
                        } else {
                            textView1.setText(textValue + input)
                        }
                    }
                }
            }
    fun setCalc(buttonID:Int) {
        val mTextView1:TextView = findViewById(R.id.textView1)
        val button:Button = findViewById(buttonID)
        button.setOnClickListener { v: View ->
            val btn = v as Button
            val input = btn.text.toString()
            val textvalue = mTextView1.text.toString()

            mCalculater.putInput(textvalue)
            mCalculater.putInput(input)
            calcflg = true
        }
    }
        }
