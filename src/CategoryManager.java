import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryManager {
    List<Category> category = new ArrayList<Category>();
    Scanner scanner = new Scanner(System.in);

    public Category createCategory(){
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten loai san pham: ");
        String name = scanner.nextLine();
        Category category = new Category(id, name);
        return category;
    }

    public void addCategory() {
        category.add(createCategory());
    }

    public void deleteCategory() {
        System.out.println("Nhap id can xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < category.size(); i++) {
            if (id == category.get(i).getId()) {
                category.remove(i);
            }
        }
    }

    public void showCategory(){
        for (int i = 0; i < category.size(); i++) {
            System.out.println(category.get(i).toString());
        }
    }

    public void editCategory() {
        System.out.println("Nhap id can sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < category.size() ; i++) {
            if (id == category.get(i).getId()) {
                System.out.println("Nhap ten can sua: ");
                String name = scanner.nextLine();
                 category.get(i).setName(name);
            }
        }
    }

    public Category searchCategoryById(int id){
        for (int i = 0; i < category.size(); i++) {
            if (id == category.get(i).getId()){
               return category.get(i);
            }
        }
        return null;
    }
}
