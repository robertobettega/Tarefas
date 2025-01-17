package com.esig.tarefas.controllers;

import com.esig.tarefas.model.Tarefa;
import com.esig.tarefas.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepository;

    @GetMapping
    public ResponseEntity getAll() {
        List<Tarefa> listTarefas = tarefaRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listTarefas);
    }
}
