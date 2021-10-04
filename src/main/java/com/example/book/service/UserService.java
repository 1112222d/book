package com.example.book.service;

import com.example.book.dto.UserDTO;
import com.example.book.entity.Account;
import com.example.book.entity.User;

import java.util.List;

public interface UserService {
    public List<UserDTO> getAll();
    public UserDTO insert(Account account);

}
