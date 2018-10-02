package hu.elte.FoodDelivery.repositories;

import hu.elte.FoodDelivery.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
    
}
