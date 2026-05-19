# Weather API Wrapper Service

A Spring Boot application that fetches weather data from OpenWeatherMap and exposes a simplified REST API endpoint.

## What the project does

This project allows users to request current weather information for a city.

It connects to the OpenWeatherMap API, retrieves weather data, and returns a cleaner JSON response.

## Endpoint

```bash
GET /weather?city=Cape Town
```

## Example response

```json
{
  "city": "Cape Town",
  "temperature": 16.87,
  "description": "overcast clouds"
}
```

## Requirements

Before running the project, install:

- Java 17 or newer
- IntelliJ IDEA
- Gradle
- OpenWeatherMap API key

## Setup

### 1. Clone the repository

```bash
git clone https://github.com/NarshT26/weather-api-project.git
```

### 2. Open the project in IntelliJ

Open the `demo` folder.

### 3. Add your API key

Add your OpenWeatherMap API key in:

```bash
src/main/resources/application.properties
```

Example:

```properties
weather.api.key=YOUR_API_KEY_HERE
```

### 4. Run the application

Start the app using:

```bash
./gradlew bootRun
```

## Example request

Visit in browser:

```bash
http://localhost:8080/weather?city=Cape%20Town
```