package question1_2;

/*
 * 動作確認用のMainクラス
 */

public class Main {
	public static void main(String[] args) {
		Link link1 = new Link();
		Link link2 = new Link();
		String l1 = link1.concatPath("c:\\javadev", "readme.txt");
		String l2 = link2.concatPath("c:\\user\\", "readme.txt");
		System.out.println(l1);
		System.out.println(l2);
	}
}
