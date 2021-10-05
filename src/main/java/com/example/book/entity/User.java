package com.example.book.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username")
    private String username;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "username")
    private Account account;
    private String CMND;
    private String fullName;
    private String address;
    private String phone;
    private String email;


}
