package br.com.amazonaws.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/teste")
public class TestController {
    private Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/{name}")
    public ResponseEntity<String> getName(@PathVariable String name) {
        LOG.info("Recebendo requisição do usuário: {}", name);
        return ResponseEntity.ok().body("Olá : " + name);
    }
}
