# Workshop6
Aplikacja webowa (WebApp) w Javie (SpringBoot) do zarządzania książkami (CRUD), rozszerzenie aplikacji Workshop6

## Funkcjonalności

Aplikacja pozwala na:
- wyświetlanie listy książek
- dodawanie nowej książki
- edycję istniejącej książki
- usuwanie książki

Dane przechowywane są w bazie danych MySQL, dzięki czemu nie znikają po restarcie aplikacji.

## Konfiguracja bazy danych

W pliku application.properties:

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/<dataBase_name>
spring.datasource.username=root
spring.datasource.password=<password>

Przed uruchomieniem aplikacji należy utworzyć bazę danych:

CREATE DATABASE <dataBase_name>;

## Technologie

- Java
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Tomcat

## Struktura aplikacji
- Book – encja reprezentująca tabelę w bazie danych
- BookRepository – interfejs do operacji na bazie (JpaRepository)
- BookService – logika biznesowa aplikacji
- BookController – warstwa REST API

## API (przykładowe endpointy)

- GET /books – lista wszystkich książek
- POST /books/add – dodanie książki
- PUT /books/update – edycja książki
- DELETE /books/delete/{id} – usunięcie książki 

## Cel projektu

Celem projektu jest:
- nauka Spring Boot
- integracja aplikacji z bazą danych MySQL
- wykorzystanie Hibernate (JPA)
- implementacja operacji CRUD na danych trwałych
- zrozumienie architektury warstwowej (Controller → Service → Repository)

## Różnice względem poprzedniego Workshop5

W poprzedniej wersji aplikacji dane były przechowywane w pamięci (np. w liście), co powodowało ich utratę po restarcie aplikacji.
W tej wersji dane są zapisywane w bazie danych, dzięki czemu są trwałe i dostępne po ponownym uruchomieniu aplikacji.
