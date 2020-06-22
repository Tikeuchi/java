package question11_1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) 画像ファイルのURLを指定し、その内容を取得
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		InputStream is = url.openStream();
		// (2) 画像ファイルを書き込む場所とファイル名を指定
		OutputStream os = new FileOutputStream("C:\\Users\\re-kailum1907\\Pictures\\googlelogo.png");
		// (3) ファイル書き込みの処理
		int i = is.read();
		while(i != -1) {
			os.write((byte) i);
			i = is.read();
		}
		// (4) ファイル書き込みを終了
		is.close();
		os.flush();
		os.close();
	}
}
