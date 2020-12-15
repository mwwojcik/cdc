package mw.cdc.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import mw.cdc.producer.infrastructure.MovieController;
import org.junit.jupiter.api.BeforeEach;

public class BaseClass {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new MovieController());
    }
}
