package question5_1;

// (1) StrongBoxというジェネリッククラスを定義
public class StrongBox<E> {
	// (2) 型が未定のインスタンスを用意
	private E item;
	// (3) インスタンスを保存するputメソッドを作成
	public void put(E i) {
		this.item = i;
	}
	// (4) インスタンスを取得するgetメソッドを作成
	public E get() {
		return this.item;
	}
}
