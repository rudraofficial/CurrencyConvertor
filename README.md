# Currency Converter

This is a simple **Currency Converter** application built with **Spring Boot** (Java) for the backend and a **minimal frontend** using **HTML, CSS, and JavaScript**. The project allows users to convert between different currencies based on live exchange rates fetched from an external API.

## Features

- **Live currency conversion** using exchange rates from an external API.
- **Minimal, modern UI** for easy interaction.
- **Full currency name display** for ease of use.
- **Support for multiple currencies** like USD, INR, EUR, GBP, and more.
- Handles **same currency conversion** (e.g., INR to INR).

## Tech Stack

- **Backend**: Spring Boot, Java
- **Frontend**: HTML, CSS, JavaScript
- **API**: [ExchangeRate-API](https://www.exchangerate-api.com/)
- **Version Control**: Git & GitHub

## Getting Started

To run the project locally, follow these steps:

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/currency-converter.git
cd currency-converter
```

### 2. Install Dependencies
Make sure you have JDK 17+ installed and Maven or Gradle for building the Spring Boot project.

For Maven:
```bash
mvn clean install
```

### 3. Set Up API Key
This project fetches live exchange rates from the ExchangeRate-API.

- Create an account on the website.
- Obtain an API Key.
- Replace the API_KEY variable in CurrencyService.java with your API key:
    _**private final String API_KEY = "your_api_key_here";**_

### 4. Run the Application
- Run the Spring Boot application:
```bash
      mvn spring-boot:run
```
