package com.microservice.authentication.Authentication.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customers")
@AllArgsConstructor @NoArgsConstructor
public class Customers {

    @Id
    @Column(name = "CUSTOMER_ID")
    @Getter @Setter
    private Integer id;

    @OneToMany(mappedBy = "customers")
    @Getter @Setter
    private Set<Sales> sales;



    @Column(name = "NAMES", length = 50)
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank
    private String names;

    @Column(name = "LAST_NAMES",length = 50)
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank
    private String lastNames;

    @Column(name = "CREDENTIALS",length = 50)
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank
    private String credentials;


    @Column(name = "EMAIL",length = 50)
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank
    private String email;

    @Column(name = "PHONE_NUMBER",length = 50)
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank
    private String phoneNumber;

    @Column(name = "BIRTH_DATE")
    @Setter @Getter
    @NotEmpty @NotNull @NotBlank    
    private Date birthDate;


}
