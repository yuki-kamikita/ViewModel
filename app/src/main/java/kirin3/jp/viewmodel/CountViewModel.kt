package kirin3.jp.viewmodel

import android.arch.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    // companion objectにするとCountViewModelのインスタンスから外れた独立したインスタンスとして作成され、
    // 別々の場所から同一にアクセスできる
    companion object {
        // ViewModelに属するカウンター
        var counterB: Int = 0
    }
}