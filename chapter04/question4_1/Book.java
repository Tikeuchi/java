package question4_1;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;
	// (1) HashSetに格納する処理
	public int hashCode() {
		int r = 1;
		r = 31 * r + /* 発行日をハッシュ化したもの */;
		r = 31 * r + /* 書名をハッシュ化したもの */;
		return r;
	}
	// (1) 書名と発行日が同じであるか判定する
	public boolean equals(Object o) {
		// そのオブジェクトが自分自身ならtrue
		if( /* 条件を記述 */ ) {
			return true;
		}
		// そのオブジェクトがnullならfalse
		if( /* 条件を記述 */ ) {
			return false;
		}
		// そのオブジェクトがBookクラスのインスタンスでなければfalse
		if( /* 条件を記述 */ ) {
			return false;
		}
		Book b = (Book) o;
		// 発行日が同じでなければfalse
		if( /* 条件を記述 */ ) {
			return false;
		}
		// 書名が同じでなければfalse
		if( /* 条件を記述 */ ) {
			return false;
		}
		// 全ての条件をクリアしたらtrue
		return true;
	}
	// (2) Bookインスタンスの発行日をcompareToメソッドで比較する
	public int compareTo(Book o) {
		return ;
	}
	// (3) clone()を呼び出すと、深いコピーによる複製が行われる
	public Book clone() {
		Book b = new Book();



		return b;
	}
	// フィールド宣言、getter/setterの宣言は省略
}
