import java.io.*;

public class Prelimact02 {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
			int fdata = 0, col = 0;
			String sdata = "", firstname = "", lastname = "", cellphone = "";
			boolean x = false;
			while ((fdata = in.read())!=-1) {
				String y = String.valueOf((char)fdata);
				sdata = sdata.concat(y);
				if (fdata =='\n') {
					sdata = "";
					col = 0;
				}
				if (fdata ==  ':') {
					col++;
				}
				if (sdata.equals("1001-11")) {
					System.out.println("We've found the record!");
					x = true;
				}
				if (x == true && fdata !=':') {
					if (col == 1) firstname = firstname.concat(String.valueOf((char)fdata));
					if (col == 2) lastname = lastname.concat(String.valueOf((char)fdata));
					if (col == 3) cellphone = cellphone.concat(String.valueOf((char)fdata));
				}
				if (x == true && fdata =='\n') x =false;
			}in.close();
			System.out.println("Firstname : "+firstname);
			System.out.println("Lastname  : "+lastname);
			System.out.println("Cp        : "+ cellphone);
		}  catch(Exception e) {
			System.out.println("error");
		}
	}
}