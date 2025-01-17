package com.esig.tarefas.repositories;

import com.esig.tarefas.domain.user.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<usuario, String> {
    Optional<usuario> findByEmail(String email);
}
