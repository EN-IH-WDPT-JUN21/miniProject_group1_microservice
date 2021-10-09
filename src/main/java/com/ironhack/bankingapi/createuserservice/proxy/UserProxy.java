package com.ironhack.bankingapi.createuserservice.proxy;

import com.ironhack.bankingapi.createuserservice.model.AccountHolder;
import com.ironhack.bankingapi.createuserservice.model.AccountHolderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("BANKING-API")
public interface UserProxy {

    @PostMapping("/api/v1/admin/create_account_holder")
    AccountHolder createAccountHolder(@RequestBody AccountHolderDTO accountHolderDTO);
}
