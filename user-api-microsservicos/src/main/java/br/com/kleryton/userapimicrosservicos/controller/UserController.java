package br.com.kleryton.userapimicrosservicos.controller;

import br.com.kleryton.userapimicrosservicos.domain.dtos.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserController {

    static final String ID = "/{id}";

    @GetMapping(value = ID)
    ResponseEntity<UserDTO> findByID(@PathVariable Long id);

    @GetMapping(value = "/findall")
    ResponseEntity<List<UserDTO>> findAll();
}
