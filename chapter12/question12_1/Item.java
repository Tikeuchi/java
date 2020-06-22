package question12_1;

public class Item {
	// (1) アイテムの内容を格納するフィールドを用意
	private String name;
	private int price;
	private int weight;
	// (2) 全フィールドのgetter/setterを用意
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
