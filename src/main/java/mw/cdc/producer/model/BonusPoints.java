package mw.cdc.producer.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BonusPoints {

    private String user;
    private int amount;

    public BonusPoints(String user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public static BonusPoints from(String user, int amount) {
        return new BonusPoints(user, amount);
    }

}
