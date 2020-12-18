package mw.cdc.producer.service;

import mw.cdc.producer.model.BonusPoints;

public class BonusPointsService {
    public BonusPoints check(String user){
        return BonusPoints.from(user,10);
    }
}
