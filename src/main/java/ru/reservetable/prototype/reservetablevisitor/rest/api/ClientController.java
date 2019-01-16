package ru.reservetable.prototype.reservetablevisitor.rest.api;

//import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.reservetable.prototype.reservetablevisitor.rest.domain.Client;

@RestController
@RequestMapping("/api/client")
//@Api(value = "", description = "API для обработки входящих от пользователей запросов")
public class ClientController {

    @GetMapping("/reserve")
    public ResponseEntity<String> reserveTable(){
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Client> registerClient(@RequestBody(required = false) Client client) {
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}
