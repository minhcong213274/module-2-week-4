package manage;

public class Main {
    public static void main(String[] args) {
        ManageProduct manageProduct = new ManageProduct();
        Product product = new Product(1,"cong",1000);
        Product product1 = new Product(2,"tuan",1500);
        Product product2 = new Product(3,"cong",10000);
        manageProduct.add(product);
        manageProduct.add(product1);
        manageProduct.add(product2);
        manageProduct.writeDataToFile("./src/manage/product.txt");
        System.out.println(manageProduct.readDataToFile("./src/manage/product.txt"));
        System.out.println(manageProduct.searchProduct("cong"));

    }
}
