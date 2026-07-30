package com.fiec.br.back_end.kipper.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "password")
public class UsersDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String fcmToken;
}
