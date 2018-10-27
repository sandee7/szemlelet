package hu.elte.FoodDelivery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String product_name;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private int price;

    @Column
    @NotNull
    private boolean is_spicy;

    @Column
    @NotNull
    private boolean is_vegetarian;

    @Column
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime updated_at;
    
    /*@Column
    @NotNull
    private boolean categoryId;*/
    
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Purchase> purchase;
    
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Category category;//!!!INFO:itt es a Category mapjeben ugyanannak kell szerepelnie
}
