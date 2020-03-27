package repository;

import model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("SELECT c FROM Client c WHERE c.platitReparatie = :platit")
    List<Client> findClientsBy(@Param("platit") boolean platit);
}
