package mw.cdc;

import mw.cdc.producer.infrastructure.BonusPointsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BonusPointsConfiguration.class})
public class CdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdcApplication.class, args);
	}

}
