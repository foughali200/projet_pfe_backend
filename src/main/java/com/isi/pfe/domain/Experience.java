package com.isi.pfe.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "experiences")
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String position;

    String company;

    LocalDate startDate;

    LocalDate endDate;

    String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
