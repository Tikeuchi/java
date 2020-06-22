package question12_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import question12_1.Item;

public class ItemsDAO {
	public static ArrayList<Item> findByMinimumPrice(int i) {
		// (1) ドライバクラスを指定
		try {
			// h2ドライバを指定
			Class.forName("");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		// (2) Connectionオブジェクトを初期化
		Connection con = null;
		// (3) データベースに接続
		try {
			// 接続先のデータベースを指定
			con = DriverManager.getConnection("");
			// prepareStatementメソッドでSQL文を用意
			PreparedStatement pstmt = con.prepareStatement("");
			// SQLに挿入する値を用意
			pstmt.setInt();
			// SQLの実行結果を保存
			ResultSet rs;
			// Itemを格納するArrayListを用意
			ArrayList<Item> items = new ArrayList<Item>();
			// SQLの実行結果を処理
			while() {
				// itemインスタンスを用意
				Item item = new Item();
				// 1行分の情報をインスタンスに変換
				item.setName();
				item.setPrice();
				item.setWeight();
				// インスタンスをArrayListに格納

			}
			// SQLの実行を終了
			rs.close();
			pstmt.close();
			// SQLの結果を返す
			return ;
		// (4) 例外処理
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		// (5) 必ず行う処理
		} finally {
			// Connectionオブジェクトがある（nullではない）場合
			if() {
				try {
					// データベースを終了

				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
