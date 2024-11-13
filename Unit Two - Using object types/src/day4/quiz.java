package day4;

public class quiz {
    public static void main(String[] args) {
       Product laptop = new Product("Laptop", 999.99, 10);
       Product headphones = new Product("Headphones", 199.99, 10);
       
       Customer alice = new Customer("Alice", 1200.00);

       alice.addToCart(laptop);

       alice.addtocart(headphones);

       string cartContents = alice.getCart();
       System.out.println(cartContents);
       
       double totalCost = laptop.getprice() + headphones.getprice();

       System.out.println(totalCost);

       Order orderForLaptop = new Order(alice, laptop );

       String orderConfirmation = orderForLaptop.confirmOrder();
       System.out.println(orderConfirmation);


    }
    
}
