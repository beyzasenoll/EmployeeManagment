package net.crudwebapplications.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    // bu alanın otomatik olarak artan bir şekilde (identity) oluşturulacağını belirtir.
    private Long id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email",nullable = false,unique = true)
    //bu sütunun boş bırakılamayacağını ve benzersiz olması gerektiğini belirtir
    private String email;
}
