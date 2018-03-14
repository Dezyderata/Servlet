package credit;

public class Answer {
	private int numberOfInstallment;
	private String capital, interest, fixedFee, totalSumOfInstallment;
	java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
	/*kapital, kwota odsetek, oplata stala, calkowita kwota raty*/
	public Answer() {
	}
	public int getNumberOfInstallment() {
		return numberOfInstallment;
	}
	public void setNumberOfInstallment(int numberOfInstallment) {
		this.numberOfInstallment = numberOfInstallment;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = df.format(capital);
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = df.format(interest);
	}
	public String getFixedFee() {
		return fixedFee;
	}
	public void setFixedFee(double fixedFee) {
		this.fixedFee = df.format(fixedFee);
	}
	public String getTotalSumOfInstallment() {
		return totalSumOfInstallment;
	}
	public void setTotalSumOfInstallment(double totalSumOfInstallment) {
		this.totalSumOfInstallment = df.format(totalSumOfInstallment);
	}	
}
