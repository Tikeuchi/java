package question11_2;

import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) Socketクラスで接続先を指定
		Socket sock;
		// (2) メール本文の作成
		OutputStream os = sock.getOutputStream();
		// 行ごとに書き込む
		os.write();


		// (3) 書き込みを終了
		os.flush();
		// (4) 通信を終了
		sock.close();
	}
}
