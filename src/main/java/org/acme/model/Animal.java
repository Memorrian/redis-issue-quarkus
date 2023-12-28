package org.acme.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS/*,
        include = JsonTypeInfo.As.PROPERTY, property = "class"*/)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class),
        @JsonSubTypes.Type(value = Dog.class)
})
public class Animal {
    private String name;
}
