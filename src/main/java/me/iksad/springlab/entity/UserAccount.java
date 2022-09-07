package me.iksad.springlab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@ToString
@Getter
@Table(indexes = @Index(columnList = "email"))
@Entity
public class UserAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;

    @Setter
    private String password;

    @Setter @Column(nullable = false, unique = true)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
