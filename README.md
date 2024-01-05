##インターフェース　
クラスがどのようなメソッドを持っているかあらかじめ定義するもの。クラスとは異なり、具体的な処理内容は記述せず、メソッドの引数や戻り値だけを定義する。
##メリット
###ポリモーフィズム（多様性）の実現　　
メソッドの呼び出し方法を共通化し、さらにオーバーライドさせることで同じメソッドを呼び出しても、実際のインスタンス毎にその挙動を変化させることができる。　　
###実装漏れ防止
インタフェース内で定義したメソッドを継承先で実装しないとエラーになるので実装漏れを防ぐことができる。　　
　→そのため最初に必要なメソッドと引数を検討してインタフェース内に記述しておくといい。
###多重継承　　
複数のインターフェースを実装し、そのインターフェースを利用してクラスを作ることができる。
