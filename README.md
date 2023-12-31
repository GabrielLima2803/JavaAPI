# Projeto API Spring Boot com MySQL

Este é um projeto de API desenvolvido no framework Spring Boot, utilizando a linguagem Java e conectando-se ao banco de dados MySQL. A API foi criada para fornecer serviços RESTful e interagir com um banco de dados MySQL para operações de CRUD (Create, Read, Update, Delete).

## Configurações do Projeto

### Tecnologias Utilizadas

- Spring Boot 3.2.0
- Java 17
- MySQL 8.0.30

### Dependências

O projeto utiliza as seguintes dependências principais:

- `spring-boot-starter-web`: Fornece configurações para criar aplicativos web com o Spring MVC.
- `spring-boot-starter-data-jpa`: Facilita a interação com bancos de dados usando o Spring Data JPA.
- `mysql-connector-java`: Driver JDBC para MySQL...

## Configuração do Banco de Dados

A configuração do banco de dados pode ser ajustada no arquivo `application.properties` localizado em `src/main/resources`. Certifique-se de fornecer as informações corretas de URL, usuário e senha do MySQL.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
## Como Executar o Projeto

Para executar o projeto, utilize a seguinte sequência de comandos:

```bash
# Certifique-se de ter o Maven instalado
mvn spring-boot:run
```

## Autor

Este projeto foi desenvolvido por:

- **Nome: Gabriel Lima De Souza**
- **Turma: 2info2**
- **E-mail:** [gabriellima2803@gmail.com]