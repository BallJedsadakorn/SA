package ku.cs.crwseal.repository;


import ku.cs.crwseal.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
