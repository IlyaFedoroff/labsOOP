package lab3.classes;

public class Toy extends Tovar {
    private int age_to_buy;
    private String type;
    private double weight;
    // конструктор
    public Toy(String name, String material, int age_to_buy, String type, double weight){
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




    @Override
    public String toString(){
        String s1 = super.toString();
        String s2 = String.format(", age_to_buy = %d, type = %s, weight = %.2f", getAge_to_buy(), getType(), getWeight());
        return s1 + s2;
        //return s + String.format("; age_to_buy = %d; type = %s; weight = %.2f", getAge_to_buy(), getType(), getWeight());
    }


    @Override
    public String getInfo(){
        String s1 = super.toString();
        String s2 = String.format(", age_to_buy = %d, type = %s, weight = %.2f", getAge_to_buy(), getType(), getWeight());
        return s1 + s2;
        //return s + String.format("; age_to_buy = %d; type = %s; weight = %.2f", getAge_to_buy(), getType(), getWeight());
    }

    @Override
    public Toy clone() throws CloneNotSupportedException {
        Toy newtoy = (Toy) super.clone();
        newtoy.setAge_to_buy(this.getAge_to_buy());
        newtoy.setType(this.getType());
        newtoy.setWeght(this.getWeight());
        return newtoy;
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        if (age_to_buy != toy.age_to_buy) return false;
        if (type != toy.type) return false;
        return weight == toy.weight;


    }
}
