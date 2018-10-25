package hu.elte.FoodDelivery.repositories;

import hu.elte.FoodDelivery.entities.Purchase;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    public List<Purchase> findAllByIsDelivered(Boolean b);
}
