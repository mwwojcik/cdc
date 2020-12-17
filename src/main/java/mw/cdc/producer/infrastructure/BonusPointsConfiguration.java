package mw.cdc.producer.infrastructure;

import mw.cdc.producer.service.BonusPointsService;
import org.springframework.context.annotation.Bean;

public class BonusPointsConfiguration {
@Bean
public BonusPointsService bonusPointsService() {
 return new BonusPointsService() ;
 }

}
