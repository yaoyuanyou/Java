package assignment;

public class Marathon {

	static void best() {
		int index = 1;
		int indexSub = 0;
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		for (int i = 0; i < names.length; i++) {
			if (times[i] < times[index]) {
				indexSub = index;
				index = i;
			} else if (times[i] < times[indexSub]) {
				indexSub = i;
			}
		}
		System.out.println(names[index] + ": " + times[index]);
		System.out.println(names[indexSub] + ": " + times[indexSub]);
	}

	public static void main(String[] arguments) {
		best();
	}
}