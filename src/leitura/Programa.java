package leitura;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class Programa {

	public static void main(String[] args) {

		String path = new String("c:\\temp\\in.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		} finally {
			try {
				if (br != null) {
				}
				br.close();

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
