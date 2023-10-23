import java.util.ArrayList;
import java.util.List;

import Data.FilePromo;
import Interface.iGetModel;
import Interface.iGetView;
import Model.ModelClassList;
import Model.PromoToy;
import Model.Toy;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {

        List<Toy> toys = new ArrayList<>();
        FilePromo file = new FilePromo();

        Toy t1 = new Toy("Машинка", 10, 20);
        Toy t2 = new Toy("Самолет", 5, 20);
        Toy t3 = new Toy("Кукла", 7, 20);
        Toy t4 = new Toy("Паровозик", 8, 20);
      

        toys.add(t1);
        toys.add(t2);
        toys.add(t3);
        toys.add(t4);


        // iGetView view = new ViewClass();
        // iGetModel modelList = new ModelClassList(toys);

        // System.out.println(modelList);

        PromoToy promoToy  = new PromoToy(toys, file);

        // for (int i = 0; i < 10; i++) {
        //     promoToy.get();
        // }

        // while (promoToy.hasReceiving()) {
            System.out.println(promoToy.receivetToy());
        // }





    }
}