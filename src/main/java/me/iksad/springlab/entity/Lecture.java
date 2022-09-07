package me.iksad.springlab.entity;

import lombok.Getter;
import lombok.ToString;
import me.iksad.springlab.Type.SubjectType;

import javax.persistence.*;
import java.util.Objects;

@ToString
@Getter
@Table(indexes = @Index(columnList = "name"))
@Entity
public class Lecture {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private SubjectType subject;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id.equals(lecture.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
