package lab3new;

import lab3.classes.MilkGood;
import lab3.classes.Product;
import lab3.classes.Tovar;
import lab3.classes.Toy;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product);
        MilkGood milkgood = new MilkGood();
        System.out.println(milkgood);
        Tovar tovar = new Tovar("Fazz Bender", "plastic");
        System.out.println(tovar);
        Toy toy = new Toy();
        System.out.println(toy);
    }
}
