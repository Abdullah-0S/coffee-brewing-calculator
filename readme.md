# Coffee Brewing Calculator

A Spring Boot app I use to work out my coffee measurements.
It is also my project for learning Spring Boot.

## What it does

You give it two of these three things and it works out the third:

- **Coffee**: grams of beans
- **Water**: grams (or millilitres, 1 ml is about 1 g)
- **Ratio**: for example `1:16` means 1 g coffee per 16 g water

Examples of what I want to ask it:

- "I want **500 g of water** at a **1:16** ratio. How many grams of beans?"
- "I have **18 g of beans** and want a **1:15** ratio. How much water?"
- "I used **20 g beans** and **320 g water**. What ratio was that?"

## Tech

- Java 21
- Spring Boot (spring-boot-starter-webmvc)
- Maven

## Run it

```bash
./mvnw spring-boot:run
```

App starts on http://localhost:8080

## Tests

```bash
./mvnw test
```

## Status

Early days. Just the Spring Boot skeleton so far. The brewing math and the
web endpoint still need to be built.

## Ideas for later

- Simple web form instead of an API call
- Save my favourite recipes
- Presets (V60, French press, espresso)
