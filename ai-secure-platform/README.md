# AI Secure Log Analyzer

## Overview
A backend system that analyzes logs to detect sensitive information like emails, passwords, and API keys, and assigns a risk score with actionable insights.

---

## Features
- Detects:
  - Email addresses
  - Passwords
  - API keys
- Risk scoring engine (Low / High / Critical)
- Insights generation
- Action recommendation (ALLOW / BLOCK)
- Timestamp support
- Swagger API documentation
- Simple frontend UI

---

## Tech Stack
- Java 21
- Spring Boot
- REST API
- Regex Pattern Matching
- Swagger (OpenAPI)
- HTML + JavaScript

---

## How to Run

```bash
mvn spring-boot:run
