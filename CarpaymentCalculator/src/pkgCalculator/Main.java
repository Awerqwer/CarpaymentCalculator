package pkgCalculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double TotalPrice;
		double DP;
		int LL;
		double IR;
		System.out.println("Please enter following datas in orders: Totalprice, Down payment, Length of loan, Interest rate for loan");
		TotalPrice = stdin.nextDouble();
		DP = stdin.nextDouble();
		LL = stdin.nextInt();
		IR = stdin.nextDouble();
		CarPayment c1 = new CarPayment(TotalPrice, DP, LL, IR);
		
		System.out.printf("Monthly car payment is: %f\n", c1.MP() );
		System.out.printf("Total spent on interest is: %f\n", c1.TI() );
		

	}

}
