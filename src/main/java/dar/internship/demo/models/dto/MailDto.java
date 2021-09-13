package dar.internship.demo.models.dto;

import lombok.Data;

@Data
public class MailDto {


    private Long id;

    private String name;
    private String status;
    private ClientDto client;
}
