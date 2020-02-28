package pos01;

import java.util.Scanner;


public class PosEx {
	static PosSevice ps = new PosSevice();

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=============POS=============");
			System.out.println("1.재고 관리|2.상품 계산|0.포스 종료|");
			System.out.println("=============================");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			case 1:
				boolean flag1 = true;
				while(flag1) {
					 String itemName="";
					 int itemPrice=0;
					 int itemStock=0;
					 int itemCode=0;
					System.out.println("===========1.재고 관리==========");
					System.out.println("1.재고 확인|2.재고 변경|3.상품 등록|4.상품 삭제|5.포스 메뉴로");
					System.out.println("=============================");
					int select1 = Integer.parseInt(sc.nextLine());
					switch (select1) {
					case 1:
						System.out.println("재고를 확인합니다.");
						ps.checkInventory();
						break;
					case 2:
						System.out.println("재고를 변경할 상품의 코드를 입력해 주세요.");
						 itemCode = Integer.parseInt(sc.nextLine());
						 ps.showItem(itemCode);
						System.out.println("재고를 몇으로 바꿀지 입력해 주세요.");
						 itemStock = Integer.parseInt(sc.nextLine());
						ps.changeItemStock(itemCode,itemStock);
						break;
					case 3:
						System.out.println("등록할 상품의 이름을 입력해 주세요.");
						itemName = sc.nextLine();
						System.out.println("등록할 상품의 가격을 입력해 주세요.");
						itemPrice = Integer.parseInt(sc.nextLine());
						System.out.println("등록할 상품의 재고를 입력해 주세요.");
						 itemStock = Integer.parseInt(sc.nextLine());
						System.out.println("등록할 상품의 코드를 입력해 주세요.");
						 itemCode = Integer.parseInt(sc.nextLine());
						ps.addItemFromInventory(itemName,itemPrice,itemStock,itemCode);
						break;
					case 4:
						System.out.println("삭제할 상품의 코드를 입력해 주세요.");
						itemCode = Integer.parseInt(sc.nextLine());
						ps.deletItemFromInventory(itemCode);
						break;
					case 5:
						flag1=false;
						break;

					default:
						System.out.println("올바른 입력이 아닙니다.");
						break;
					}
				}//재고 관리 while end
				break;
			case 2:
				boolean flag2 = true;
				while(flag2) {
					int itemCode = 0;
					int change = 0;
					System.out.println("===========2.상품 계산==========");
					System.out.println("1.상품 등록|2.상품 삭제|3.상품 계산|4.계산 취소");
					System.out.println("=============================");
					int select2 = Integer.parseInt(sc.nextLine());
					switch (select2) {
					//상품 등록 start
					case 1:
						System.out.println("추가할 상품의 코드를 입력해 주세요.");
						itemCode = Integer.parseInt(sc.nextLine());
						ps.addItem(itemCode);
						break;
					//상품 등록 end
					
					//상품 삭제 start
					case 2:
						System.out.println("취소할 상품의 코드를 입력해 주세요.");
						itemCode = Integer.parseInt(sc.nextLine());
						ps.delItem(itemCode);
						break;
					//상품 삭제 end
						
					//상품 계산 start
					case 3:
						System.out.println("받은 거스름돈을 입력해 주세요.");
						change = Integer.parseInt(sc.nextLine());
						ps.calItem(change);
						break;
					//상품 계산 end	
					
					case 4:
						flag2=false;
						break;

					default:
						System.out.println("올바른 입력이 아닙니다.");
						break;
					}
				}//상품 계산 while end
				break;

			default:
				System.out.println("올바른 입력이 아닙니다.");
				break;
			}
		}
	}
}
