package hu.elte.FoodDelivery.repositories;

import hu.elte.FoodDelivery.entities.Category;
import hu.elte.FoodDelivery.entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
   @OneToMany
    public List<Product> categoryOfOrderedFood = new ArrayList<>();
}
