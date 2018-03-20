package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.Count;
import credit.MyForm;
import credit.Validation;

public class ValidationCreditTest {

	 @Test
	 public void testCheckCredit0() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(0);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(120);
		 form.setPercent(10);
		 Validation validation = new Validation(form);
		 validation.checkCredit();
		 assertEquals("Kwota kredytu powinna być większa niż: 500. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckCredit501() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(501);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(120);
		 form.setPercent(10);
		 Validation validation = new Validation(form);
		 validation.checkCredit();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
	 @Test
	 public void testCheckCredit499_99() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(499.99);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(120);
		 form.setPercent(10);
		 Validation validation = new Validation(form);
		 validation.checkCredit();
		 assertEquals("Kwota kredytu powinna być większa niż: 500. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }	 
	 @Test
	 public void testCheckCredit2000000() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000000);
		 form.setFixedFee(3895);
		 form.setNumberOfInstallments(341);
		 form.setPercent(10);
		 Validation validation = new Validation(form);
		 validation.checkCredit();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
}
