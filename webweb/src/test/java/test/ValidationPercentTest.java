package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.MyForm;
import credit.Validation;

public class ValidationPercentTest {
	 @Test
	 public void testCheckPercent0() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000000);
		 form.setFixedFee(3895);
		 form.setNumberOfInstallments(341);
		 form.setPercent(0);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("Oprocentowanie kredytu powinno przyjmować wartości z zakresu: 0.01% - 50%. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckPercent51() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(341);
		 form.setPercent(51);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("Oprocentowanie kredytu powinno przyjmować wartości z zakresu: 0.01% - 50%. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckPercent151() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(341);
		 form.setPercent(151);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("Oprocentowanie kredytu powinno przyjmować wartości z zakresu: 0.01% - 50%. ", validation.getProblem());
		 assertEquals(0, validation.getAns());
	 }
	 @Test
	 public void testCheckPercent15() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(341);
		 form.setPercent(15);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
	 @Test
	 public void testCheckPercent0_01() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(341);
		 form.setPercent(0.01);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
	 @Test
	 public void testCheckPercent50() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(2000);
		 form.setFixedFee(33);
		 form.setNumberOfInstallments(341);
		 form.setPercent(50);
		 Validation validation = new Validation(form);
		 validation.checkPercent();
		 assertEquals("", validation.getProblem());
		 assertEquals(1, validation.getAns());
	 }
}
