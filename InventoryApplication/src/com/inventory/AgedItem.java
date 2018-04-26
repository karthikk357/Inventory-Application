package com.inventory;

import java.util.Date;

public class AgedItem implements ItemType {

	private String itemType = "aged";
	private int initialQuality = 0;
	private Item item = null;

	private Date today = new Date();

	public AgedItem(Date mfgDate, Date expDate, String name) {
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
		if (today.getTime() > sellInDays) {

			quality = (int) (today.getTime() - sellInDays);
		}
		item.setQuality(quality);

		return item;
	}

}
