package lk.wusl.rentmaster.repository;

import lk.wusl.rentmaster.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository< Customer,Long> {

}
