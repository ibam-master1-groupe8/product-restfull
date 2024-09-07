# Application RESTful avec Sprint Boot

Il s'agit d'une application Spring Boot qui fournit une API RESTful pour gérer les produits. Elle inclut la surveillance de la performance en utilisant prometheus.

## Sommaire
- [Application RESTful avec Sprint Boot](#application-restful-avec-sprint-boot)
  - [Sommaire](#sommaire)
  - [Prerequisites](#prerequisites)
  - [Features](#features)
  - [Installation](#installation)
  - [Usage](#usage)
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
   cd product-restfull
   ```


2. **Mettre en place la base de données:**
   - Créer une nouvelle base de données.
   - Modifier le fichier `application.properties` avec les identifiants de la base de données.

3. **Compiler le projet:**
   ```bash
   mvn clean install
   ```
## Usage

Pour exécuter l'application, il faut:

1. **Confihuration de prometheus**
  - Modifier l'adresse IP par la votre dans le fichier `prometheus.yml` dans le dossier tools/prometheus

2. **Démarrer l'application**
```bash
docker-compose up -d
mvn spring-boot:run
```

## Technologies Used
- Spring Boot
- Spring Data JPA
- Maven
- Docker Desktop
- prometheus


