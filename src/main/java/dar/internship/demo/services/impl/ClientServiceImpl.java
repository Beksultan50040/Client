package dar.internship.demo.services.impl;

import dar.internship.demo.DAO.ClientRepo;
import dar.internship.demo.mappers.ClientMapper;
import dar.internship.demo.models.Client;
import dar.internship.demo.models.dto.ClientDto;
import dar.internship.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public ClientDto save(ClientDto clientDto) {

        Client client = ClientMapper.INSTANCE.toEntity(clientDto);
        client = clientRepo.save(client);
        return ClientMapper.INSTANCE.toDto(client);

    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        return null;
    }

    @Override
    public ClientDto findById(Long id) {

        Client client = clientRepo.findById(id).get();
        return ClientMapper.INSTANCE.toDto(client);

    }

    @Override
    public List<ClientDto> findAll() {
        return ClientMapper.INSTANCE.toDtos(clientRepo.findAll());
    }
}
