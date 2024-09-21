package fr.wetrust.sfr.telfixe;

import fr.wetrust.sfr.telfixe.config.AsyncSyncConfiguration;
import fr.wetrust.sfr.telfixe.config.EmbeddedElasticsearch;
import fr.wetrust.sfr.telfixe.config.EmbeddedSQL;
import fr.wetrust.sfr.telfixe.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { SfrTelFixePlateformeApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
