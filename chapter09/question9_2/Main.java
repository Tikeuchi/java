package question9_2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) {
		// (1) 圧縮元ファイル名と圧縮先ファイルを示す、2つの引数を取得
		String inFile = args[0];
		String outFile = args[1];
		// (2) クラスの初期化
		FileInputStream fis = null;
		GZIPOutputStream gzos = null;
		// (3) try-catch文でファイル圧縮の処理を実行
		try {
			// それぞれの値をセット
			fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			// ファイル圧縮の処理
			int i = fis.read();
			while(i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			// ファイル圧縮を終了
			gzos.flush();
			gzos.close();
			fis.close();
		// (4) 例外が発生した場合の処理
		} catch(IOException e) {
			// ファイルの操作に失敗したメッセージを表示
			System.out.println("ファイル操作に失敗しました");
			try {
				// ファイル圧縮を終了
				if(fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			} catch(IOException ee) { } // 何もしない
		}
	}
}
