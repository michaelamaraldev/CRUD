package com.michaelamaral.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter // Gera automaticamente os métodos getters
@Setter // Gera automaticamente os métodos setters
@AllArgsConstructor // Gera construtor com todos os atributos
@NoArgsConstructor // Gera construtor sem argumentos
@Builder // Permite uso do padrão de projeto Builder
@Table(name = "usuario") // Define o nome da tabela no banco de dados
@Entity // Indica que esta classe é uma entidade JPA
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}
