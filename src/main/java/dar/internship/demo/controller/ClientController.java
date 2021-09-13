package dar.internship.demo.controller;

import dar.internship.demo.models.Client;
import dar.internship.demo.models.dto.ClientDto;
import dar.internship.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ClientDto save(@RequestBody ClientDto clientDto){
        return clientService.save(clientDto);
    }

    @PutMapping("/update")
    public ClientDto update(@RequestBody ClientDto clientDto){
        return clientService.update(clientDto);
    }

    @GetMapping("/{id}")
    public ClientDto findById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @GetMapping("/findAll")
    public List<ClientDto> findAll(){
        return clientService.findAll();
    }
}
