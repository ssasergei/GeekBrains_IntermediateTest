import Classes.Gift;
import Classes.GiftQueue;
import Classes.Logger;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = new Logger();

        Gift g1 = new Gift("мишка", 5, 10);
        Gift g2 = new Gift("зайка", 3, 7);
        Gift g3 = new Gift("Соник", 2, 4);
        Gift g4 = new Gift("слоник", 1, 1);

        List<Gift> giftList = new ArrayList<Gift>();

        giftList.add(g1);
        giftList.add(g2);
        giftList.add(g3);
        giftList.add(g4);

        GiftQueue giftQueue = new GiftQueue(giftList, logger);

        for (int i = 0; i < 10; i++) {
            giftQueue.get();
        }

        while (giftQueue.hasReceiving()) {
            System.out.println(giftQueue.receiveGift());
        }
    }
}