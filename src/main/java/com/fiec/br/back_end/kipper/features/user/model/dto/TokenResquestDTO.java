package com.fiec.br.back_end.kipper.features.user.model.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "password")
public record TokenResquestDTO() {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String fcmToken;
}

