package dar.internship.demo.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Employees")
@Data
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="name cannot be null")
    private String name;

    @NotNull(message="Status cannot be null")
    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;



}
