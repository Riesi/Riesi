import java.util.Scanner;
public class riesi {
	
	public static void main (String[] args) {
		System.out.println("Riesi: False");
		System.out.println("Riesi?");
		Scanner in = new Scanner(System.in);
		char inp = in.next().charAt(0);
		if(inp == 'y'){
			System.out.println("Riesi: True");
		}else if(inp == 'n'){
			System.out.println("Riesi: False");
		}
	}
}

