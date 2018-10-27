package hu.elte.FoodDelivery.repositories;

import hu.elte.FoodDelivery.entities.Employee;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    Optional<Employee> findByUsername(String username);
}
