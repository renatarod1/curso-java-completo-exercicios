package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> counting = new HashMap<>();

		System.out.println("Enter a full path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] key = line.split(",");
				String name = key[0];
				Integer votesToAdd = Integer.parseInt(key[1]);

				if (counting.containsKey(name)) {
					int previousVotes = counting.get(name);
					counting.put(name, votesToAdd + previousVotes);
				} else {
					counting.put(name, votesToAdd);
				}
				line = br.readLine();
			}

			for (String key : counting.keySet()) {
				System.out.println(key + ": " + counting.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
