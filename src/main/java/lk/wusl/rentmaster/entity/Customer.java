package lk.wusl.rentmaster.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private String firstName;
    private String lastName;
    private String DrivingLicenseNumber;
    private String Address;
    private String phone;
    private String email;
    private String userName;
    private String password;
    private Role role;
    private LocalDate joinedDate;
}
