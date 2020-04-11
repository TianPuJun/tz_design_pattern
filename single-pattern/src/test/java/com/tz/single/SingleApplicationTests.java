package com.tz.single;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingleApplicationTests {

	@Test
	public void HungryIdGeneratorTest() {
		HungryIdGenerator instance = HungryIdGenerator.getInstance();
		System.out.println(instance.getId());
		HungryIdGenerator i1 = HungryIdGenerator.getInstance();
		System.out.println(i1.getId());
	}

	@Test
	public void LazyIdGeneratorTest() {
		LazyIdGenerator instance = LazyIdGenerator.getInstance();
		System.out.println(instance.getId());
		LazyIdGenerator i1 = LazyIdGenerator.getInstance();
		System.out.println(i1.getId());
	}
	@Test
	public void doubleCheckIdGeneratorTest() {
		DoubleCheckIdGenerator instance = DoubleCheckIdGenerator.getInstance();
		System.out.println(instance.getId());
		DoubleCheckIdGenerator i1 = DoubleCheckIdGenerator.getInstance();
		System.out.println(i1.getId());
	}

	@Test
	public void innerIdGeneratorTest() {
		InnerIdGenerator instance = InnerIdGenerator.getInstance();
		System.out.println(instance.getId());
		InnerIdGenerator i1 = InnerIdGenerator.getInstance();
		System.out.println(i1.getId());
	}
	@Test
	public void enumIdGeneratorTest() {
		IdGeneratorEnum instance = IdGeneratorEnum.INSTANCE;
		System.out.println(instance.getId());
		IdGeneratorEnum i1 = IdGeneratorEnum.INSTANCE;
		System.out.println(i1.getId());
	}
}
