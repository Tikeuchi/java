package question3_3;

import java.util.HashMap;
import java.util.Map;

import question3_2.Hero;

public class Main {
	public static void main(String[] args) {
		// (1) 勇者2名（斎藤、鈴木）をHeroクラスのインスタンスとして用意
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		// (2) Mapコレクションを用意して、勇者の名前と倒した敵の数をペアで格納
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		// (3) for文で1つずつ順番に取り出して、勇者の名前と倒した敵の数を表示
		for(Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}
}
