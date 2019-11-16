package com.training.complete.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RoleName roleName;
    @CreatedDate
    private LocalDate createdAt;
    @LastModifiedDate
    private LocalDate lastModified;
    @ManyToMany(mappedBy = "roles")
    Set<User> users = new HashSet<>();
}
