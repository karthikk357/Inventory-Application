package com.inventory;

import java.util.Date;

public class SulfurusItem implements ItemType {

	private String itemType = "sulfurus";
	private Item item = null;
	private int initialQuality = 80;
	
	private Date today = new Date();
	
	
	public SulfurusItem(Date mfgDate, Date expDate, String name) {
		item = new Item();
		item.setName(name);
		item.setMfgdate(mfgDate);
		item.setExpdate(expDate);
	}

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		long sellInDays = (Math.abs(item.getExpdate().getTime() - today.getTime())) / (1000 * 60 * 60 * 24);
		item.setSellIn(sellInDays);
		int quality = initialQuality;
		item.setQuality(quality);

		
		return item;
	}
	
	
}
