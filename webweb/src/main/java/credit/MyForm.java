package credit;

public class MyForm {
	private int numberOfInstallments;
	private double amountOfCredit, percent, fixedFee;
	public MyForm() {
	}
	public MyForm(int numberOfInstallments, double amountOfCredit, double percent, double fixedFee) {
		this.amountOfCredit = amountOfCredit;
		this.numberOfInstallments = numberOfInstallments;
		this.percent = percent;
		this.fixedFee = fixedFee;
	}
	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}
	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	public double getAmountOfCredit() {
		return amountOfCredit;
	}
	public void setAmountOfCredit(double amountOfCredit) {
		this.amountOfCredit = amountOfCredit;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public double getFixedFee() {
		return fixedFee;
	}
	public void setFixedFee(double fixedFee) {
		this.fixedFee = fixedFee;
	}
}
