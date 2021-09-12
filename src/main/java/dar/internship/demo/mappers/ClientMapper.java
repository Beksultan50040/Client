package dar.internship.demo.mappers;

import dar.internship.demo.models.Client;
import dar.internship.demo.models.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);

    List<ClientDto> toDtos(List<Client> clientList);
}
