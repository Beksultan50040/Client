package dar.internship.demo.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class ClientDto {


    private Long id;

    private String firstName;
    private String lastName;
}
