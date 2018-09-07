package ru.reservetable.prototype.reservetableclient.rest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
@Api(value = "", description = "API для обработки входящих от пользователей запросов")
public class ClientController {

    @GetMapping("/reserve")
    public ResponseEntity<String> reserveTable(){
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }

}
