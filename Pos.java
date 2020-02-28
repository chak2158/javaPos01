package pos01;

public class Pos {

	// 상품코드랑 매치가 되는 아이탬에 대한 정보를 가져와서 화면에 뿌려줄거에요

	// 이름, 가격, 재고, 상품코드

}

class Item {

	private String itemName;
	private int itemPrice;
	private int itemStock;
	private int itemCode;

	public Item(String itemName, int itemPrice, int itemStock, int itemCode) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	@Override
	public String toString() {
		String result = "상품명:"+this.itemName+"상품 가격:"+this.itemPrice +"상품 재고:"+ this.itemStock +"상품 코드:"+ this.itemCode;
		return result;
	}

}