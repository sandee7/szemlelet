package hu.elte.FoodDelivery.repositories;

import hu.elte.FoodDelivery.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
    
}
