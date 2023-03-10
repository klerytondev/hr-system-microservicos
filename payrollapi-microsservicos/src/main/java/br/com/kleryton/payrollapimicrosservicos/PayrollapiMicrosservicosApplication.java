package br.com.kleryton.payrollapimicrosservicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PayrollapiMicrosservicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollapiMicrosservicosApplication.class, args);
	}

}
