package br.com.kleryton.payrollapimicrosservicos.feignClients;

import br.com.kleryton.payrollapimicrosservicos.domain.dtos.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api-microsservicos", url = "http://localhost:8080")
public interface UserFeign {

    static final String ID = "/{id}";

    @GetMapping(value = "/api/user/{id}")
    ResponseEntity<UserDTO> findByID(@PathVariable Long id);

    @GetMapping(value = "/findall")
    ResponseEntity<List<UserDTO>> findAll();
}
