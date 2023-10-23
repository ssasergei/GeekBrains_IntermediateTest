package View;

import java.util.List;

import Interface.iGetView;
import Model.Toy;

public class ViewClass implements iGetView {
    public void printToy(List<Toy> toys){

        System.out.println("---------Список студентов---------");
        for (Toy t: toys) {
            System.out.println(t);
        }
        System.out.println("------------------");
    }

    
   
    
}
