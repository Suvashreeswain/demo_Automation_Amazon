package appzlogiclearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurentMenu {
	
	ArrayList<RestaurentMenuItem> MenuItems = new ArrayList<RestaurentMenuItem>();
	
	public boolean addMenuItem(RestaurentMenuItem newMenuItem) throws IllegalArgumentException{
		System.out.println(DoesItemExist(newMenuItem));
		if(DoesItemExist(newMenuItem)){
			System.out.println("Item already exists");
			throw new IllegalArgumentException("Duplicate Item");
		}
		return MenuItems.add(newMenuItem);
	}
	
	public boolean DoesItemExist(RestaurentMenuItem newMenuItem){
		boolean Exists = false;
		if(MenuItems.contains(newMenuItem)){
			Exists = true;
		}
		return Exists;
	}

}
