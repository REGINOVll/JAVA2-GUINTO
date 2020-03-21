import java.util.*;

public class CaesarCipher2
{
	static String encryptText(String text, int toskip) {
		String encrypted="";
		for(int i=0; i<text.length(); i++) {
			int decval=0;
			if(Character.isUpperCase(text.charAt(i))) {
				decval = ((int) text.charAt(i) + toskip - 65) % 26;
				if(decval>=0) {
					decval +=65;
				}
				else {
					decval +=91;
				}				
			}
			else {
				decval = ((int) text.charAt(i) + toskip - 97) % 26;
				if(decval>=0) {
					decval +=97;
				}
				else {
					decval +=123;
				}
			}
			encrypted += (char)	decval;
		}
		return encrypted;
	}
	
	static String decryptText(String text, int toskip) {
		String decrypted="";
		for(int i=0; i<text.length(); i++) {
			int decval=0;
			if(Character.isUpperCase(text.charAt(i))) {
				decval = ((int) text.charAt(i) - toskip - 65) % 26;
				if(decval>=0) {
					decval +=65;
				}
				else {
					decval +=91;
				}				
			}
			else {
				decval = ((int) text.charAt(i) - toskip - 97) % 26;
				if(decval>=0) {
					decval +=97;
				}
				else {
					decval +=123;
				}
			}
			decrypted += (char)	decval;
		}
		return decrypted;
	}

	public static void main(String[] args) {
		try {
			Scanner get = new Scanner(System.in);
	
			int choice = 0;
			while(choice != 3) {
				//get.next();
				System.out.println("MENU");
				System.out.println("********************");
				System.out.println("1. Encrypt");
				System.out.println("2. Decrypt");
				System.out.println("3. Exit");
				System.out.print("Your choice: ");
				choice = get.nextInt();
				if(choice < 1 && choice >3) {
					System.out.println("Invalid choice!");
				}
				else {
					if(choice == 1) {
						System.out.print("Enter text to encrypt: ");
						get.nextLine();
						String text = get.nextLine();
						System.out.println(text);
						System.out.println("Cipher: " + encryptText(text, 5));
						System.out.println();
					}
					else if(choice == 2) {
						System.out.print("Enter text to decrypt: ");
						get.nextLine();
						String text = get.nextLine();
						System.out.println(text);
						System.out.println("Caesar: " + decryptText(text, 5));
						System.out.println();
					}
					else {
						break;
					}
				}
			}
		}
		catch (Exception e) {
			System.out.println("Invalid input: " + e);
		}
	}
}