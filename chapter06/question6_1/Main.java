package question6_1;

// (1) インターフェースFunc1を定義
interface Func1 {
	// Func1のcallメソッドで年齢を渡す
	boolean call();
}
// (2) インターフェースFunc2を定義
interface Func2 {
	// Func2のcallメソッドで性別と名前を渡す
	String call();
}
// (3) Mainクラスを作成
public class Main {
	public static void main(String[] args) {
		// FuncListを呼び出して、インターフェースにセット
		FuncList funclist = new FuncList();
		Func1 f1;
		Func2 f2;
		// インターフェースを実行して、その結果を表示
		System.out.println();
		System.out.println();
	}
}
