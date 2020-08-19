
public class bid {
	private int bid_id;
	private String item_name;
	private double bid_price;
	private String seller_email;
	private String buyer_email;
	//check
	public bid(int bid_id, String item_name, String seller_email, String buyer_email, double bid_price) {
		this.bid_id = bid_id;
		this.item_name = item_name;
		this.seller_email = seller_email;
		this.bid_price = bid_price;
		this.buyer_email = buyer_email;
	}
	public String toString() {
		return null;
	}
	public int getbid_id() {
		return bid_id;
	}
	public String getitem_name() {
		return item_name;
	}
	public String getbuyer_email() {
		return buyer_email;
	}
	public String getseller_email() {
		return seller_email;
	}
	public void setitem_name(String item_name) {
		this.item_name = item_name;
	}
	public void setbuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}
	public void setseller_email(String seller_email) {
		this.seller_email = seller_email;
	}
	public void setbid_price(double bid_price) {
		this.bid_price = bid_price;
	}
	public void setbid_id(int bid_id) {
		this.bid_id = bid_id;
	}









}