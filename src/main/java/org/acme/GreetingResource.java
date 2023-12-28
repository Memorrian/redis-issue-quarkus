package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.Animal;

@Path("/api")
public class GreetingResource {

    @Inject
    CacheTestService cacheTestService;


    @GET
    @Path("/getAnimals")
    @Produces(MediaType.TEXT_PLAIN)
    public Animal getAnimals() {

        Animal firstResult = cacheTestService.getAnimals();
        Animal cachedResult = cacheTestService.getAnimals();

        return cachedResult;
    }

}
