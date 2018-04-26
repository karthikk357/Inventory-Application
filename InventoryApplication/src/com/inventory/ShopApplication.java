package com.inventory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ShopApplication {

	public static void main(String args[]) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30);
		Date mfgDate = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 50);
		Date expDate = cal.getTime();
		
		List<Item> items = new ArrayList<>();
		ItemCreator ic = new ItemCreator();
		items.add(ic.create(mfgDate, expDate, "Dextirity Vest", "generic"));
	
		
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -10);
		Date mfgDate1 = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 40);
		Date expDate1 = cal.getTime();
		items.add(ic.create(mfgDate1, expDate1, "Aged Brie", "aged"));
		
		
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -15);
		Date mfgDate2 = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 30);
		Date expDate2 = cal.getTime();
		items.add(ic.create(mfgDate2, expDate2, "Concert Backstage Passes", "event"));
		
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30);
		Date mfgDate3 = cal.getTime();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 0);
		Date expDate3 = cal.getTime();
		
		items.add(ic.create(mfgDate3, expDate3, "Sulfuras", "sulfuras"));
	}
}
