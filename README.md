# taskTrek

**Краткое назначение проекта:**
TaskTrek — инструмент управления задачами (task tracker), разработанный на Java/Maven, предназначенный для учёта, управления и отслеживания задач.

---

##  Технологии
- **Java 17** 
- **Maven** — система сборки
- **Spring Boot** 
- **JUnit**
- **Lombok**

---

##  Особенности (Features)
- CRUD-операции для задач: создание, чтение, обновление, удаление
- REST-API для взаимодействия с фронтендом/другими сервисами (если реализовано)
- Поддержка баз данных: H2 (in-memory) PostgreSQL
- Тесты (unit) - в будующем планируется тестирование Rest Assured 

---

##  Установка и запуск
```bash
git clone https://github.com/HomeworkTester/taskTrek.git
cd taskTrek
mvn clean install
mvn spring-boot:run             
