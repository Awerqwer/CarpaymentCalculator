package pkgCalculator;

public class CarPayment {

	private double TotalPrice;
	private double DP;
	private int LL;
	private double IR;
	
	public CarPayment(double Totalprice, double dP, int lL, double iR){
		super();
		TotalPrice = Totalprice;
		DP = dP;
		LL = lL;
		IR = iR;
	}
		
		public double getTotalPrice() {
			return TotalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			TotalPrice = totalPrice;
		}

		public double getDP() {
			return DP;
		}

		public void setDP(double dP) {
			DP = dP;
		}

		public int getLL() {
			return LL;
		}

		public void setLL(int lL) {
			LL = lL;
		}

		public double getIR() {
			return IR;
		}

		public void setIR(double iR) {
			IR = iR;
		}

		public double MP() {
			return (double)((TotalPrice-DP)*(1+IR/100)/LL);
		}
		public double TI() {
			return (double)
		}
}
