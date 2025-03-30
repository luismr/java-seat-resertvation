# Java Seat Reservation

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-blue.svg)](https://junit.org/junit5/)

A Java solution for a seat reservation system that manages seat allocations and cancellations efficiently.

## Project Structure

```
.
├── LICENSE.md
├── README.md
├── .gitignore
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── Solution.java
    └── test
        └── java
            └── SolutionTest.java
```

## Solution Overview

The `Solution.java` implements a seat reservation system with the following features:

- Manages N seats numbered from 1 to N
- Processes K operations (reservations and cancellations)
- For each operation:
  - If seat[i] = 0: Reserves the smallest available seat number
  - If seat[i] > 0: Cancels the reservation for seat[i]
- Returns an array of reserved seat numbers in order of reservation

The solution uses:
- `NavigableSet` (TreeSet) for efficient seat management
- Java Streams for functional programming approach
- HashSet for O(1) lookup of reserved seats

## Prerequisites

- Java 21 or higher
- Maven 3.9.6 or higher
- JUnit 5

## Installation

1. Clone the repository:
```bash
git clone git@github.com:luismr/java-seat-resertvation.git
```

2. Navigate to the project directory:
```bash
cd java-seat-resertvation
```

3. Build the project:
```bash
mvn clean install
```

## Running Tests

```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details. 