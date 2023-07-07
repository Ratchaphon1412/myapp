package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 01");
        System.out.println("Product List");
        Product product1 = new Product("มาม่า",33,12.75);
        Product product2 = new Product("น้ำเปล่า",34,10.00);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        User user = new User ("Ratchaphon","Men",20);
        System.out.print("By ");
        System.out.print(user.toString());




    }
}