package com.ironhack.bankingapi.createuserservice.repositories;

import com.ironhack.bankingapi.createuserservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
