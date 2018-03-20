package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.MyForm;
import credit.Validation;

public class ValidationInstallmentsTest {
	 @Test
	 public void testCheckInstallments0() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(0);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkInstallments();
		 assertEquals("Liczba rat powinna przyjmować wartości z zakresu: 1 - 600. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckInstallments601() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(601);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkInstallments();
		 assertEquals("Liczba rat powinna przyjmować wartości z zakresu: 1 - 600. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckInstallments100000() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(100000);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkInstallments();
		 assertEquals("Liczba rat powinna przyjmować wartości z zakresu: 1 - 600. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckInstallments2() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(2);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkInstallments();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
	 @Test
	 public void testCheckInstallments532() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(532);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkInstallments();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }

}
