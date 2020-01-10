import java.io.*;
import java.util.Scanner;

public class MidtermAct03 {
	public static void main (String[] args) {
		try {
			File x = new File("phonebook.txt");
			Scanner scan = new Scanner(x);
			String str = "";

			while(scan.hasNext()) {
				str = scan.next();
				if (str.equals("1001-11")) {
					System.out.println("Code has Found!");
					System.out.println("Code: " +str);
					System.out.println("Firstname : "+scan.next()); 
					System.out.println("Secondname : "+scan.next());
					System.out.println("CP : "+scan.next());
					break;
				}
			}
			scan.close();
		} catch(Exception e ) {
			System.out.print("error");
		}
	}
}