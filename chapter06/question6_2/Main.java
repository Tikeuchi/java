package question6_2;

// (1) インターフェースFunc1を定義
interface Func1 {
	boolean call(int x);
}
// (2) インターフェースFunc2を定義
interface Func2 {
	String call(boolean male, String name);
}
// (3) Mainクラスを作成
public class Main {
	public static void main(String[] args) {
		// FuncListの内容をラムダ式で表現
		Func1 f1 = x -> x % 2 == 1;
		Func2 f2 = (male, name) -> {
			if (male == true) { return "Mr." + name; }
			else { return "Ms." + name; }
		};
		// インターフェースを実行して、その結果を表示
		System.out.println(f1.call(15));
		System.out.println(f2.call(true, "Smith"));
	}
}
