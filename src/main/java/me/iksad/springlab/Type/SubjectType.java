package me.iksad.springlab.Type;

import lombok.Getter;

@Getter
public enum SubjectType {
    MATH("math"), SCIENCE("sci"), ENGLISH("eng");

    private String name;
    SubjectType(String name) {this.name = name;}
}
