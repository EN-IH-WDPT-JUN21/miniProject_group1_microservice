package com.ironhack.bankingapi.createuserservice.controllers;

import com.ironhack.bankingapi.createuserservice.model.AccountHolder;
import com.ironhack.bankingapi.createuserservice.model.AccountHolderDTO;
import com.ironhack.bankingapi.createuserservice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/admin/create_account_holder")
    AccountHolder postAccountHolder(@RequestBody AccountHolderDTO accountHolderDTO){
        return  userService.postAccountHolder(accountHolderDTO);
    }
}
