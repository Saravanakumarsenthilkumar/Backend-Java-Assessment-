import java.util.*;


public class Productcrud {

    static ArrayList<Product> products = new ArrayList<Product>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1.Add");
            System.out.println("2.List");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                addProduct();
            } else if (choice == 2) {
                listProducts();
            } else if (choice == 3) {
                updateProduct();
            } else if (choice == 4) {
                deleteProduct();
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    static void addProduct() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);
        products.add(p);

        System.out.println("Product Added Successfully");
    }

    static void listProducts() {

        if (products.size() == 0) {
            System.out.println("No Products Available");
            return;
        }

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println(p.id + " " + p.name + " " + p.price + " " + p.qty);
        }
    }

    static void updateProduct() {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (int i = 0; i < products.size(); i++) {

            Product p = products.get(i);

            if (p.id == id) {

                System.out.print("Enter New Price: ");
                p.price = sc.nextDouble();

                System.out.print("Enter New Quantity: ");
                p.qty = sc.nextInt();

                System.out.println("Product Updated Successfully");
                return;
            }
        }

        System.out.println("Product Not Found");
    }

    static void deleteProduct() {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).id == id) {
                products.remove(i);
                System.out.println("Product Deleted Successfully");
                return;
            }
        }

        System.out.println("Product Not Found");
    }
}

class Product {
    int id;
    String name;
    double price;
    int qty;

    Product(int i, String n, double p, int q) {
        id = i;
        name = n;
        price = p;
        qty = q;
    }
}

