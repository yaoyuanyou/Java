package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Mercury.txt");

		BufferedReader br = new BufferedReader(fr);

		String line = null;

		while ((line = br.readLine()) != null) {
			int sum = 0;
			for (String str : line.split("\t")) {
				if (str.isBlank()) {
					continue;
				} else {
					sum += Integer.parseInt(str);
				}

			}
			if (sum == 0) {
				continue;
			} else {
				System.out.println(sum);
			}
		}

		br.close();

	}
}
