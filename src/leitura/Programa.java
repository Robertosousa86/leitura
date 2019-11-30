package leitura;

import java.io.*;

public class Programa {

	public static void main(String[] args) {

		String path = new String("c:\\temp\\in.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}
}