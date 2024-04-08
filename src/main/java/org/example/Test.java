package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Test {
    private int number;
    private String name;
    @Setter(AccessLevel.PROTECTED)
    private String directory;
}