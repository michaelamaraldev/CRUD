package com.michaelamaral.cadastro_usuario.business;

import com.michaelamaral.cadastro_usuario.infrastructure.entitys.Usuario;
import com.michaelamaral.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
@Service
public class UsuarioService {

    // Repositório usado para acessar o banco de dados
    private final UsuarioRepository repository;

    // Construtor da classe que recebe o repositório como dependência (injeção de dependência)
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Método para salvar um novo usuário no banco de dados
    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario); // salva e aplica imediatamente as mudanças
    }

    // Método para buscar um usuário pelo e-mail
    public Usuario buscarUsuarioPorEmail(String email) {
        // Tenta encontrar o usuário; se não encontrar, lança uma exceção
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado.")
        );
    }

    // Método para deletar um usuário usando o e-mail
    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }

    // Método para atualizar os dados de um usuário com base no ID
    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        // Busca o usuário no banco de dados pelo ID
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));

        // Atualiza os campos informados, mantendo os dados antigos caso não sejam informados
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() :
                        usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() :
                        usuarioEntity.getNome())
                .id(usuarioEntity.getId()) // mantém o mesmo ID
                .build();

        // Salva as alterações no banco
        repository.saveAndFlush(usuarioAtualizado);
    }
}