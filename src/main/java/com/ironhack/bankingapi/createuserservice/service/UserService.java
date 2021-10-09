package com.ironhack.bankingapi.createuserservice.service;

import com.ironhack.bankingapi.createuserservice.model.AccountHolder;
import com.ironhack.bankingapi.createuserservice.model.AccountHolderBuilder;
import com.ironhack.bankingapi.createuserservice.model.AccountHolderDTO;
import com.ironhack.bankingapi.createuserservice.proxy.UserProxy;
import com.ironhack.bankingapi.createuserservice.repositories.AddressRepository;
import com.ironhack.bankingapi.createuserservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserProxy userProxy;
    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;
    public AccountHolder postAccountHolder(AccountHolderDTO accountHolderDTO){
        AccountHolder accountHolder = AccountHolderBuilder.build(accountHolderDTO);
        addressRepository.save(accountHolder.getAddress());
        if (accountHolder.getMailingAddress()!=null){
            addressRepository.save(accountHolder.getMailingAddress());
        }
        return userRepository.save(accountHolder);
    }
}
