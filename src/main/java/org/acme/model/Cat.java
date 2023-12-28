package org.acme.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
//@JsonTypeName("cat")
public class Cat extends Animal{


    private String age;
    private List<Channel> channels;
}
