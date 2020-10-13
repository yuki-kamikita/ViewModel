package kirin3.jp.viewmodel

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Activityで変数を用意し、値を保存する
    // 画面回転等でActivityを起動し直すたびに値がリセットされる
    private var counterA = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // viewModelにアクセスするためにインスタンスを作成
        // arch.lifecycle.ViewModelProvidersは最新版では非推奨なので修正する必要あり
        val viewModel: CountViewModel = ViewModelProviders.of(this).get(CountViewModel::class.java)

        // ボタンを押すとカウントアップ
        button.setOnClickListener {
            counterA++
            viewModel.counterB++

            text1.text = counterA.toString()
            text2.text = viewModel.counterB.toString()
        }

    }
}
