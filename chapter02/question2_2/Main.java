package question2_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// (1) 現在の日時をLocalDate型で取得
		LocalDate now = LocalDate.now();
		// (2) 取得した値に100を足した値を用意
		LocalDate future = now.plusDays(100);
		// (3) 指定された形式で表示
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(f));
	}
}
