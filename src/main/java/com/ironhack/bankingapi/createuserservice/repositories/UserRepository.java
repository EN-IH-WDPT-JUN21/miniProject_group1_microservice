package com.ironhack.bankingapi.createuserservice.repositories;

import com.ironhack.bankingapi.createuserservice.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AccountHolder, Long> {
}
