import java.util.Scanner;
class is_prime
{
	String test(int x){
		if(x%2==0||x%3==0||x%5==0||x%7==0) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}
public class Class02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number:");
		int  i = scanner.nextInt();
		is_prime prime = new is_prime();
		System.out.println(prime.test(i));
	}
}
