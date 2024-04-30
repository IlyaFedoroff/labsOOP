package lab3.classes;

public class Tovar implements Cloneable {
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


    public String getInfo(){
        return String.format("name = %s, material = %s", getName(),getMaterial());

    }

    @Override
    public Tovar clone() throws CloneNotSupportedException {
        Tovar  newtovar = (Tovar) super.clone();
        newtovar.setMaterial(this.getMaterial());
        newtovar.setName(this.getName());
        return newtovar;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        if (material != tovar.material) return false;
        return name == tovar.material;
    }

    @Override
    public int hashCode(){
        int result = name == null ? 0 : name.hashCode();
        result = 29 * result + material.hashCode();
        return result;
    }

}
