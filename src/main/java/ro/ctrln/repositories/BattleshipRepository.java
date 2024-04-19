package ro.ctrln.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.ctrln.entities.Battleship;

import java.util.List;

public interface BattleshipRepository extends CrudRepository<Battleship, Long> {

    List<Battleship> findAll();
}
