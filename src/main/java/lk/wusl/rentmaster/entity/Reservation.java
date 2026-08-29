package lk.wusl.rentmaster.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservation_id;
    private LocalDate pickupDate;
    private LocalTime pickupTome;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private Double totalPrice;
    private ReservationStatus status=ReservationStatus.PENDING;

}
