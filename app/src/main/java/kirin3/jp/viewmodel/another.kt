package kirin3.jp.viewmodel

// シングルトン（統一インスタンス）実験用
class another {

    val viewModel = CountViewModel
    fun countup(){
        viewModel.counterB++
    }
}