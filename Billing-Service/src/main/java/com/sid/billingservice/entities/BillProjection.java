package com.sid.billingservice.entities;

import com.sid.billingservice.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullBill",types = Bill.class)
public interface BillProjection {
  Long getId();
  Date billDate();
  Long getCustomerId();




}
