package com.etiya.northwind.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "title")
    private String title;

    @Column(name="reports_to")
    private int reportsTo;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country ;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city ;
}