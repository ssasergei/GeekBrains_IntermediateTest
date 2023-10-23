package Model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import Data.FilePromo;



public class PromoToy {
    private List<Toy>  toys;
    private FilePromo file;
    private Queue<Toy> queue = new ArrayDeque<>();
    
    private int getMaxValue() {
        int result = 0;
        for (Toy toy : toys) {
            if (toy.getValue() > 0)
                result += toy.getWeight();
        }
        return result;
    }


    
    public PromoToy(FilePromo file) {
        this.file = file;
    }


    public PromoToy(List<Toy> toys, FilePromo file) {
        this.toys = new ArrayList<>();
        this.file = file;
    }


    public void get(){

        int indexRandom = new Random().nextInt(getMaxValue());
        for (Toy toy : toys) {
            if (toy.getValue() != 0){
                if (indexRandom < toy.getWeight()){
                    queue.add(toy);
                    toy.lower();
                    break;
                }
            }
            
        }
    }

    public Toy receivetToy() {
        Toy toy = queue.poll();
        file.addFile(toy.toString());
        return toy;
    }

    /**
     * Проверка очереди игрушки
     */
    public boolean hasReceiving() {
        return !queue.isEmpty();
    }

    

    


    

}

