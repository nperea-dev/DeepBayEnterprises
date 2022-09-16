package com.enterprise.AutosDB.entities;
import javax.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name="concept")
    public String concept;

    @Column(name="amount")
    public Float amount;

    @ManyToOne
    @JoinColumn(name="user_id")
    public User user;

    public Transaction(){
    }

    public  Transaction(String concept, Float amount, User user){
        this.amount = amount;
        this.concept = concept;
        this.user=user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
