package lab3.classes;

public class MilkGood extends Product {
    private String sostav;

    // конструктор
    public MilkGood(String name, int age, String sostav){
        super(name, age);
        this.setSostav(sostav);
    }
    public MilkGood(){
        super();
        this.setSostav("sostav");
    }
// геттеры и сеттеры
public void setSostav(String sostav){
    this.sostav = sostav;
}
public String getSostav(){
    return sostav;
}

@Override
public String toString(){
    String s1 = super.toString();
    // return s1 + ", sostav = " + this.getSostav() + " ";
    String s2 = String.format("sostav = %s ", this.getSostav());
    return s1 + s2;

}

@Override
public String getInfo(){
    String s1 = super.toString();
    // return s1 + ", sostav = " + this.getSostav() + " ";
    String s2 = String.format("sostav = %s ", this.getSostav());
    return s1 + s2;
}

@Override
public MilkGood clone() throws CloneNotSupportedException {
    MilkGood newmilkgood = (MilkGood) super.clone();

    newmilkgood.setSostav(this.getSostav());
    //MilkGood newmilkgood = new MilkGood(this.getName(),this.getAge(),this.getSostav());
    return newmilkgood;
}

@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;
    return getName().equals(product.getName());
    //return name == product.name;

}

@Override
public int hashCode(){
    int result = super.getName() == null ? 0 : super.getName().hashCode();
    result = 29 * result + super.getAge();
    result = 29 * result + sostav.hashCode();
    return result;
}






}
