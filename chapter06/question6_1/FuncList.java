package question6_1;

public class FuncList {
	// 年齢が奇数ならtrueを返すメソッド
	public static boolean isOdd(int x) { return (x % 2 == 1); }
	// 性別が男性なら"Mr."を、女性なら"Ms."を名前の頭に付けて返すメソッド
	public String addNamePrefix(boolean male, String name) {
		if (male == true) { return "Mr." + name; }
		else { return "Ms." + name; }
	}
}
