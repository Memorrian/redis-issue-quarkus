package org.acme;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.SneakyThrows;
import org.acme.model.Animal;
import org.acme.model.Cat;


@ApplicationScoped
public class CacheTestService {

    @Inject
    ObjectMapper objectMapper;

    @SneakyThrows
    @CacheResult(cacheName = "getAnimals")
    public Animal getAnimals() {
        Animal animal = new Cat();
        animal.setName("Tom");
        System.out.println(objectMapper.writeValueAsString(animal));
        return animal;
    }
}
