package com.fiec.br.back_end.kipper.features.user.controller;


import com.fiec.br.back_end.kipper.features.user.model.dto.TokenResquestDTO;
import com.fiec.br.back_end.kipper.features.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PutMapping
    ResponseEntity<Void> setToken(@ResponseBody TokenResquestDTO tokenResquestDTO){
        userService.setToken(tokenResquestDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    ResponseEntity<Void> createUser(@ResponseBody CreateUserRequestDTO createUserRequestDTO){
        userService.createUser(createUserRequestDTO);
        return new ResponseEntity<>()
    }
}
