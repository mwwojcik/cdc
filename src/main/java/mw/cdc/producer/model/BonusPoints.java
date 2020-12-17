package mw.cdc.producer.model;

import java.util.UUID;

public class BonusPoints {

    private UUID user;
    private int amount;

    public BonusPoints(UUID user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public static BonusPoints from(UUID user, int amount) {
        return new BonusPoints(user, amount);
    }


}
