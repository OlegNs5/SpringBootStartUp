package ro.ctrln.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(schema = "", name = "battleship")
public class Battleship {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "battleship_name")
    private String battleshipName;

    @Column(name = "battleship_capacity")
    private int battleshipCapacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return id == that.id && battleshipCapacity == that.battleshipCapacity && Objects.equals(battleshipName, that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, battleshipName, battleshipCapacity);
    }
}
