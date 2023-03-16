package ulaval.glo2003;

import org.glassfish.jersey.server.ResourceConfig;

public class ResourceConfigProvider {

    public ResourceConfig provide() {
        return new ResourceConfig()
                .register(new RootResource())
                .register(new DrinkResource());
    }
}
