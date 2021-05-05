package objects;

public class Game {
	
	private int id;
	private String Name;
	private int Price;
	private String Campaign;
	
	
	public Game(int id, String name, int price, String campaign) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		Campaign = campaign;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public int getPrice() {
		return Price;
	}
	public String getCampaign() {
		return Campaign;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public void setCampaign(String campaign) {
		Campaign = campaign;
	}
	
	
	

}
