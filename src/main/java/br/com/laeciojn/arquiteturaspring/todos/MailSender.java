package br.com.laeciojn.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviarMensagem(String mensagem){
        System.out.println("Enviado email: " + mensagem);
    }
}
