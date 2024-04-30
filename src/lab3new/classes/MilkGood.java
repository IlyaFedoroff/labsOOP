package lab3new.classes;

public class MilkGood extends Product {
    private String srok_godnosti;
    private String sostav;

    // конструктор
    public MilkGood(String name, int age, String srok_godnosti, String sostav){
        super(name, age);
        this.setSrok_godnosti(srok_godnosti);
        this.setSostav(sostav);
    }
    public MilkGood(){
        super();
        this.setSrok_godnosti("srok_godnosti");
        this.setSostav("sostav");
    }
// геттеры и сеттеры
public void setSrok_godnosti(String srok_godnosti){
    this.srok_godnosti =srok_godnosti;
}
public String getSrok_godnosti(){
    return srok_godnosti;
}
public void setSostav(String sostav){
    this.sostav = sostav;
}
public String getSostav(){
    return sostav;
}

//@Override
public String toString(){
    String s1 = super.toString();
    // return s1 + "srok = " + this.getSrok_godnosti() + ", sostav = " + this.getSostav() + " ";
    String s2 = String.format("srok = %s, sostav = %s ", this.getSrok_godnosti(), this.getSostav());
    return s1 + s2;
}
}
