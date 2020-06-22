package question6_2;

// (1) インターフェースFunc1を定義
interface Func1 {
	boolean call();
}
// (2) インターフェースFunc2を定義
interface Func2 {
	String call();
}
// (3) Mainクラスを作成
public class Main {
	public static void main(String[] args) {
		// FuncListの内容をラムダ式で表現
		Func1 f1;
		Func2 f2;
		// インターフェースを実行して、その結果を表示
		System.out.println();
		System.out.println();
	}
}
