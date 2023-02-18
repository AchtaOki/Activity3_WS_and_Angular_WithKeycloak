package org.sid.custumerservice;

import org.sid.custumerservice.entities.Customer;
import org.sid.custumerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class CustumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustumerServiceApplication.class, args);}
@Bean
   public CommandLineRunner commandLineRunner(CustomerRepository customerRepository,
                                              RepositoryRestConfiguration restConfiguration){
       return args ->{
           restConfiguration.exposeIdsFor(Customer.class);
       customerRepository.saveAll(
        List.of(
                Customer.builder().name("Achta").email("okiachtaissa@gmail.com").build(),
                Customer.builder().name("Issa").email("okiachtaissa@gmail.com").build(),
                Customer.builder().name("Oki").email("okiachtaissa@gmail.com").build()
        )
);
customerRepository.findAll().forEach(c->{
    System.out.println(c);
});
       };
        }

    }




