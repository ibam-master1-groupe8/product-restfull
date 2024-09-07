# Application RESTful avec Sprint Boot

Il s'agit d'une application Spring Boot qui fournit une API RESTful pour gérer les produits. Elle inclut la surveillance de la performance en utilisant prometheus.

## Sommaire
- [Application RESTful avec Sprint Boot](#application-restful-avec-sprint-boot)
  - [Sommaire](#sommaire)
  - [Prerequisites](#prerequisites)
  - [Features](#features)
  - [Installation](#installation)
    - [10. **Technologies Used**](#10-technologies-used)
  - [Technologies Used](#technologies-used)

## Prerequisites
- Java 17 ou version supérieure
- Maven 3.9.8
- PostgreSQL pour la base de données
- Docker pour containeurisation

## Features
- Operations CRUD de produits
- RESTful API avec reponses JSON
- Monitoring avec prometheus

## Installation

1. **Cloner le repository depuis github:**
   ```bash
   git clone https://github.com/ibam-master1-groupe8/product-restfull.git
   cd your-repository
   ```

2. **Compiler le projet:**
   ```bash
   mvn clean install
   ```

3. **Mise en place de la base de données:**
   - Créer une nouvelle base de données.
   - Modifier le fichier `application.properties` avec les identifiants de la base de données.

### 10. **Technologies Used**
- Liste des technologies utilisées dans ce projet.

```markdown
## Technologies Used
- Spring Boot
- Spring Data JPA
- Maven
- Docker Desktop
- prometheus


