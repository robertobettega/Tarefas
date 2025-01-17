package com.esig.tarefas.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String email;
    private String senha;
}
