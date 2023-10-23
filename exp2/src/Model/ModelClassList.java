package Model;

import java.util.List;

import Interface.iGetModel;

public class ModelClassList implements iGetModel {

    private List<Toy> toys;

    public ModelClassList(List<Toy> toys) {
        this.toys = toys;
    }

    public List<Toy> getToys() {
        return toys;
    }
    
}
