package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.Count;
import credit.MyForm;

public class CountEqualsTest {
	@Test
	 public void testCountEqualsTotal1000000_120_10L() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(1000000);
		form.setFixedFee(1);
		form.setNumberOfInstallments(120);
		form.setPercent(10);
		Count count = new Count(form);
		count.countEqualAns();
		assertEquals("13215.07", count.returnArray().get(119).getCapital());
		assertEquals("13215.07", count.returnArray().get(119).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal1000000_12_6L() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(1000000);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(6.0);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("86066.43", count.returnArray().get(11).getCapital());
		 assertEquals("86066.43", count.returnArray().get(11).getTotalSumOfInstallment());
	 }
	 @Test
	public void testCountEqualsTotal500_12_10L() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(10);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("43.96", count.returnArray().get(11).getCapital());
		 assertEquals("43.96", count.returnArray().get(11).getTotalSumOfInstallment());
	 }
	 @Test
	 	public void testCountEqualsTotal500_12_50L() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(50);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("53.79", count.returnArray().get(11).getCapital());
		 assertEquals("53.79", count.returnArray().get(11).getTotalSumOfInstallment());
	 }
	 @Test
		 public void testCountEqualsTotal1000000_12_6() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(1000000);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(6.0);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("1032797.16", count.returnArray().get(0).getCapital());
		 assertEquals("86066.43", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal1000000_120_1() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(1000000);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(120);
		 form.setPercent(1);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("1051249.46", count.returnArray().get(0).getCapital());
		 assertEquals("8760.41", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal1000000_120_10() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(1000000);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(120);
		 form.setPercent(10);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("1585808.84", count.returnArray().get(0).getCapital());
		 assertEquals("13215.07", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal500_1_1() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(1);
		 form.setPercent(1);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("500.42", count.returnArray().get(0).getCapital());
		 assertEquals("500.42", count.returnArray().get(0).getTotalSumOfInstallment());
		 
	 }
	 @Test
	 public void testCountEqualsTotal500_12_1() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(1);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("502.71", count.returnArray().get(0).getCapital());
		 assertEquals("41.89", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal500_12_10() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(10);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("527.50", count.returnArray().get(0).getCapital());
		 assertEquals("43.96", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	 @Test
	 public void testCountEqualsTotal500_12_50() {
		 MyForm form = new MyForm();
		 form.setAmountOfCredit(500);
		 form.setFixedFee(1);
		 form.setNumberOfInstallments(12);
		 form.setPercent(50);
		 Count count = new Count(form);
		 count.countEqualAns();
		 assertEquals("645.51", count.returnArray().get(0).getCapital());
		 assertEquals("53.79", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
}
