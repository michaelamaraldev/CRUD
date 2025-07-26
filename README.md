# 👨‍💻 Cadastro Usuário: Serviço de Cadastro de Usuários (CRUD)

Este projeto é um CRUD em Spring Boot que fornece APIs RESTful para gerenciar dados de usuários. Permite criar, recuperar, atualizar e deletar informações de usuários, utilizando Spring Data JPA para interações com o banco de dados e Lombok para reduzir código repetitivo. Usa um banco de dados H2 para desenvolvimento e testes.

## 🔧 Principais Funcionalidades

- **Criação de Usuário**: permite cadastrar novos usuários via endpoint REST.
- **Recuperação de Usuário**: permite buscar dados do usuário pelo e-mail.
- **Atualização de Usuário**: suporta atualizar informações de usuário existente pelo ID.
- **Deletar User**: permite deletar contas de usuários pelo email.
- **In-Memory Database**: usa banco H2 para configuração rápida e testes.
- **RESTful API**: expõe todas as funcionalidades por endpoints REST.
- **Desenvolvimento Simplificado**: Lombok para reduzir código repetitivo.
- **Configuração**: configurado via `application.properties` para fácil personalização.

## 🛠️ Tecnologias Utilizadas

- **Backend**: Java, Spring Boot
- **Banco de Dados**: H2
- **ORM**: Spring Data JPA
- **Build Tool**: Maven
- **Utilities**: Lombok
- **Teste de API**: Postman

## 🚀 Como começar

### Pré-requisitos

- Java Development Kit (JDK) 17 ou superior
- Maven
- Uma IDE como IntelliJ IDEA ou Eclipse
- Conhecimentos básicos em Spring Boot e APIs RESTful

### Instalação

1.  Clone o repositório:

    ```bash
    git clone <repository-url>
    cd cadastro-usuario
    cd cadastro-usuario
    ```

2.  Compile o projeto com Maven:

    ```bash
    mvn clean install
    ```

### Rodando Localmente

1.  Execute a aplicação:

    ```bash
    mvn spring-boot:run
    ```

2.  Acesse o console do H2:

    - Abra o navegador e acesse `http://localhost:8081/h2-console`.
    - Use a URL JDBC: `jdbc:h2:mem:usuario`
    - Username: `michaelamaraldev`
    - Password: `123`

## 💻 Uso

A aplicação expõe os seguintes endpoints REST:

-   **POST /usuario**: cria um novo usuário.
    ```json
    {
        "nome": "Maria",
        "email": "maria@examplo.com"
    }
    ```
-   **GET /usuario?email={email}**: recupera um usuário pelo e-mail.
-   **PUT /usuario?id={id}**: atualiza um usuário pelo ID.
    ```json
    {
        "nome": "Atualiza o nome",
        "email": "joaquina@examplo.com"
    }
    ```
-   **DELETE /usuario?email={email}**: aualiza um usuário pelo ID.

## 📂 Estrutura do Projeto

```
cadastro-usuario/
├── cadastro-usuario/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │   │   ├── michaelamaral/
│   │   │   │   │   │   ├── cadastro_usuario/
│   │   │   │   │   │   │   ├── CadastroUsuarioApplication.java
│   │   │   │   │   │   │   ├── business/
│   │   │   │   │   │   │   │   ├── UsuarioService.java
│   │   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   │   ├── UsuarioController.java
│   │   │   │   │   │   │   ├── infrastructure/
│   │   │   │   │   │   │   │   ├── entitys/
│   │   │   │   │   │   │   │   │   ├── Usuario.java
│   │   │   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   │   │   │   ├── UsuarioRepository.java
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
```

## 📸 Prints


<img width="1920" height="1047" alt="1" src="https://github.com/user-attachments/assets/90f321f2-fa32-410d-ae0e-f5888a8102dd" />
<img width="1920" height="1047" alt="2" src="https://github.com/user-attachments/assets/ef0cc3ce-65ba-4891-b358-bf66ca083fba" />
<img width="1920" height="1047" alt="3" src="https://github.com/user-attachments/assets/6e406baa-c060-4b41-8ac3-fa903964e6a7" />
<img width="1920" height="1047" alt="4" src="https://github.com/user-attachments/assets/fd9220fb-c5a4-4e1c-94be-e33148e5071a" />
<img width="1920" height="1047" alt="5" src="https://github.com/user-attachments/assets/456f3caf-3ebd-405f-82e9-0cf566c3ea0d" />
<img width="1273" height="794" alt="6" src="https://github.com/user-attachments/assets/929de834-a180-4154-968f-f6583ef911a2" />
<img width="1920" height="963" alt="H2 Console" src="https://github.com/user-attachments/assets/0e07dde6-106f-45d8-9823-35a7f4811515" />


## 🤝 Contribuições

Contribuições são bem-vindas! Por favor, siga os passos:

1.  Fork no repositório.
2.  Crie uma branch para sua feature ou correção.
3.  Faça as alterações e commite com mensagens descritivas.
4.  Faça push para o seu fork.
5.  Abra uma pull request.

## 📝 Licença

Este projeto está licenciado sob a [MIT License](LICENSE) - veja o arquivo LICENSE para mais detalhes.

## 📬 Contato

Michael Amaral - michaelzerotreze@gmail.com

## ❤️ Agradecimento

Obrigado por conferir meu projeto! Espero que seja útil. Fique à vontade para contribuir e deixá-lo ainda melhor!
