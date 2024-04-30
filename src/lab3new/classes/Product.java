package lab3new.classes;

public class Product {
    private String name;    //   наименование
    private int age;    //  срок годности в днях
    // конструктор
    public Product(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public Product(){
        this.setName("null");
        this.setAge(0);
    }
    // геттеры и сеттеры для продукта
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        //return "name = " + this.getName() + ", age = " + this.getAge() + " ";
        return String.format("name = %s, age = %d ", this.getName(), this.getAge());
    }
}
