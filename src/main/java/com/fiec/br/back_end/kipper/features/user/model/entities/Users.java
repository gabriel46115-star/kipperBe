package com.fiec.br.back_end.kipper.features.user.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "users")
@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "password")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "fcm_token", length = 255)
    private String fcmToken;
}