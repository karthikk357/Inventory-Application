package com.inventory;

import java.util.Date;

public class ItemCreator {
	
	public Item create(Date mfgDate, Date expDate, String name, String itemType) {
		ItemType iType = null;
		if(itemType.equals("generic")){
			iType = new GenericItem(mfgDate, expDate, name);
		}if(itemType.equals("aged")){
			iType = new AgedItem(mfgDate, expDate, name);
		}
		if(itemType.equals("concert") || itemType.equals("backstage") || itemType.equals("passes")){
			iType = new EventItem(mfgDate, expDate, name);
		}
		
		if(itemType.equals("sulfurus")){
			iType = new SulfurusItem(mfgDate, expDate, name);
		}
		return iType.getItem();
	}

}
