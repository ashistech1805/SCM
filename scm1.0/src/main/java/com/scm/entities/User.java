package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import com.scm.enums.Providers;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user", schema = "appschema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String userId;
  private String name;
  private String about;
  @Column(unique = true, nullable = true)
  private String email;
  private String password;
  private String phoneNumber;
  private String profilePic;

  private boolean enabled =false;
  private boolean emailVerified = false;
  private boolean phoneNumberVerified = false;

  private Providers provider = Providers.SELF;
  private String providerUserId;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval = true)
  private List <Contact> contacts =new ArrayList();

    
}
