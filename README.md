# 📚 GraphQL + REST Book Service

This project is a **Spring Boot** application that exposes **both GraphQL and REST APIs** for managing books.  
You can create, fetch all, and fetch by ID using **GraphQL queries/mutations** as well as **traditional REST endpoints**.

---

## 🚀 Features
- GraphQL API for flexible queries and mutations
- REST API for standard endpoints
- Hybrid setup (both REST + GraphQL supported)
- Uses Spring Data JPA with Book entity

---

## 🏗️ Project Structure

```

src/main/java/com/graphql/graphQl
┣ 📂 controllers   # REST + GraphQL controllers
┣ 📂 entitis       # Book entity + input DTO
┣ 📂 repositiory   # Spring Data JPA repo
┣ 📂 services      # Service interface
┣ 📂 services/impl # Service implementation

````

---

## ⚙️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/your-username/book-graphql-service.git
cd book-graphql-service
````

### 2. Configure Database

Update your `application.properties` (or `application.yml`) with your DB configs:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the application

```bash
mvn spring-boot:run
```

---

## 🔗 REST API Endpoints

| Method | Endpoint          | Description     |
| ------ | ----------------- | --------------- |
| POST   | `/api/books`      | Create new book |
| GET    | `/api/books`      | Get all books   |
| GET    | `/api/books/{id}` | Get book by ID  |

📌 Example `POST /api/books`

```json
{
  "title": "GraphQL Guide",
  "desc": "Learn GraphQL with Spring Boot",
  "price": 299.99,
  "author": "Kunal",
  "pages": 350
}
```

---

## 🔮 GraphQL API

Visit the GraphQL endpoint (default: `http://localhost:8080/graphql`) and run queries:

### ✅ Mutation - Create Book

```graphql
mutation {
  createBook(book: {
    title: "GraphQL in Action",
    desc: "Complete guide to GraphQL",
    price: 499.99,
    author: "John Doe",
    pages: 420
  }) {
    id
    title
    author
  }
}
```

### ✅ Query - Get All Books

```graphql
query {
  allBooks {
    id
    title
    author
    price
  }
}
```

### ✅ Query - Get Book By ID

```graphql
query {
  getBook(bookId: 1) {
    id
    title
    author
  }
}
```

---

## 🛠️ Tech Stack

* **Spring Boot**
* **Spring Data JPA**
* **GraphQL (Spring for GraphQL)**
* **MySQL (or any RDBMS)**

---

## 📌 Next Steps

* Add Update & Delete (REST + GraphQL)
* Add pagination & filtering
* Add proper exception handling + DTO responses

---

## 👨‍💻 Author

Built with ❤️ by **Kunal**
