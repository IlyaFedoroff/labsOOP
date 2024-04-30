package lab3.classes;

public class Product implements Cloneable {
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
    @Override
    public String toString(){
        //return "name = " + this.getName() + ", age = " + this.getAge() + " ";
        return String.format("name = %s, age = %d ", this.getName(), this.getAge());
    }


    public String getInfo(){
        //return "name = " + this.getName() + ", age = " + this.getAge() + " ";
        return String.format("name = %s, age = %d ", this.getName(), this.getAge());
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        Product  newproduct = (Product) super.clone();
        newproduct.setAge(this.getAge());
        newproduct.setName(this.getName());
        return newproduct;
    }

    @Override
    public boolean equals(Object o){

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return name.equals(product.name);
        //return name == product.name;
    }

    @Override
    public int hashCode(){
        int result = name == null ? 0 : name.hashCode();
        result = 29 * result + age;
        return result;
    }

}
