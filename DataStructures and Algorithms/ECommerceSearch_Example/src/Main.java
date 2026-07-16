public class Main {

    // Product class
    static class Product {

        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    }

    // Linear Search Method
    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {

            if (p.productId == id) {
                return p;
            }

        }

        return null;
    }

    // Binary Search Method
    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id) {

                return products[mid];

            } else if (products[mid].productId < id) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return null;
    }

    public static void main(String[] args) {

        // Product Array (Sorted by Product ID)
        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")

        };

        // Linear Search
        Product result1 = linearSearch(products, 104);

        System.out.println("----- Linear Search -----");

        if (result1 != null) {

            System.out.println("Product ID   : " + result1.productId);
            System.out.println("Product Name : " + result1.productName);
            System.out.println("Category     : " + result1.category);

        } else {

            System.out.println("Product Not Found");

        }

        // Binary Search
        Product result2 = binarySearch(products, 105);

        System.out.println("\n----- Binary Search -----");

        if (result2 != null) {

            System.out.println("Product ID   : " + result2.productId);
            System.out.println("Product Name : " + result2.productName);
            System.out.println("Category     : " + result2.category);

        } else {

            System.out.println("Product Not Found");

        }

    }
}