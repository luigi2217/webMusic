# MusicaWeb

A music web app split into two parts: a **backend** (REST API built with Spring Boot) and a **frontend** (built with React, coming soon).

> ⚠️ Work in progress. The backend is already structured (entities created), but the repository and controller layers still need to be implemented. The frontend hasn't been added yet.

## Repository structure

```
webMusic/
├── musicaweb-back/     # REST API built with Java + Spring Boot
└── musicaweb-front/    # React frontend (coming soon)
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

Not implemented yet. Will be built with **React** in an upcoming step.

## Next steps

- Implement the repositories (data persistence)
- Implement the REST controllers (API endpoints)
- Set up the database connection
- Build the React frontend and integrate it with the API

---

Developed by **Luigi Sardelari Scaliante**.
