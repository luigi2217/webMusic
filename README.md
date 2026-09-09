# MusicaWeb

Aplicação de música desenvolvida como projeto acadêmico (disciplina de Engenharia de Software III, FIPP/Unoeste), dividida em duas partes: **back-end** (API REST em Spring Boot) e **front-end** (a ser adicionado).

> ⚠️ Projeto em desenvolvimento. O back-end já está estruturado (entidades criadas), mas as camadas de repository e controller ainda serão implementadas. O front-end ainda será adicionado.

## Estrutura do repositório

```
webMusic/
├── musicaweb-back/     # API REST em Java + Spring Boot
└── musicaweb-front/    # Interface web (em breve)
```

## Back-end

Localizado em `musicaweb-back/`.

**Tecnologias:** Java 17, Spring Boot 4.1.1 (Spring Web MVC), Maven

**Como rodar:**
```bash
cd musicaweb-back
./mvnw spring-boot:run
```
A API sobe por padrão em `http://localhost:8080`.

**Status atual:**
- Entidades criadas: `Musica`, `Erro`
- Repositories: ainda não implementados
- Controllers REST: ainda não implementados
- Conexão com banco de dados: ainda não configurada

## Front-end

Ainda não implementado. Será adicionado em uma próxima etapa do projeto.

## Próximos passos

- Implementar os repositories (persistência de dados)
- Implementar os controllers REST (endpoints da API)
- Configurar conexão com banco de dados
- Desenvolver o front-end e integrá-lo com a API

---

Projeto desenvolvido por **Luigi Sardelari Scaliante** como prática de desenvolvimento fullstack.
