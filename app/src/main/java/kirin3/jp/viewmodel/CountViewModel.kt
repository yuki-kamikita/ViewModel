package kirin3.jp.viewmodel

import android.arch.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    // ViewModelで変数を用意し、値を保存する
    // 画面回転等でActivityを起動しても値が保持される
    var counterB: Int = 0

}