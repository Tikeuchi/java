package question9_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) コピー元ファイル名とコピー先ファイル名を示す、2つの引数を取得
		String inFile = args[0];
		String outFile = args[1];
		// (2) FileInputStreamクラスとFileOutputStreamクラスにセット
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		// (3) ファイル読み書きの処理
		int i = fis.read();
		while(i != -1) {
			fos.write(i); i = fis.read();
		}
		// (4) ファイル読み書きを終了
		fos.flush();
		fos.close();
		fis.close();
	}
}
