package question5_2;

//(1) StrongBoxというジェネリッククラスを定義
public class StrongBox<E> {
	// (2) 鍵の種類を示すKeyTypeのフィールドを用意
	private KeyType keyType;
	// (3) 型が未定のインスタンスを用意
	private E item;
	// (4) 施行回数をカウントするlong型の変数を用意
	private long count;
	// (5) StrongBoxのKeyTypeを取得するコンストラクタを作成
	public StrongBox (KeyType key) {

	}
	// (6) インスタンスを保存するメソッドを作成
	public void put(E i) {

	}
	// (7) インスタンスを取得するメソッドを作成
	public E get() {
		// 試行回数をカウント
		this.count++;
		// switch-case文で鍵の種類を判別し、必要施行回数に到達していなければnullを返して終了
		switch(this.keyType) {
		case PADLOCK:
			if (count < 1024) return null;
			break;
		case BUTTON:
			if (count < 10000) return null;
			break;
		case DIAL:
			if (count < 30000) return null;
			break;
		case FINGER:
			if (count < 1000000) return null;
			break;
		}
		// switch-case文を抜けたら、施行回数をリセットしてインスタンスを返す
		this.count = 0;
		return ;
	}
}
