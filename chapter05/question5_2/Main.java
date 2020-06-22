package question5_2;

/*
 * 動作確認用のMainクラス
 */

public class Main {
	public static void main(String[] args) {
		// 鍵の種類がPADLOCKの金庫StrongBox
		StrongBox<String> sb = new StrongBox<String>(KeyType.PADLOCK);
		// 金庫StrongBoxに"Money"を入れる
		sb.put("Money");
		// 金庫StrongBoxから中身を取り出す
		String item = "";
		for(int i = 1; i <= 1024; i++) {
			System.out.println("試行回数: " + i);
			item = sb.get();
		}
		System.out.println(item);
	}
}
