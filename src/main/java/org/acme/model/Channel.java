package org.acme.model;

import lombok.Builder;
import lombok.Data;

@Builder
public class Channel {
    private String id;
    private String name;
}
