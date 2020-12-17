package mw.cdc.producer.service;

import java.util.UUID;
import mw.cdc.producer.model.BonusPoints;

public class BonusPointsService {
    public BonusPoints check(UUID user){
        return BonusPoints.from(user,10);
    }
}
