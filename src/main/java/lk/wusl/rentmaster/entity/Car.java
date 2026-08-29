package lk.wusl.rentmaster.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long car_id;
    String brand;
    String model;
    Integer year;
    String category;
    Double pricePerDay;
    String fuelType;
    String transmission;
    Integer seats;
    Boolean available;
    Integer popularity;
    String image;


}
