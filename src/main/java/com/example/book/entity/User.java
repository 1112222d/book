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
    @NotBlank(message = "CMND must be not blank")
    @Column(unique = true)
    @Size(min = 10, max = 10)
    private String CMND;
    @NotBlank(message = "Full name must be not blank")
    @Size(min = 1, max = 255)
    private String fullName;
    @NotBlank(message = "Address must be not blank")
    @Size(max = 255)
    private String address;
    @Size(min = 10, max = 10)
    private String phone;
    @NotBlank(message = "Email must be not blank")
    @Email(message = "Email needs to be in the correct format")
    private String email;


}
