package question11_2;

import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String[] args) throws Exception {
		// (1) Socketクラスで接続先を指定
		Socket sock = new Socket("smtp.example.com", 60025);
		// (2) メール本文の作成
		OutputStream os = sock.getOutputStream();
		// 行ごとに書き込む
		os.write("HERO example.com\r\n".getBytes());
		os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
		os.write("RCPT TO: minato@example.com\r\n".getBytes());
		os.write("DATA\r\n".getBytes());
		os.write("From: asaka@example.com\r\n".getBytes());
		os.write("Subject: Please send me your RPG\r\n".getBytes());
		os.write("Hello minato. I would like to play your RPG.\r\n".getBytes());
		os.write("Could you please send it to me ?\r\n".getBytes());
		os.write(".\r\n".getBytes());
		os.write("QUIT\r\n".getBytes());
		// (3) 書き込みを終了
		os.flush();
		// (4) 通信を終了
		sock.close();
	}
}
