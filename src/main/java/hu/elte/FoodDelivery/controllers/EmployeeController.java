package hu.elte.FoodDelivery.controllers;

import hu.elte.FoodDelivery.entities.Employee;
import hu.elte.FoodDelivery.repositories.EmployeeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Employee>> getAll() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Employee> post(@RequestBody Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Integer id, @RequestBody Employee employee) {
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        if (optEmployee.isPresent()) {
            employee.setId(id);
            return ResponseEntity.ok(employeeRepository.save(employee));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete(@PathVariable Integer id) {
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        if (optEmployee.isPresent()) {
            employeeRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
