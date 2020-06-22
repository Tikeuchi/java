package question10_1;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) FileReaderクラスで指定したファイルを読み込むようにセット
		Reader fr = new FileReader();
		// (2) Propertiesクラスのインスタンスを用意
		Properties p;
		// (3) FileReaderでセットしたファイルを読み込む
		p.load();
		// (4) 指定された形式で表示
		System.out.println();
		fr.close();
	}
}
