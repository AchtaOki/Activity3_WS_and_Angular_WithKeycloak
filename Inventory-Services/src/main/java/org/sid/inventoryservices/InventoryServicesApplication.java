package org.sid.inventoryservices;

import org.sid.inventoryservices.entities.Product;
import org.sid.inventoryservices.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class InventoryServicesApplication {

    public static void main(String[] args) {

        SpringApplication.run(InventoryServicesApplication.class, args);
    }
    @Bean
CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Product.class);
          productRepository.saveAll(
                  List.of(
                          Product.builder().name("Computer").quantity(12).price(1200.0).build(),
                          Product.builder().name("Printer").quantity(32).price(120.0).build(),
                          Product.builder().name("SmartPhone").quantity(31).price(900.0).build()
                  )
          );
        };
}
}
