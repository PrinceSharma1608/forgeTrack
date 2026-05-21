package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class Users {
    public enum UserRole {
        ADMIN,
        SUPERVISOR,
        WORKER,
        TEAM_LEADER
    }
    @Id
    @Column(name = "user_tkt")
    private Integer userTkt;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @Column(name="user_password")
    private String userPassword;
}
