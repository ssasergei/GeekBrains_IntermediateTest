package Model;

public class Toy {

    private int id;
    private static int generalId;
    private String name;
    private int value;
    private int weight;

    
    public Toy(String name, int value, int weight) {
        this.id = generalId;
        generalId++;
        this.name = name;
        this.value = value;
        this.weight = weight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void lower() {
        this.weight--;
    }
    


    @Override
    public String toString() {
        return "Toy:[id=" + id + ", name=" + name + ", value=" + value + ", weight=" + weight + "]"  ;
    }

  
    
}
