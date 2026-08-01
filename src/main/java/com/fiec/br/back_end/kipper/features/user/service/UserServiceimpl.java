package com.fiec.br.back_end.kipper.features.user.service;

import com.fiec.br.back_end.kipper.features.user.model.dto.TokenResquestDTO;
import com.fiec.br.back_end.kipper.features.user.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceimpl implements UserService{

    private UserRepository userRepository;
    @Override
    public void setToken(TokenResquestDTO tokenResquestDTO){
        User user = userRepository.;
    }


}
