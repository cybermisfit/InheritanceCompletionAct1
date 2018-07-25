public class ProductApp {

    public static void main(String[] args){

    //PRODUCT INSTANCES

        Product p1 = new Product();
        p1.setCode("1001");
        p1.setDescription("P1 and the description of P1");
        p1.setPrice(12.50);

        Product p2 = new Product();
        p2.setCode("1002");
        p2.setDescription("P2 and the description of p2");
        p2.setPrice(14);

        Product p3 = new Product();
        p3.setCode("1003");
        p3.setDescription("P3 and the description of p3");
        p3.setPrice(22.50);


        System.out.print("PRODUCTS"+ "\n" + p1 + "\n" + p2 + "\n" + p3 + "\n");

    //BOOK INSTANCES

        Book b1 = new Book();
        b1.setAuthor("Author One");
        b1.setPages(300);

        Book b2 = new Book();
        b2.setAuthor("Author Two");
        b2.setPages(500);

        Book b3 = new Book();
        b3.setAuthor("Author Three");
        b3.setPages(250);

        System.out.print("BOOKS"+ "\n" + b1 + "\n" + b2 + "\n" + b3 + "\n");


     //SOFTWARE INSTANCES

        Software s1 = new Software();
        s1.setProgrammer("Lady Programmer One");
        s1.setPlatform("PC");
        s1.setOs("Windows");

        Software s2 = new Software();
        s2.setProgrammer("Lady Programmer Two");
        s2.setPlatform("Mac");
        s2.setOs("macOSX");

        Software s3 = new Software();
        s3.setProgrammer("Lady Programmer Three");
        s3.setPlatform("Linux");
        s3.setOs("Red Hat");

        System.out.print("SOFTWARE"+ "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n");


    }
}
