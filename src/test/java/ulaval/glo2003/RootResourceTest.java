package ulaval.glo2003;

import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class RootResourceTest extends JerseyTest {

    // FOR JUNIT 5
    @BeforeEach
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @AfterEach
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
    // END FOR

    @Override
    protected Application configure() {
        return new ResourceConfigProvider().provide();
    }

    @Test
    void works() {
        Response response = target("/").request().get();
        assertThat(response.getStatus()).isEqualTo(200);
    }
}
