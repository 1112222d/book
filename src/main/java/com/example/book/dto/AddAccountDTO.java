package com.example.book.dto;

import com.example.book.entity.Account;
import com.example.book.entity.Role;
import com.example.book.entity.RoleName;
import com.example.book.entity.User;
import lombok.Data;

@Data
public class AddAccountDTO {
    private String username;
    private String password;
    private String CMND;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    public Account generateEntity() {
        Account account = new Account();
        Role role = new Role();
        account.setUsername(this.username);
        account.setPassword(this.password);
        role.setId(2L);
        role.setName(RoleName.ROLE_USER);
        account.setRole(role);
        User user= new User();
        user.setAddress(this.address);
        user.setCMND(this.CMND);
        user.setPhone(this.phone);
        user.setEmail(this.email);
        user.setFullName(this.fullName);
        user.setAccount(account);
        account.setUser(user);
        return account;
    }
}
