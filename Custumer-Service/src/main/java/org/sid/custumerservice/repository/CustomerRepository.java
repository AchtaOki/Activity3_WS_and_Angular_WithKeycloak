package org.sid.custumerservice.repository;

import org.sid.custumerservice.entities.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public static void main(String[] args){
       // SpringApplication.run(CustomerServiceApplication.class, args);
    }

}
