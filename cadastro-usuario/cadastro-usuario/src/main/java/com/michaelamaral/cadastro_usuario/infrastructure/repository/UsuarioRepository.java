package com.michaelamaral.cadastro_usuario.infrastructure.repository;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.michaelamaral.cadastro_usuario.infrastructure.entitys.Usuario;
import java.util.Optional;

/**
 * Interface responsável por acessar e manipular dados da entidade Usuario.
 * Estende JpaRepository para fornecer operações de CRUD sem necessidade de implementação manual.
 */
@Repository public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Busca um usuário pelo e-mail
    Optional<Usuario> findByEmail(String email);
    // Deleta um usuário pelo e-mail
    @Transactional
    void deleteByEmail(String email);
}