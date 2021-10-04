package com.example.book.controller;

import com.example.book.dto.AddAccountDTO;
import com.example.book.dto.UserDTO;
import com.example.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUser()
    {
        return ResponseEntity.ok(userService.getAll());
    }
    @PostMapping
    public ResponseEntity<UserDTO> insert(@Valid @RequestBody AddAccountDTO addAccountDTO)
    {
        return ResponseEntity.ok(userService.insert(addAccountDTO.generateEntity()));
    }
}
