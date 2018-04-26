package com.inventory;

import java.util.Date;

public class GenericItem implements ItemType {

	private String itemType = "generic";
	private Item item = null;
	private int initialQuality = 50;
	
	private Date today = new Date();
	
	public GenericItem(Date mfgDate, Date expDate, String name) {
		item = new Item();
		item.setName(name);
		item.setMfgdate(mfgDate);
		item.setExpdate(expDate);
	}
	
	@Override
	public Item getItem() {
		// get SellIn days sellIn date = expdate - today
		long sellInDays = (Math.abs(item.getExpdate().getTime() - today.getTime()))/(1000*60*60*24);
		item.setSellIn(sellInDays);
	 
		long itemDuration = (Math.abs(item.getExpdate().getTime() - item.getMfgdate().getTime()))/(1000*60*60*24);

		int quality = initialQuality;
		if(sellInDays < 50) {
			quality = (int)sellInDays;
		}
		item.setQuality(quality);
		// if mfgDate - expDate < 50 then quality = 50 
		// else if sellInDays > 50 then quality = 50
		// else if sellInDays < 50 then quality = sellInDays
			
		
		return item;
	}

}
