package ma.fst.amine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String name_user;

    private String email_user;

    public User() {
    }

    public Long getId() {
        return id_user;
    }

    public void setId(Long id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name_user;
    }

    public void setName(String name_user) {
        this.name_user = name_user;
    }

    public String getEmail() {
        return email_user;
    }

    public void setEmail(String email_user) {
        this.email_user = email_user;
    }
}