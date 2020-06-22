package question8_2;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {
	// フィールド宣言、getter/setterの宣言は省略
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}
	// clone()の記述はquestion4-1の内容と同じため省略
}
