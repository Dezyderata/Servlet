package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.MyForm;
import credit.Validation;

public class ValidationFixedFeeTest {

	 @Test
	 public void testFixedFee0() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(0);
		 form.setNumberOfInstallments(1);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkFixedFee();
		 assertEquals("Opłata stała nie może być mniejsza niż 1 i większa niż2000.0/1", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testFixedFee_1() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(-1);
		 form.setNumberOfInstallments(1);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkFixedFee();
		 assertEquals("Opłata stała nie może być mniejsza niż 1 i większa niż2000.0/1", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testFixedFee500000() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(1000000);
		 form.setFixedFee(500000);
		 form.setNumberOfInstallments(100);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkFixedFee();
		 assertEquals("Opłata stała nie może być mniejsza niż 1 i większa niż1000000.0/100", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testFixedFee10() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(200);
		 form.setFixedFee(10);
		 form.setNumberOfInstallments(2);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkFixedFee();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
	 @Test
	 public void testFixedFee1000() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(40000);
		 form.setFixedFee(1000);
		 form.setNumberOfInstallments(20);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkFixedFee();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
}
