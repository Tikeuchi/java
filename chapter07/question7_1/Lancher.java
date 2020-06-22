package question7_1;

import java.lang.reflect.Method;

public class Lancher {
	public static void main(String[] args) {
		// (1) 起動すべきクラスのFQCNと起動仕方を示す文字、2つの引数を取得
		String fqcn = args[0];
		String sw = args[1];
		// (2) 実行前に現在のメモリ使用量を表示
		showMemory();
		// try-catch文で実行
		try {
			// (3) FQCNのクラスが持つ、すべてのメソッドを表示
			Class<?> clazz = Class.forName(fqcn);
			listMethods(clazz);
			// (4) 第二引数を判定
			if(sw.equals("E")) {
				// Eの場合
				launchExternal(clazz);
			} else if(sw.equals("I")) {
				// Iの場合
				launchInternal(clazz);
			} else {
				// それ以外
				throw new IllegalArgumentException("起動方法の指定が不正です.");
			}
		// 例外処理
		} catch(Exception e) {
			// 例外メッセージを表示
			System.out.println(e.getMessage());
			e.printStackTrace();
			// 起動に失敗、終了コード1を返す
			System.exit(1);
		}
		// (5) 現在のメモリ使用量を表示
		showMemory();
		// (6) 起動に成功、終了コード0を返す
		System.exit(0);
	}

	// メソッドの一覧を表示する
	public static void listMethods(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示します.");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}

	// Eの場合のメソッド
	public static void launchExternal(Class<?> clazz) throws Exception {
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process proc = pb.start();
		proc.waitFor();
	}

	// Iの場合のメソッド
	public static void launchInternal(Class<?> clazz) throws Exception {
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null, (Object)args);
	}

	// 現在のメモリ使用量を表示する
	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long usage = (total - free) / 1024 / 1024;
		System.out.println("現在のメモリ使用量: " + usage + "MB");
	}
}
