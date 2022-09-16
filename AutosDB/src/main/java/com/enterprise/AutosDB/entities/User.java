package com.enterprise.AutosDB.entities;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="email", unique = true)
    public String email;

    @Column(name="image")
    private String image;

    @Column(name="auth0Id", unique = true)
    private String auth0Id;

    @Column(name="role")
    private String role;

    @ManyToOne
    @JoinColumn(name="enterprise_id")
    public Enterprise enterprise;

    public User(){
    }

    public User(String email, String image, String auth0Id, String role){
        this.email = email;
        this.image=image;
        this.auth0Id=auth0Id;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
