package appzlogiclearning.cucumbercourse;

public class RestaurentMenuItem {

	private String itemName;
	private String Description;
	private int price;

	public RestaurentMenuItem(String itemName, String description, int price) {
		super();
		this.itemName = itemName;
		Description = description;
		this.price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

}
