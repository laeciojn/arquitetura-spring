package br.com.laeciojn.arquiteturaspring.todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final TodoValidator validator;
    private final MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidator validator, MailSender mailSender) {
        this.repository = todoRepository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(@RequestBody TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não concluído";
        mailSender.enviarMensagem("Todo " + todo.getDescricao() + " foi atualizado para " + status);
    }

    public TodoEntity buscarId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
