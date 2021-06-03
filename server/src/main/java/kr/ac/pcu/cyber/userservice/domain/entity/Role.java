package kr.ac.pcu.cyber.userservice.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;

    @Getter
    private RoleType roleType;

    public Role(String userId, RoleType roleType) {
        this.userId = userId;
        this.roleType = roleType;
    }

    public Role(RoleType roleType) {
        this(null, roleType);
    }
}
