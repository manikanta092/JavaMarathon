import java.util.Scanner;

public class SecretMessageDecodereApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		MessageDecoder decoder=new MessageDecoder();
		System.out.println(decoder.decodeCharacter(c));
	}
}
