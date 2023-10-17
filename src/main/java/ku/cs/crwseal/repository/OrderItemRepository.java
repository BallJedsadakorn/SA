package ku.cs.crwseal.repository;


import ku.cs.crwseal.entity.OrderItem;
import ku.cs.crwseal.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository
        extends JpaRepository<OrderItem, OrderItemKey> {
}
