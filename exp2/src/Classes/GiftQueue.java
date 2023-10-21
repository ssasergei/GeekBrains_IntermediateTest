package Classes;

import java.util.*;

public class GiftQueue {
    private Queue<Gift> receiving = new ArrayDeque<>();
    private List<Gift> giftList = new ArrayList<>();
    private Logger logger;

    public GiftQueue(List<Gift> giftList, Logger logger) {
        this.giftList = giftList;
        this.logger = logger;
    }

    public GiftQueue(Logger logger) {
        this.logger = logger;
    }

    /**
     * Выбирает игрушку и добавляет ее в очередь
     * 
     * @return
     */
    public void get() {
        int randomIndex = new Random().nextInt(getMaxValue());
        for (Gift gift : giftList) {
            if (gift.getValue() != 0) {
                if (randomIndex < gift.getWeight()) {
                    receiving.add(gift);
                    gift.lowerValue();
                    break;
                }
                randomIndex -= gift.getWeight();
            }
        }
    }

    /**
     * Выдает игрушку
     * 
     * @return
     */
    public Gift receiveGift() {
        Gift gift = receiving.poll();
        logger.log(gift.toString());
        return gift;
    }

    private int getMaxValue() {
        int result = 0;
        for (Gift gift : giftList) {
            if (gift.getValue() > 0)
                result += gift.getWeight();
        }
        return result;
    }

    /**
     * Проверяет есть ли в очереди игрушки
     * 
     * @return
     */
    public boolean hasReceiving() {
        return !receiving.isEmpty();
    }
}