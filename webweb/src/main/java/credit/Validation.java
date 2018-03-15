package credit;

public class Validation {
	MyForm form = new MyForm();
	private int ans = 1;
	private String problem = "";
	public Validation(MyForm form) {
		this.form = form;
	}
	public void doValidation() {
		checkCredit();
		checkPercent();
		checkInstallments();
		checkFixedFee();
	}
	public void checkCredit() {
		if(this.form.getAmountOfCredit() < 500) {
			setAns(0);
			setProblem("Kwota kredytu powinna być większa niż: 500. ");
		}
	}
	public void checkPercent() {
		if(this.form.getPercent() < 0.01 || this.form.getPercent() > 50) {
			setAns(0);
			setProblem("Oprocentowanie kredytu powinno przyjmować wartości z zakresu: 0.01% - 50%. ");
			
		}		
	}
	public void checkInstallments() {
		if(this.form.getNumberOfInstallments() < 1 || this.form.getNumberOfInstallments() > 600) {
			setAns(0);
			setProblem("Liczba rat powinna przyjmować wartości z zakresu: 1 - 600. ");
		}
	}
	public void checkFixedFee() {
		if(this.form.getFixedFee() <= 0 || this.form.getFixedFee() > (form.getAmountOfCredit() / this.form.getNumberOfInstallments())){
			setAns(0);
			setProblem("Opłata stała nie może być mniejsza niż 1 i większa niż" + this.form.getAmountOfCredit()+"/"+this.form.getNumberOfInstallments());
		} 
		
	}
	public int getAns() {
		return ans;
	}
	public void setAns(int ans) {
		this.ans = ans;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem += "" + problem;
	}
}
