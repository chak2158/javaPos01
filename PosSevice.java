package pos01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosSevice {
	// 기본 재고 생성
	private static Item[] items = new Item[100];
	static Item[] addedItems = new Item[100];
	static {
		String[][] defaultItems = { { "미네랄워터", "500", "200", "1111" }, { "아이셔", "1500", "100", "2222" },
				{ "후라보노", "1000", "50", "3333" }, { "꼬깔콘", "1500", "10", "4444" } };

		for (int i = 0; i < defaultItems.length; i++) {
			items[i] = new Item("", 0, 0, 0);
			for (int j = 0; j < defaultItems[i].length; j++) {
				switch (j) {
				case 0:
					items[i].setItemName(defaultItems[i][j]);
					break;
				case 1:
					items[i].setItemPrice(Integer.parseInt(defaultItems[i][j]));
					break;
				case 2:
					items[i].setItemStock(Integer.parseInt(defaultItems[i][j]));
					break;
				case 3:
					items[i].setItemCode(Integer.parseInt(defaultItems[i][j]));
					break;
				}
			}
		}
	}

	void addItem(int itemCode) {
		System.out.println(items[1].getItemCode());
	}

	void delItem(int itemCode) {

	}

	void calItem(int change) {

	}

//재고 아이템 목록 출력
	public void checkInventory() {

		for (Item i : items) {
			if (i != null)
				System.out.println(i);
		}

	}

//재고 아이템의 재고수 변경
	public void changeItemStock(int itemCode, int itemStock) {
		findItemArray(itemCode).setItemStock(itemStock);
	}

//재고 아이템 추가
	public void addItemFromInventory(String itemName, int itemPrice, int itemStock, int itemCode) {

		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = new Item("", 0, 0, 0);
				items[i].setItemName(itemName);
				items[i].setItemPrice(itemPrice);
				items[i].setItemStock(itemStock);
				items[i].setItemCode(itemCode);
				return;
			}
		}
	}

//재고 아이템 제거
	public void deletItemFromInventory(int itemCode) {
		for (Item i : items) {
			if (i != null) {
				if (i.getItemCode() == itemCode) {
					i = null;
				}

			}
		}

	}

//아이템 코드에 해당하는 아이템 보여주기
	public void showItem(int itemCode) {
		findItemArray(itemCode).toString();
	}

//빈 배열 처리
	public void eraseNullArr(Item[] arr) {
		List<Item> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(null);
		// 추후 들어올 값을 위해 자리 하나 더 늘려준다
		arr = list.toArray(new Item[list.size() + 1]);
	}

//배열 사이즈 늘려주기
	public void addArrSize(Item[] arr) {
		List<Item> list = new ArrayList<>(Arrays.asList(arr));
		arr = list.toArray(new Item[list.size() + 1]);
	}

//배열에서 요소 찾기
	public Item findItemArray(int itemCode) {
		for (Item i : items) {
			if (i != null) {
				if (i.getItemCode() == itemCode) {
					return i;
				}

			}
		}
		return null;
	}

}
