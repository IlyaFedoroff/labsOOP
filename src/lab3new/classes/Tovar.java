package lab3new.classes;

public class Tovar {
    private String name;
    private String material;

    // конструктор
    public Tovar(String name, String material){
        this.setName(name);
        this.setMaterial(material);
    }
    public Tovar(){
        this.setName("name");
        this.setMaterial("material");
    }

    // геттеры и сеттеры
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }

    public String toString(){
        return String.format("name = %s, material = %s", getName(),getMaterial());
    }
}
