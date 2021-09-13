package dar.internship.demo.feign;

import dar.internship.demo.models.dto.MailDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;



@FeignClient(name = "eureka-mail-service")
public interface MailFeign {

    @GetMapping("/api/v1/employee/findAll")
    List<MailDto> findAll();

    @GetMapping("/api/v1/employee/{id}")
    MailDto findById(@RequestParam Long id);
}
