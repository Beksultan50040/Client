package dar.internship.demo.controller;

import dar.internship.demo.feign.MailFeign;
import dar.internship.demo.models.dto.ClientDto;
import dar.internship.demo.models.dto.MailDto;
import dar.internship.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private MailFeign mailFeign;

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


    @GetMapping("/check/openFeign/AllMails")
    public List<MailDto> findAllMails()
    {
        return mailFeign.findAll();
    }

    @GetMapping("/check/openFeign/mailsById")
    public MailDto findMailsById(@RequestParam Long id)
    {
        return mailFeign.findById(id);
    }
}
