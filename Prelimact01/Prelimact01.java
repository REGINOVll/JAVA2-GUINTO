import java.io.*;

public class Prelimact01try {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("Phonebook.txt"));
			String data = "";
			while ((data = in.readLine()) !=null) {
				System.out.println(data.toString());
			}
			in.close();
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}