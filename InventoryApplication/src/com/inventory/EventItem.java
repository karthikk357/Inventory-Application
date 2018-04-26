package com.inventory;

import java.util.Date;

public class EventItem implements ItemType {

	private String itemType = "event";
	private Item item = null;
	private int initialQuality = 20;
	Date expDate;
	private Date today = new Date();
	
	
	public EventItem(Date mfgDate, Date expDate, String name) {
		item = new Item();
		item.setName(name);
		item.setMfgdate(mfgDate);
		item.setExpdate(expDate);
	}


	@Override
	public Item getItem() {
		
		long sellInDays = (Math.abs(item.getExpdate().getTime() - today.getTime())) / (1000 * 60 * 60 * 24);
		item.setSellIn(sellInDays);
		int quality = initialQuality;
		
		
		if(expDate.getTime()-today.getTime() < 20 && sellInDays-today.getTime() >10)
		quality = (int) (sellInDays-today.getTime());
		 if(sellInDays-today.getTime() <10) {
			quality = (int) (2*(sellInDays-today.getTime()));
		}
		 if(expDate.getTime()-today.getTime()<=0) {
			 quality=0;
		 }
		
		item.setQuality(quality);

		return item;
	}
	
	
}
