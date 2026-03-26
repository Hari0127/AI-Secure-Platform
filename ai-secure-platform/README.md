# AI Secure Platform

## Overview
A log analysis system that detects sensitive data like emails, passwords, and API keys.

## Features
- Regex-based detection
- Risk scoring engine
- Insights generation
- Action decision (BLOCK / ALLOW)
- Swagger API testing
- Simple UI

## API
POST /api/analyze

### Request
{
  "content": "your log text"
}

### Response
Returns risk level, findings, and insights.

## Run
mvn spring-boot:run
