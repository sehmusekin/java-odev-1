package org.example;

public class Main {

    public static void main(String[] args) {
       // Product product1 = new Product();
                        //set vaule
   //     product1.name ="Delonghi Kahve Makinesi";
        //        product1.unitPrice=7500;
        //        product1.discount =7;
        //        product1.unitInStock =25;
        //        product1.imageUrl ="bilinmeyen.jpg";
        //
        //
        //        Product product2 = new Product();
        //        product2.name ="Delonghi Ekmek  Makinesi";
        //        product2.unitPrice=65000;
        //        product2.discount =30;
        //        product2.unitInStock =25;
        //        product2.imageUrl ="bilinmeyen2.jpg";
        //
        //
        //        Product product3 = new Product();
        //        product3.name ="Delonghi Tost Makinesi";
        //        product3.unitPrice=750;
        //        product3.discount =20;
        //        product3.unitInStock =25;
        //        product3.imageUrl ="bilinmeyen3.jpg";
        //
        //
        //
        //        System.out.println(product1.name);
        //        System.out.println(product1.unitPrice);
        //        System.out.println(product1.discount);
        //        System.out.println(product1.unitInStock);
        //        System.out.println(product1.imageUrl);
        //
        //        System.out.println(product2.name);
        //        System.out.println(product2.unitPrice);
        //        System.out.println(product2.discount);
        //        System.out.println(product2.unitInStock);
        //        System.out.println(product2.imageUrl);
        //
        //        System.out.println(product3.name);
        //        System.out.println(product3.unitPrice);
        //        System.out.println(product3.discount);
        //        System.out.println(product3.unitInStock);
        //        System.out.println(product3.imageUrl);
        //
        //        Product[] products = {product1,product2,product3};
        //
        //        System.out.println("<ul>");
        //        for (Product product: products){
        //              System.out.println("<li> + product.name + </li>");
        //        }
        //        System.out.println("</lu>");

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(25);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Delonghi Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(25);
        product2.setImageUrl("image1.jpg");

        Product product3 = new Product();
        product3.setName("Delonghi Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(25);
        product3.setImageUrl("image1.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product: products){
            System.out.println("<li>" + product.getName() +" </li>");
               }
        System.out.println("</lu>");

        IndividualCustomer individualCustomer= new IndividualCustomer();

        individualCustomer.setCustomerNumber("251444");
        individualCustomer.setId(25);
        individualCustomer.setPhone("5452544225");
        individualCustomer.setFirstName("Şehmus");
        individualCustomer.setLastName("Ekin");

        System.out.println(individualCustomer.getFirstName());

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(26);
        corporateCustomer.setPhone("5452541415");
        corporateCustomer.setCompanyName("java");
        corporateCustomer.setTaxNumber("25545454545");
        corporateCustomer.setCustomerNumber("5545454");





    }
}
