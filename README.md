# Arquitetura Spring

🎯 Uma base para projetos Java utilizando Spring Boot, focada em arquitetura limpa e boas práticas.

## Sobre o Projeto

Este repositório fornece uma estrutura inicial para projetos Java com o Spring Boot, promovendo organização de código, modularização e padrões de projeto recomendados para aplicações modernas.

## Principais Recursos

- **Spring Boot** para configuração simplificada e produtividade
- Organização baseada na arquitetura limpa (Clean Architecture)
- Suporte a dependências comuns: Spring Data JPA, Spring Web, etc.
- Estrutura preparada para testes automatizados
- Pronto para integração com bancos de dados relacionais

## Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     │   └── ...         # Pacotes separados por domínio (ex: controller, service, repository, model)
     └── resources/
         ├── application.properties
         └── ...
 └── test/
     └── java/
         └── ...         # Testes automatizados
```

## Como começar

1. **Clone o repositório**
   ```bash
   git clone https://github.com/laeciojn/arquitetura-spring.git
   ```
2. **Instale as dependências**
   - Use o [Maven](https://maven.apache.org/) ou [Gradle](https://gradle.org/) conforme indicado no projeto
   - Exemplo Maven:
      ```bash
      ./mvnw install
      ```
3. **Configure o banco de dados**
   - Edite o arquivo `src/main/resources/application.properties` com as credenciais do seu banco de dados

4. **Execute a aplicação**
   ```bash
   ./mvnw spring-boot:run
   ```

## Requisitos

- Java 17 ou superior
- Maven ou Gradle

## Contribuição

Contribuições são bem-vindas! Abra uma issue ou envie um pull request.

## Licença

Este projeto está sob a licença MIT.

---

Feito com ❤️ por [laeciojn](https://github.com/laeciojn)
