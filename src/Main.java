import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CategoryManager categoryManager = new CategoryManager();
        ProductManager productManager = new ProductManager(categoryManager);
        Scanner scanner = new Scanner(System.in);
        String regexMenu = "[0-9]{1,2}", input;
        while (true){
            System.out.println("MENU:" +
                    "\n1.Them mot san pham" +
                    "\n2.Xoa mot san pham theo id" +
                    "\n3.Hien thi danh sach san pham" +
                    "\n4.Hien thi danh sach san pham la Candy" +
                    "\n5.Hien thi danh sach san pham la Drinks" +
                    "\n6.Hien thi danh sach san pham co gia cao nhat" +
                    "\n7,Hien thi danh sach san pham co gia thap nhat" +
                    "\n8.Hien thi danh sach co so luong nhieu nhat" +
                    "\n9.Hien thi danh sach co so luong it nhat" +
                    "\n10.Hien thi danh sach san pham la Drinks theo loai chai dung" +
                    "\n11.Hien thi danh sach san pham là Candy co can nang lon nhat" +
                    "\n12.Hien thi danh sach san pham theo loai san pham" +
                    "\n13.Sua thong tin san pham theo id" +
                    "\n14.Tim kiem san pham theo ten gan dung" +
                    "\n15.Them loai san pham" +
                    "\n16.Hien thi loai san pham");
            do {
                input = scanner.nextLine();
                if (input.matches(regexMenu)) {
                    break;
                } else {
                    System.out.println("Hay nhap lai so tu 1 den 16");
                }
            } while (true);
            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.deleteProduct();
                    break;
                case 3:
                    productManager.showProduct();
                    break;
                case 4:
                    productManager.showCandy();
                    break;
                case 5:
                    productManager.showDrinks();
                    break;
                case 6:
                    productManager.showMaxPrice();
                    break;
                case 7:
                    productManager.showMinPrice();
                    break;
                case 8:
                    productManager.showMaxQuantity();
                    break;
                case 9:
                    productManager.showMinQuantity();
                    break;
                case 10:
                    productManager.showDrinksByBottleType();
                    break;
                case 11:
                    productManager.showCandyMaxWeight();
                    break;
                case 12:
                    productManager.showProductByCategory();
                    break;
                case 13:
                    productManager.editProductById();
                    break;
                case 14:
                    productManager.searchByName();
                    break;
                case 15:
                    categoryManager.addCategory();
                    break;
                case 16:
                    categoryManager.showCategory();
                    break;

            }

        }
    }
}
