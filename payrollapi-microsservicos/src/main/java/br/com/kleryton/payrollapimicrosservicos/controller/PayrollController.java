package br.com.kleryton.payrollapimicrosservicos.controller;

import br.com.kleryton.payrollapimicrosservicos.domain.Payroll;
import br.com.kleryton.payrollapimicrosservicos.feignClients.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                new Payroll("Kleryton", "pagamento de março",
                        20.0, 100.0, 2000.0)
        );
    }

}
