package br.com.laeciojn.arquiteturaspring.montadora.api;

import br.com.laeciojn.arquiteturaspring.montadora.Chave;
import br.com.laeciojn.arquiteturaspring.montadora.HondaHRV;
import br.com.laeciojn.arquiteturaspring.montadora.Motor;
import br.com.laeciojn.arquiteturaspring.montadora.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
