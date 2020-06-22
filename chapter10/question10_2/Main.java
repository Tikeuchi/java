package question10_2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) Employeeクラスのインスタンスを用意し、名前と年齢を格納
		Employee tanaka = new Employee();
		tanaka.name = "田中一郎";
		tanaka.age = 41;
		// (2) Departmentクラスのインスタンスを用意し、部署とリーダーの情報を格納
		Department soumubu = new Department();
		soumubu.name = "総務部";
		soumubu.leader = tanaka;
		// (3) オブジェクトファイルを書き込む場所を指定
		FileOutputStream fos = new FileOutputStream("C:\\javatest\\company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// (4) ファイル書き込みの処理
		oos.writeObject(soumubu);
		// (5) ファイル書き込みを終了
		oos.flush();
		oos.close();
	}
}

