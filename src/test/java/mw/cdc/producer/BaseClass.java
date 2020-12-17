package mw.cdc.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import mw.cdc.producer.infrastructure.BonusPointsController;
import mw.cdc.producer.service.BonusPointsService;
import org.junit.jupiter.api.BeforeEach;

public class BaseClass {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new BonusPointsController(new BonusPointsService()));
    }
}
