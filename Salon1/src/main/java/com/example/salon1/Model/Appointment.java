package com.example.salon1.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "staff_id" , referencedColumnName = "id")
    @JsonIgnore
    private Staff staff;

    @ManyToMany
    @JsonIgnore
    private Set<Serv> servs;

}
