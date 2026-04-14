# 🛒 Multicart Demo Automation

## 📋 Project Overview
A comprehensive test automation framework for e-commerce multi-cart functionality using **Behavior-Driven Development (BDD)** principles. This project demonstrates industry-standard automation practices with Selenium WebDriver and Cucumber.

---

## 🛠️ Technology Stack

| Component | Technology |
|-----------|-----------|
| **Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **BDD Framework** | Cucumber (Gherkin) |
| **Test Runner** | TestNG |
| **Build Tool** | Maven |
| **IDE** | Eclipse / IntelliJ IDEA |

---

## 🏗️ System Architecture

### Layered Architecture
```
┌─────────────────────────────────────────┐
│         UI Layer (Gherkin)              │
│      (Feature Files & Step Defs)        │
├─────────────────────────────────────────┤
│      Page Object Model (POM)            │
│    (Reusable UI Components)             │
├─────────────────────────────────────────┤
│      Business Logic Layer               │
│    (Test Utilities & Helpers)           │
├─────────────────────────────────────────┤
│      WebDriver Layer                    │
│    (Selenium WebDriver Operations)      │
├─────────────────────────────────────────┤
│      Application Under Test             │
│    (Multi-cart E-commerce System)       │
└─────────────────────────────────────────┘
```

### Key Components

1. **Feature Files (Gherkin)**
   - Human-readable test scenarios
   - Written in Given-When-Then format
   - Enable non-technical stakeholder collaboration

2. **Step Definitions**
   - Bridges feature files with automation code
   - Implements Gherkin steps in Java
   - Maintains readability and reusability

3. **Page Object Model (POM)**
   - Encapsulates web page elements and interactions
   - Reduces code duplication
   - Improves maintainability

4. **Test Utilities & Helpers**
   - Common functions for element interaction
   - Configuration management
   - Logging and reporting utilities

5. **WebDriver Manager**
   - Manages browser instances
   - Handles driver lifecycle
   - Cross-browser compatibility

---

## 📁 Project Structure

```
Multicart_Demo_Automation/
│
├── src/main/java/
│   └── com/automation/
│       ├── pages/              # Page Object Model classes
│       ├── utils/              # Utilities & Helper methods
│       └── config/             # Configuration management
│
├── src/test/java/
│   └── com/automation/
│       ├── steps/              # Cucumber Step Definitions
│       └── runners/            # TestNG & Cucumber Test Runners
│
├── src/test/resources/
│   ├── features/               # Gherkin Feature Files (.feature)
│   └── config/                 # Test configuration files
│
├── pom.xml                     # Maven dependencies & plugins
├── testng.xml                  # TestNG configuration
└── README.md                   # Project documentation
```

---

## ✨ Key Features

✅ **BDD Approach** - Behavior-driven scenarios in plain English  
✅ **Page Object Model** - Maintainable & scalable automation  
✅ **Cross-browser Testing** - Support for Chrome, Firefox, Edge  
✅ **Parallel Execution** - TestNG enables parallel test runs  
✅ **Comprehensive Reporting** - Detailed test execution reports  
✅ **CI/CD Ready** - Maven-based build automation  

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6+
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/rbchy/Multicart_Demo_Automation.git
   cd Multicart_Demo_Automation
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure test properties**
   - Update `config/config.properties` with your application URL
   - Set browser type and other configurations

4. **Run all tests**
   ```bash
   mvn test
   ```

5. **Run specific feature file**
   ```bash
   mvn test -Dcucumber.options="src/test/resources/features/YourFeature.feature"
   ```

---

## 🔄 Data Flow

1. **Feature Files** → Gherkin scenarios are written
2. **Test Runner** → TestNG/Cucumber runner executes scenarios
3. **Step Definitions** → Steps are mapped to Java code
4. **Page Objects** → UI interactions via POM classes
5. **WebDriver** → Selenium commands execute on browser
6. **Application** → Multi-cart system responds
7. **Reports** → Test results generated and logged

---

## 🎯 Design Patterns Used

- **Page Object Model (POM)** - Encapsulation of UI elements
- **Singleton Pattern** - WebDriver instance management
- **Factory Pattern** - Browser driver initialization
- **Builder Pattern** - Complex test data construction

---

## 📊 Testing Coverage

- Multi-cart functionality
- Product addition & removal
- Cart updates & calculations
- Checkout process
- Payment workflows

---

## 🤝 Contributing

1. Create a feature branch (`git checkout -b feature/your-feature`)
2. Write BDD scenarios in Gherkin
3. Implement step definitions and page objects
4. Ensure all tests pass
5. Submit a pull request

---

## 📝 License

This project is open source and available under the MIT License.

---

## 👨‍💻 Author

**Ranajit Baran Chowdhury** (@rbchy)