# API REST de Produtos

Este projeto é uma API REST desenvolvida em Java com Spring Boot, focada em operações de CRUD (Create, Read, Update, Delete) de produtos. Ideal para projetos de catálogo, inventário ou sistemas de gerenciamento de estoque.

## 🔧 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA**
* **Spring Web**
* **H2 Database (ambiente de testes)**
* **Lombok**
* **Maven**

## 🚀 Funcionalidades

* ✅ Criar produto
* ✅ Listar todos os produtos
* ✅ Buscar produto por ID
* ✅ Atualizar produto
* ✅ Deletar produto

## 📁 Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     │    └── com.tiagomolero.apirest
     │         ├── controller
     │         ├── model
     │         ├── repository
     │         └── ApirestProdutosApplication.java
     └── resources/
          ├── application.properties
```

## 🛆 Como Executar Localmente

1. Clone o repositório:

```bash
git clone https://github.com/tiagomolero/apirest-produtos.git
```

2. Acesse o diretório:

```bash
cd apirest-produtos
```

3. Compile e execute o projeto:

```bash
./mvnw spring-boot:run
```

4. Acesse a API localmente:

```
http://localhost:8080/produtos
```

## 🔄 Endpoints

| Método | Endpoint         | Descrição                 |
| ------ | ---------------- | ------------------------- |
| GET    | `/produtos`      | Lista todos os produtos   |
| GET    | `/produtos/{id}` | Retorna um produto por ID |
| POST   | `/produtos`      | Cria um novo produto      |
| PUT    | `/produtos/{id}` | Atualiza um produto       |
| DELETE | `/produtos/{id}` | Remove um produto por ID  |

## 🥪 Testes

> A API usa banco de dados H2 em memória por padrão, facilitando testes locais.
> É possível visualizar o console H2 acessando:
> `http://localhost:8080/h2-console`
>
> * JDBC URL: `jdbc:h2:mem:testdb`

## 📌 Considerações

Este projeto tem fins educativos e de prática em construção de APIs REST com Spring Boot. Ideal para quem deseja aprender os fundamentos de uma arquitetura simples e funcional.

## 📢 Contato

* [LinkedIn](https://www.linkedin.com/in/tiagomolero/)
* [GitHub](https://github.com/tiagomolero)
