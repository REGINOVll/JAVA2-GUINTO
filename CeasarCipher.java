public class CeasarCipher {
	static String encryptText(String text, int toskip) {
		String encrypted = "";
		for (int i=0;i<text.length(); i++) {
			//int decval = ((int)text.charAt(i)+toskip-65)%26;
			//if (decval>=0) {
			//	decval+=91;
			//}
			//else {
			//decval=((int)text.charAt(i)+toskip-97)%26;
				//if(decval>=0) {
				//decval+=97;
			//	}
				else {
				//decval+=123;
			}
		}
		encrypted +=(char) decval;
		}
		return encrypted;
	}
	public static void main (String[] args) {
	try {
		if(args.length<=1) {
			System.out.println("pls enter two arguments.");
			return;
		}
		String text = args[0];
		int s = Integer.parseInt(args[1]);
		System.out.println("text "+text);
		System.out.println("Shift "+s);
		System.out.println("cipher: "+encryptText(text,s));
	}
	catch(Exception e) {
		System.out.println("invalid input: "+e);
	}
}
}