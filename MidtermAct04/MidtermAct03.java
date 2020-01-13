import java.io.*;
import java.util.Scanner;

public class MidtermAct04 {
	public static void main (String[] args) {
		try {
			File x = new File("phonebook.txt");
			Scanner scan = new Scanner(x);
			String str = "";

			while(scan.hasNext()) {
				str = scan.next();
				if (str.equals("1001-11")) {
					System.out.println("Code has Found!");
					break;
				}
			}
			scan.close();
			PrintWriter pw = new PrintWriter ("recordfound.txt");
			Scanner scan2 = new Scanner(x);
			while (scan2.hasNext()){
				String str2 = scan2.next();
				if(str.equals("1001-11")) {
					pw.println("Code: " + str);
					pw.println("Firstname: " + scan2.next());
					pw.println("Lastname: " + scan2.next());
					pw.println("CP #: " + scan2.next());
					break;
				}
			}
			pw.close();
			scan2.close();
		} catch(Exception e ) {
			System.out.print("error");
		}
	}
}