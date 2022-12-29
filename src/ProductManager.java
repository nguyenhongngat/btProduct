import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> products = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);
    private CategoryManager categoryManager;

    public ProductManager(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    public ProductManager() {

    }

    public Product createProduct() {
        System.out.println("Nhap id san pham:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia tien san pham: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong san pham:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Chon loai cua san pham:");
        Category category = choiceCategory(scanner);
        System.out.println("Chon san pham: " +
                "\n1.Candy" +
                "\n2.Drinks" +
                "\n3.San pham khac");
        int choice = Integer.parseInt(scanner.nextLine());
        Product product = null;
        switch (choice) {
            case 1:
                System.out.println("Nhap loai san pham:");

                System.out.println("Nhap can nang: ");
                int weight = Integer.parseInt(scanner.nextLine());
                product = new Candy(id, name, price, quantity, weight);
                break;
            case 2:
                System.out.println("Nhap the tich:");
                double volume = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap loai chai dung:");
                String bottleType = scanner.nextLine();
                product = new Drinks(id, name, price, quantity, volume, bottleType);
                break;
            case 3:
                product = new Product(id, name, price, quantity);
                break;
        }
        return product;
    }

    public Category choiceCategory(Scanner scanner) {
        System.out.println("Hien thi danh sach loai cua san pham:");
        categoryManager.showCategory();
        System.out.println("Chon id cua loai san pham:");
        int id = -1;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Ban phai  nhap so!");

        }
        return categoryManager.searchCategoryById(id);
    }

    public void addProduct() {
        products.add(createProduct());
    }

    public void deleteProduct() {
        System.out.println("Nhap id san pham can xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
    }

    public void showProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void showCandy() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Candy) {
                System.out.println(products.get(i).toString());
            }
        }
    }

    public void showDrinks() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Drinks) {
                System.out.println(products.get(i).toString());
            }
        }
    }

    public void showMaxPrice() {
        double maxPrice = products.get(0).getPrice();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > maxPrice) {
                maxPrice = products.get(i).getPrice();
            }
        }
    }

    public void showMinPrice() {
        double minPrice = products.get(0).getPrice();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() < minPrice) {
                minPrice = products.get(i).getPrice();
            }
        }
    }

    public void showMaxQuantity() {
        int maxQuantity = products.get(0).getQuantity();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getQuantity() > maxQuantity) {
                maxQuantity = products.get(i).getQuantity();
            }
        }
    }

    public void showMinQuantity() {
        int minQuantity = products.get(0).getQuantity();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getQuantity() < minQuantity) {
                minQuantity = products.get(i).getQuantity();
            }
        }
    }

    public void showDrinksByBottleType() {
        System.out.println("Nhap loai chai dung can hien thi:");
        String bottletype = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Drinks) {
                if (bottletype.equals(((Drinks) products.get(i)).getBottleType())) {
                    System.out.println(i);
                }
            }
        }
    }

    public void showCandyMaxWeight() {
        int candyMaxWeight = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Candy) {
                if (((Candy) products.get(i)).getWeight() > candyMaxWeight) {
                    candyMaxWeight = i;
                }
            }
        }
    }

    public void showProductByCategory() {
        System.out.println("Nhap loai san pham can hien thi: ");
        String category = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (category.equals(products.get(i).getCategory())) {
                System.out.println(products.get(i).toString());
            }
        }

    }

    public void editProductById() {
        System.out.println("Nhap id san pham can sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                System.out.println("Nhap ten san pham:");
                String name = scanner.nextLine();
                products.get(i).setName(name);
                System.out.println("Nhap gia tien san pham: ");
                double price = Double.parseDouble(scanner.nextLine());
                products.get(i).setPrice(price);
                System.out.println("Nhap so luong san pham:");
                int quantity = Integer.parseInt(scanner.nextLine());
                products.get(i).setQuantity(quantity);
            }
        }
    }
    public void searchByName(){
        System.out.println("Nhap ten san pham can tim: ");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name.contains(products.get(i).getName())){
                System.out.println(products.get(i).toString());
            }
        }
    }


}
