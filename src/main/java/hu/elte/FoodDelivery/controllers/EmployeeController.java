package hu.elte.FoodDelivery.controllers;

import hu.elte.FoodDelivery.entities.Employee;
import hu.elte.FoodDelivery.entities.Purchase;
import hu.elte.FoodDelivery.repositories.EmployeeRepository;
import hu.elte.FoodDelivery.repositories.PurchaseRepository;
//import hu.elte.FoodDelivery.security.AuthenticatedUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    
    @Autowired
    private PurchaseRepository purchaseRepository;
    
    /*@Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired 
    private AuthenticatedUser authenticatedEmployee;*/
     
    @GetMapping("")
    public ResponseEntity<Iterable<Employee>> getAll() {
       /* Employee employee = authenticatedEmployee.getEmployee();
        Employee.Role role = employee.getRole();
        if (role.equals(Employee.Role.ROLE_EMPLOYEE)) {
            return ResponseEntity.ok(employeeRepository.findAll());
        } else {
            return ResponseEntity.notFound().build();
        }*/
       return ResponseEntity.ok(employeeRepository.findAll());
    }
    
    /*@PostMapping("register")
    public ResponseEntity<Employee> register(@RequestBody Employee user) {
        Optional<Employee> oUser = employeeRepository.findByUsername(user.getUsername());
        if (oUser.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        user.setRole(Employee.Role.ROLE_EMPLOYEE);
        return ResponseEntity.ok(employeeRepository.save(user));
    }
     
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Employee user) {
        return ResponseEntity.ok().build();
    }*/
    
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
    
    @GetMapping("/purchases")
    public ResponseEntity<Iterable<Purchase>> getPurchases() {
        return ResponseEntity.ok(purchaseRepository.findAll());
    }
        
    @GetMapping("/purchases/delivered")
    public ResponseEntity<Iterable<Purchase>> getDeliveredPurchases() {
        List<Purchase> deliveredPurchases = new ArrayList<>();
        deliveredPurchases = purchaseRepository.findAllByIsDelivered(true);
        if(deliveredPurchases.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deliveredPurchases);
    }
    
    
    @GetMapping("/purchases/notDelivered")
    public ResponseEntity<Iterable<Purchase>> getNotDeliveredPurchases() {
        List<Purchase> deliveredPurchases = new ArrayList<>();
        deliveredPurchases = purchaseRepository.findAllByIsDelivered(false);
        if(deliveredPurchases.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deliveredPurchases);
    }
}
