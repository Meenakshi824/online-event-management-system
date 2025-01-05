# online-event-management-system

The system will allow event organizers to plan and manage events, including 
scheduling, ticketing, and communication with attendees. Attendees can register for events, 
purchase tickets, and receive event updates. Administrators will handle user management, 
event approvals, and system settings
# Demo project 
Welcome to the demo project! this project is a simple web application that allows user to log in and register. it is biult using Java with maven as the build tool and uses a MySQL database for data storage. 
# Table of Contents 
features
technology used 
Getting Started
Usage
License

# features
1. user login funcality
2. User registration link
3. Simple and clean user interface

# Technology Used
- java 17
- Maven
- MySQL
- Servlet API
- HTML/CSS for front-end
# Getting Started
to get a local copy up and running follow these simple steps
# Prerequisites
1. java JDK 17
2. Maven
3. MySQL Server

# Documentation
# Event Management System

## Overview
An online system for managing events, where admins, organizers, and attendees have specific functionalities.

### Features
- Admin: User management, event approvals.
- Organizer: Event creation, ticketing, communication.
- Attendee: Registration, ticket purchase, updates.

### Technologies Used
- **Backend:** Spring Boot, Hibernate
- **Frontend:** React (optional for GUI)
- **Database:** MySQL
- **Testing:** JUnit, Mockito
- **Other Tools:** Swagger, Postman

### How to Run
1. Clone the repository.
2. Configure `application.properties` with database credentials.
3. Run the application with `mvn spring-boot:run`.

### Future Enhancements
- Payment gateway integration.
- Real-time event updates.
- Advanced analytics.

## API Endpoints
- `GET /api/events`: Fetch all events.
- `POST /api/events`: Create an event.
- `PUT /api/events/{id}`: Update an event.
- `DELETE /api/events/{id}`: Delete an event.

## Test Coverage
Test cases are implemented for both the Service and DAO layers with 85%+ coverage.

