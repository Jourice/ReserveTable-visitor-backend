package ru.reservetable.prototype.reservetablevisitor.rest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.reservetable.prototype.reservetablevisitor.rest.domain.Client;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @GetMapping("/reserve")
    public ResponseEntity<String> reserveTable(){
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Client> registerClient(@RequestBody(required = false) Client client) {
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @PostMapping("/comindware")
    public ResponseEntity<String> testPriLoad(@RequestBody(required = false) String rpiJson) {
        System.out.println("Hello, logs!");
        if (rpiJson != null) {
            return new ResponseEntity<>(rpiJson, HttpStatus.OK);
        }
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }
}
