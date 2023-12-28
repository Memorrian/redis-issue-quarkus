package org.acme.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.util.List;

@Data
//@JsonTypeName("dog")
public class Dog extends Animal{


    private String age;
    private List<Channel> channels;
}
