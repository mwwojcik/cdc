package mw.cdc.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import mw.cdc.producer.infrastructure.AskMeController;
import mw.cdc.producer.infrastructure.BonusPointsController;
import mw.cdc.producer.model.BonusPoints;
import mw.cdc.producer.service.BonusPointsService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class BaseClass {

    private BonusPointsService bonusPointsService = Mockito.mock(BonusPointsService.class);

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new BonusPointsController(mockedBonusPointsService())
            ,new AskMeController());
    }

    public BonusPointsService mockedBonusPointsService() {
        Mockito.when(bonusPointsService.check("patron")).thenReturn(BonusPoints.from("patron", 100));
        Mockito.when(bonusPointsService.check("regular")).thenReturn(BonusPoints.from("regular", 10));
        return bonusPointsService;
    }

}
