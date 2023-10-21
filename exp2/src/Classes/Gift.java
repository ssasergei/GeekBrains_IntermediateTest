package Classes;

/**
 * класс, описывающий игрушку
 */
public class Gift {
    /**
     * идентификатор игрушки
     */
    private int id;
    /**
     * счетчик для идентификаторов
     */
    private static int generalId;
    /**
     * название игрушки
     */
    private String name;
    /**
     * кол-во игрушек
     */
    private int value;
    /**
     * частота выпадения игрушки
     */
    private int weight;

    public Gift(String name, int value, int weight) {
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

    public void lowerValue() {
        this.value--;
    }

    @Override
    public String toString() {
        return "Gift [id=" + id + ", name=" + name + ", value=" + value + ", weight=" + weight + "]";
    }

}
