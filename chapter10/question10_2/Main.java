package question10_2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) Employeeクラスのインスタンスを用意し、名前と年齢を格納
		Employee tanaka;
		tanaka.name;
		tanaka.age;
		// (2) Departmentクラスのインスタンスを用意し、部署とリーダーの情報を格納
		Department soumubu;
		soumubu.name;
		soumubu.leader;
		// (3) オブジェクトファイルを書き込む場所を指定
		FileOutputStream fos = new FileOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream();
		// (4) ファイル書き込みの処理
		oos.writeObject();
		// (5) ファイル書き込みを終了
		oos.flush();
		oos.close();
	}
}

