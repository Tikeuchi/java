package question1_1;

public class Main {
	public static void main(String[]  args) {
		// (1) StringBuilderクラスのインスタンスを用意
		StringBuilder sb = new StringBuilder();
		// (2) for文で1から100までの整数をカンマで連結
		for(int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		// (3) 連結した文字列をString文字列sに代入
		String s = sb.toString();
		// (4) 文字列sをカンマで分割し、String配列aに格納
		String[] a = s.split(",");
	}
}
