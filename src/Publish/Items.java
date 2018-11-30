package Publish;

public class Items{
	private int idGood;
	private int idSeller;
	private String seller;
	private String goodName;
	private float price;
	private String itemPrice;
	public Items() {
		super();
	}
	public Items(int idGood ,int idSeller,String goodNname,float price) 
	{
		super();
		this.idGood=idGood;
		this.idSeller=idSeller;
		this.goodName=goodNname;
		this.price=price;
	}
	public Items(String itemName, String itemPrice, String seller, int itemId){
	    this.goodName = itemName;
	    this.itemPrice = itemPrice;
	    this.seller = seller;
	    this.idGood = itemId;
    }
	public int getIdGood() {
		return idGood;
	}
	public int getIdSeller() {
		return idSeller;
	}
	public String getGoodName() {
		return goodName;
	}
	public float getPrice() {
		return price;
	}

    public String getSeller() {
        return seller;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setIdGood(int idGood) {
        this.idGood = idGood;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
}
