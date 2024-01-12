package polymorphism;

public class main 
{
	public static void main(String[] args) {
        product pro = new product();
        pro.setPrice(10.0);
        System.out.println("Price of product: " + pro.getPrice());
        System.out.println("Updated price of product: " + pro.getPrice(5));
    }

