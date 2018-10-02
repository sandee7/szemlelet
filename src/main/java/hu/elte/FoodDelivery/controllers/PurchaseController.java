package hu.elte.FoodDelivery.controllers;

import hu.elte.FoodDelivery.entities.Purchase;
import hu.elte.FoodDelivery.repositories.PurchaseRepository;
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
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Purchase>> getAll() {
        return ResponseEntity.ok(purchaseRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Purchase> get(@PathVariable Integer id) {
        Optional<Purchase> purchase = purchaseRepository.findById(id);
        if (purchase.isPresent()) {
            return ResponseEntity.ok(purchase.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Purchase> post(@RequestBody Purchase purchase) {
        Purchase savedPurchase = purchaseRepository.save(purchase);
        return ResponseEntity.ok(savedPurchase);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Purchase> update(@PathVariable Integer id, @RequestBody Purchase purchase) {
        Optional<Purchase> optPurchase = purchaseRepository.findById(id);
        if (optPurchase.isPresent()) {
            purchase.setId(id);
            return ResponseEntity.ok(purchaseRepository.save(purchase));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Purchase> delete(@PathVariable Integer id) {
        Optional<Purchase> optPurchase = purchaseRepository.findById(id);
        if (optPurchase.isPresent()) {
            purchaseRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
