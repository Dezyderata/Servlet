package test;

import static org.junit.Assert.*;

import org.junit.Test;

import credit.Count;
import credit.MyForm;

public class CountDecreaseTest {
	@Test
	 public void testCountDecreaseTotal1000000_10_20L() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(1000000);
		form.setFixedFee(4166.67);
		form.setNumberOfInstallments(240);
		form.setPercent(10);
		Count count = new Count(form);
		count.CountAns();
		assertEquals("1000000.00", count.returnArray().get(0).getCapital());
		assertEquals("12500.00", count.returnArray().get(0).getTotalSumOfInstallment());
		assertEquals("4305.55", count.returnArray().get(236).getTotalSumOfInstallment());
		assertEquals("4201.39", count.returnArray().get(239).getTotalSumOfInstallment());
	 }
	@Test
	 public void testCountDecreaseTotal1000000_3_12L() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(1000000);
		form.setFixedFee(6944.44);
		form.setNumberOfInstallments(144);
		form.setPercent(3);
		Count count = new Count(form);
		count.CountAns();
		assertEquals("1000000.00", count.returnArray().get(0).getCapital());
		assertEquals("9444.44", count.returnArray().get(0).getTotalSumOfInstallment());
		assertEquals("6961.80", count.returnArray().get(143).getTotalSumOfInstallment());
	 }
	@Test
	 public void testCountDecreaseTotal500_10_12() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(500);
		form.setFixedFee(41.66);
		form.setNumberOfInstallments(12);
		form.setPercent(10);
		Count count = new Count(form);
		count.CountAns();
		assertEquals("500.00", count.returnArray().get(0).getCapital());
		assertEquals("45.83", count.returnArray().get(0).getTotalSumOfInstallment());
		assertEquals("42.35", count.returnArray().get(10).getTotalSumOfInstallment());
	 }
	@Test
	 public void testCountDecreaseTotal500_50_1() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(500);
		form.setFixedFee(500);
		form.setNumberOfInstallments(1);
		form.setPercent(50);
		Count count = new Count(form);
		count.CountAns();
		assertEquals("500.00", count.returnArray().get(0).getCapital());
		assertEquals("520.83", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
	@Test
	 public void testCountDecreaseTotal500_1_1() {
		MyForm form = new MyForm();
		form.setAmountOfCredit(500);
		form.setFixedFee(500);
		form.setNumberOfInstallments(1);
		form.setPercent(1);
		Count count = new Count(form);
		count.CountAns();
		assertEquals("500.00", count.returnArray().get(0).getCapital());
		assertEquals("500.42", count.returnArray().get(0).getTotalSumOfInstallment());
	 }
}
