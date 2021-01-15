package genericpractice1;

public class Maximumcheck {
	//UC1 Find The Maximum Of 3 Integer
	public Integer maximumValue(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		} if (z.compareTo(max) > 0) {
			max = z;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}