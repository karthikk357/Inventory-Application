package com.inventory;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ItemCreatorTest {

	@Test
	public void test1() {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30);
		Date mfgDate = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 50);
		Date expDate = cal.getTime();

		ItemCreator itemCreator = new ItemCreator();                  
		
		itemCreator.create(mfgDate, expDate, "Dextirity Vest", "generic");
		
		assertThat(itemCreator,is(instanceOf(GenericItem.class)));
		
	}
	@Test
	public void Test2() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -10);
		Date mfgDate = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 40);
		Date expDate = cal.getTime();

		ItemCreator itemCreator = new ItemCreator();                  
		
		itemCreator.create(mfgDate, expDate, "AgedBrie", "aged");
		
		assertThat(itemCreator,instanceOf(AgedItem.class));
	}

	@Test
	public void Test3() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -10);
		Date mfgDate = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 40);
		Date expDate = cal.getTime();

		ItemCreator itemCreator = new ItemCreator();                  
		
		itemCreator.create(mfgDate, expDate, "Concert Backstage Passes", "event");
		
		assertThat(EventItem.class,instanceOf(ItemCreatorTest.class));
	}
	
	@Test
	public void Test4() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -10);
		Date mfgDate = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 40);
		Date expDate = cal.getTime();

		ItemCreator itemCreator = new ItemCreator();                  
		
		itemCreator.create(mfgDate, expDate, "Sulfurus", "sulfurus");
		
		assertThat(itemCreator,instanceOf(SulfurusItem.class));
	}
}
