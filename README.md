# Projeto Backend Seguro com Spring Security e Java 21

Este é um projeto pessoal focado na implementação de um backend seguro utilizando Spring Security e Java 21.

## Objetivo

O objetivo deste projeto é garantir uma robusta gestão de segurança, autenticação e autorização de rotas em um ambiente de desenvolvimento backend.

## Tecnologias Utilizadas

- Spring Security
- Java 21
- JSON Web Token (JWT)
- Flyway
- Postman
- Docker
- Render

## Funcionalidades Implementadas

- Implementação de um sistema de segurança robusto com Spring Security.
- Utilização do JWT para geração de tokens, assegurando uma comunicação segura entre frontend e backend.
- Gerenciamento de migrações de banco de dados de forma automatizada e controlada com Flyway.
- Teste e validação das APIs desenvolvidas utilizando o Postman.
- Deploy das APIs utilizando Docker e hospedagem no Render, permitindo que as APIs estejam disponíveis publicamente.


## Como Utilizar

1. Clone este repositório.
2. Execute as migrações do banco de dados utilizando o Flyway para garantir a estrutura necessária.
3. Inicie a aplicação.
4. Utilize o Postman para testar e validar as APIs desenvolvidas.
5. Para começar, o usuário deve se registrar como um novo usuário, fornecendo um email e uma senha.
6. Após o registro, o usuário pode fazer login fornecendo suas credenciais.
7. Ao fazer login com sucesso, o usuário receberá um token de acesso no corpo da resposta.
8. Este token de acesso deve ser usado em todas as solicitações subsequentes como um cabeçalho de autorização do tipo Bearer Token.
9. Se o usuário tiver a role de admin, ele poderá criar cavalos. Verifique a migration de usuário para ver se o usuário foi concedido com a role de admin.


## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
