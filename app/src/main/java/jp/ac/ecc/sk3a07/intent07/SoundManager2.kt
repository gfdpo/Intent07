package jp.ac.ecc.sk3a07.intent07

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool

//コンストラクタで効果音の読み込み
class SoundManager2(context: Context) {
    //効果音を鳴らす
    private val mSoundPool : SoundPool

    companion object{
        val Cat1 = 0
        val Dog1 = 0

        //利用する効果音を列挙する
        private val SoundList = intArrayOf(R.raw.cat_cry1)
    }

    //効果音のテーブル
    private val mSoundTable = IntArray(SoundList.size)

    init{
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
            .build()
        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(2)
            .build()

        //SoundPoolを使って効果音をロードし戻り値のIDをmSoundTableに保存する
        for(i in SoundList.indices){
            mSoundTable[i] = mSoundPool.load(context, SoundList[i],1)
        }
    }
    //効果音の発生
    fun play(no:Int, vol:Int){
        if (no<0 || no>=mSoundTable.size){
            return
        }
        val fvol = (vol/100).toFloat()

        mSoundPool.play(mSoundTable[no],fvol,fvol,0,0,1.0f)
    }
    //効果音の解放
    fun release(){
        //読み込まれていた効果音を開放する
        for(i in mSoundTable.indices){
            mSoundPool.unload(mSoundTable[i])
        }
        mSoundPool.release()
    }
}