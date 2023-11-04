package TicketShop.Entity;

public class Products {
	private int id, numOfSeat, numOfSeatLeft, price;
	private String name, img, caption, time, location;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public int getNumOfSeat() {
		return numOfSeat;
	}
	public int getNumOfSeatLeft() {
		return numOfSeatLeft;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getImg() {
		return img;
	}
	public String getCaption() {
		return caption;
	}
	public String getTime() {
		return time;
	}
	public String getLocation() {
		return location;
	}
	public void setNumOfSeat(int numOfSeat) {
		this.numOfSeat = numOfSeat;
	}
	public void setNumOfSeatLeft(int numOfSeatLeft) {
		this.numOfSeatLeft = numOfSeatLeft;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
