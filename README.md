# MusicaWeb

A music web app split into two parts: a **backend** (REST API built with Spring Boot) and a **frontend** (starting with plain HTML/CSS, migrating to React later on).

> ⚠️ Work in progress. The backend is already structured (entities created), but the repository and controller layers still need to be implemented. The frontend hasn't been added yet.

## Repository structure

```
webMusic/
├── musicaweb-back/     # REST API built with Java + Spring Boot
└── musicaweb-front/    # HTML/CSS frontend (coming soon), later migrating to React
```

## Backend

Located in `musicaweb-back/`.

**Technologies:** Java 17, Spring Boot 4.1.1 (Spring Web MVC), Maven

**How to run:**
```bash
cd musicaweb-back
./mvnw spring-boot:run
```
The API runs by default on `http://localhost:8080`.

**Current status:**
- Entities created: `Musica`, `Erro`
- Repositories: not implemented yet
- REST controllers: not implemented yet
- Database connection: not configured yet

## Frontend

Not implemented yet. Will start as a simple **HTML/CSS** interface, later migrating to **React**.

## Next steps

- Implement the repositories (data persistence)
- Implement the REST controllers (API endpoints)
- Set up the database connection
- Build the HTML/CSS frontend and integrate it with the API
- Migrate the frontend to React

---

Developed by **Luigi Sardelari Scaliante**.
