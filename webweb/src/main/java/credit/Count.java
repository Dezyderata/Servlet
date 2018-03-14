package credit;

import java.util.ArrayList;

public class Count {
	private double sum;
	private double fixedFee;
	private double total;
	ArrayList<Answer> answer = new ArrayList<>();
	MyForm form = new MyForm();
	public Count(MyForm form) {
		this.form = form;
		this.sum = form.getAmountOfCredit();
		this.fixedFee = form.getFixedFee();
		
	}
	public void CountAns() {
		int i = 0;
		double intrest;
		while(i!=this.form.getNumberOfInstallments()) {
			Answer ans = new Answer();
			ans.setNumberOfInstallment(i+1);//rata
			ans.setFixedFee(fixedFee);//stala
			intrest = (sum*(form.getPercent()/100)/12);
			ans.setInterest(intrest);//odsetki
			ans.setCapital(sum);//kapital
			total = fixedFee+intrest;
			ans.setTotalSumOfInstallment(total);
			sum-=fixedFee;
			++i;
			answer.add(ans);
		}
	}
	public void countEqualAns() {
		int i = 0;
		double intrest;
		double q = 1+(form.getPercent()/100)/12;
		double n = form.getNumberOfInstallments();
		total = sum * Math.pow(q, n) * (q-1) / (Math.pow(q, n)-1);
		sum = total * form.getNumberOfInstallments();
		while(i!=this.form.getNumberOfInstallments()) {
			Answer ans = new Answer();
			ans.setNumberOfInstallment(i+1);
			ans.setCapital(sum);
			ans.setTotalSumOfInstallment(total);
			sum -= total;
			++i;
			answer.add(ans);
		}
	}
	
	public ArrayList<Answer> returnArray(){
		return this.answer;
	}
}
