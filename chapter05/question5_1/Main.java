package question5_1;

/*
 * 動作確認用のMainクラス
 */

public class Main {
	public static void main(String[] args) {
		StrongBox<String> sb = new StrongBox<String>();
		// 金庫StrongBoxに"Money"を入れる
		sb.put("Money");
		// 金庫StrongBoxから中身を取り出す
		String item = sb.get();
		System.out.println(item);
	}
}
