package com.sid.billingservice.repository;

import com.sid.billingservice.entities.Bill;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long> {
    @RestResource(path="/byCustomerId")
    List<Bill> findByCustomerId(@Param("customerId") Long customerId);
}
