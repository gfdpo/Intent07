package jp.ac.ecc.sk3a07.intent07

import android.app.ListActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class ListMain:ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_main)

        //日付の一覧を元にArrayAdapterを生成する
        val adapter = SimpleAdapter(
            this,
            selectDays(),
            android.R.layout.simple_list_item_2,
            arrayOf("main","sub"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
            )
        //ArrayAdapterをリストに設定
        listView.adapter = adapter
    }

    //今月の日付の一覧をリストにして返却するselectDaysメソッド
    private fun selectDays():List<Map<String,String>>{
        val ret = ArrayList<Map<String,String>>()

        //日付を成型出力するためのフォーマット生成
        val fmt = SimpleDateFormat( "MM/dd")
        //今日のカレンダー取得
        val cal = Calendar.getInstance()
        //月の最大日数分だけ繰り返す
        val maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH)
        for(i in 0 until maxday){
            val map = HashMap<String,String>()
            cal.set(Calendar.DAY_OF_MONTH, i+1)
            //成型した日付の文字列をリストに追加する
            val datestr = fmt.format(cal.time)

            map.put("main",datestr)
            map.put("sub","一円貯金"+(i+1)+"円")

            ret.add(map)
        }
        return ret
    }
}