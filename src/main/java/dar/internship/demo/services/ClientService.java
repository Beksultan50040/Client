package dar.internship.demo.services;

import dar.internship.demo.models.Client;
import dar.internship.demo.models.dto.ClientDto;

import java.util.List;

public interface ClientService {

    ClientDto save(ClientDto clientDto);
    ClientDto update(ClientDto clientDto);
    ClientDto findById(Long id);
    List<ClientDto> findAll();
}
