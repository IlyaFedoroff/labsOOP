package lab3new.classes;

public class Toy extends Tovar {
    private int age_to_buy;
    private String type;
    private double weight;
    // конструктор
    public Toy(String name, String material, String store, double price, int age_to_buy, String type, double weight){
        super(name, material);
        this.setAge_to_buy(age_to_buy);
        this.setType(type);
        this.setWeght(weight);
    }
    public Toy() {
        super();
        this.setAge_to_buy(0);
        this.setType("type");
        this.setWeght(0);
    }
    // геттеры и сеттеры
    public void setAge_to_buy(int age_to_buy){
        this.age_to_buy = age_to_buy;
    }
    public int getAge_to_buy(){
        return age_to_buy;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setWeght(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public String toString(){
        String s1 = super.toString();
        String s2 = String.format(", age_to_buy = %d, type = %s, weight = %.2f", getAge_to_buy(), getType(), getWeight());
        return s1 + s2;
        //return s + String.format("; age_to_buy = %d; type = %s; weight = %.2f", getAge_to_buy(), getType(), getWeight());
    }
}
