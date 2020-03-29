package repository;

import model.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicRepository  extends JpaRepository<Mechanic, Integer> {
}
