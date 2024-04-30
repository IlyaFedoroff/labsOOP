package lab3;

import lab3.classes.MilkGood;
import lab3.classes.Product;
//import lab3.classes.Tovar;
import lab3.classes.Toy;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setAge(33);
        System.out.println(product);
        try {
            Product product2 = product.clone();
            product2.setName("11");
            String string = product2.getInfo();
            System.out.println(string);
        } catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }
        System.out.println(product);

        Toy toy1 = new Toy("name","iron",3,"cool type", 55.4);

        try {
            Toy toy2 = toy1.clone();
            System.out.println("получилось скопировать");
            System.out.println(toy2);
        } catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }

        MilkGood milkGood = new MilkGood();
        try {
            MilkGood milkGood2 = milkGood.clone();
            String string = milkGood2.getInfo();
            System.out.println(string);
        } catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }
        System.out.println(milkGood);

        Toy toy = new Toy("nametoy", "plasticmaterial",3,"typename",3.23);
        try {
            Toy toy2 = toy.clone();
            String string = toy2.getInfo();
            System.out.println(string);
        } catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }
        System.out.println(toy);
    }
}
