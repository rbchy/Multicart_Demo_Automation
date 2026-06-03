# Multicart Demo Automation — Java + Selenium + Cucumber + TestNG

![Java](https://img.shields.io/badge/Java-8+-orange?logo=java)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen?logo=cucumber)
![TestNG](https://img.shields.io/badge/TestNG-Runner-red)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apache-maven)
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-D24939?logo=jenkins)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

**Author:** Ranajit Baran Chowdhury — Software Programmer & QA Automation Engineer
**Email:** chyranajit@gmail.com
**Phone:** +1 (267) 342-5565
**GitHub:** [@ranajitchowdhury](https://github.com/ranajitchowdhury)
**Portfolio:** [rbc6543.wixsite.com/rbc-portfolio](https://rbc6543.wixsite.com/rbc-portfolio)
**LinkedIn:** [linkedin.com/in/ranajitchowdhury](https://linkedin.com/in/ranajitchowdhury)

A comprehensive **BDD test automation framework** for e-commerce multi-cart functionality — built with **Java**, **Selenium WebDriver**, and **Cucumber**. This project demonstrates industry-standard automation engineering practices including Page Object Model, layered architecture, design patterns, and CI/CD-ready structure.

🌐 **Application Under Test:** Multi-cart E-commerce Demo System

---

## 📋 Tech Stack

| Component | Technology | Purpose |
|-----------|-----------|---------|
| **Language** | Java 8+ | Core automation logic and OOP design |
| **Automation Tool** | Selenium WebDriver | Browser UI interaction and control |
| **BDD Framework** | Cucumber (Gherkin) | Human-readable BDD test scenarios |
| **Test Runner** | TestNG | Test execution, grouping, and parallel support |
| **Build Tool** | Maven | Dependency management and lifecycle |
| **IDE** | Eclipse / IntelliJ IDEA | Development environment |
| **CI/CD** | Jenkins / GitHub Actions | Automated build and execution pipeline |
| **Reporting** | Cucumber HTML + Extent Reports | Rich test execution reports |

---

## 📁 Project Structure

```
Multicart_Demo_Automation/
│
├── src/main/java/
│   └── com/automation/
│       ├── pages/                     ← Page Object Model classes
│       │   ├── HomePage.java
│       │   ├── ProductPage.java
│       │   ├── CartPage.java
│       │   ├── CheckoutPage.java
│       │   └── PaymentPage.java
│       ├── utils/                     ← Utility and helper methods
│       │   ├── DriverManager.java     ← Singleton WebDriver factory
│       │   ├── WaitHelper.java        ← Explicit/implicit wait utilities
│       │   └── ScreenshotUtil.java    ← Screenshot capture on failure
│       └── config/
│           └── ConfigReader.java      ← config.properties reader
│
├── src/test/java/
│   └── com/automation/
│       ├── steps/                     ← Cucumber step definition classes
│       │   ├── CommonSteps.java
│       │   ├── CartSteps.java
│       │   ├── CheckoutSteps.java
│       │   └── Hooks.java             ← @Before / @After lifecycle
│       └── runners/
│           └── TestRunner.java        ← TestNG + CucumberOptions runner
│
├── src/test/resources/
│   ├── features/                      ← Gherkin BDD feature files
│   │   ├── AddToCart.feature
│   │   ├── RemoveFromCart.feature
│   │   ├── CartCalculation.feature
│   │   ├── CheckoutFlow.feature
│   │   ├── PaymentWorkflow.feature
│   │   ├── SmokeTests.feature
│   │   └── RegressionTests.feature
│   └── config/
│       └── config.properties          ← URL, browser, timeout settings
│
├── reports/                           ← Generated reports and screenshots
│   ├── cucumber-reports/
│   │   └── report.html
│   └── screenshots/
│       └── FAILED_<ScenarioName>.png
│
├── pom.xml                            ← Maven dependencies and plugins
├── testng.xml                         ← TestNG suite configuration
├── Jenkinsfile                        ← CI/CD pipeline definition
└── README.md
```

---

## 🏗️ System Architecture

```
┌──────────────────────────────────────────┐
│         UI Layer — Gherkin               │
│     Feature Files & Step Definitions     │
├──────────────────────────────────────────┤
│      Page Object Model (POM)             │
│    Reusable, encapsulated UI components  │
├──────────────────────────────────────────┤
│      Business Logic & Utilities          │
│    WaitHelper · ConfigReader · Hooks     │
├──────────────────────────────────────────┤
│      WebDriver Layer                     │
│    Selenium WebDriver — Browser Control  │
├──────────────────────────────────────────┤
│      Application Under Test              │
│    Multi-cart E-commerce Demo System     │
└──────────────────────────────────────────┘
```

---

## ✨ Framework Features

| Feature | Description |
|---------|-------------|
| ✅ BDD with Cucumber | Gherkin scenarios readable by QA, developers, and business stakeholders |
| ✅ Page Object Model | UI locators and actions isolated per page — single point of maintenance |
| ✅ Singleton WebDriver | One browser instance per thread — consistent, stable test execution |
| ✅ Screenshot on Failure | Auto-captured and saved to `reports/screenshots/` on any step failure |
| ✅ Centralized Config | Zero hardcoded strings — all settings via `config.properties` |
| ✅ Cross-Browser | Chrome, Firefox, and Edge supported |
| ✅ Parallel Execution | TestNG `parallel="scenarios"` for faster feedback |
| ✅ CI/CD Ready | Jenkins + GitHub Actions pipeline examples included |
| ✅ Rich HTML Reports | Cucumber HTML report with step details and failure screenshots |

---

## 🎯 Test Coverage

### 🛒 Multi-Cart Functionality
- Add single and multiple products to cart
- Remove individual products from cart
- Update product quantities
- Cart item count badge validation
- Cart persistence across navigation

### 💰 Cart Calculations
- Unit price validation per product
- Subtotal calculation with multiple items
- Tax and shipping calculation
- Grand total accuracy verification

### 💳 Checkout Process
- Complete checkout with valid user details
- Form validation — required fields, format errors
- Order summary review and confirmation
- Shipping address entry and validation

### 💳 Payment Workflow
- Payment method selection
- Card details entry and validation
- Order placement and confirmation
- Order confirmation page verification

### 🚀 Smoke Tests
- Application launch and home page load
- Product listing page display
- Cart icon visibility and functionality
- Navigation between key pages

### 🔄 Regression Tests
- End-to-end purchase with single product
- End-to-end purchase with multiple products
- Cart update and recalculation
- Checkout with different user profiles

---

## 🎨 Design Patterns Applied

| Pattern | Where Used | Benefit |
|---------|-----------|---------|
| **Page Object Model** | All `pages/` classes | Encapsulates locators — one change fixes all tests |
| **Singleton Pattern** | `DriverManager.java` | Single WebDriver instance per thread |
| **Factory Pattern** | Browser initialization | Plug in Chrome, Firefox, or Edge via config |
| **Builder Pattern** | Test data construction | Clean, readable test data setup |
| **Facade Pattern** | `WaitHelper.java` | Simplified wait API hiding Selenium complexity |

---

## ✅ Prerequisites

- ✅ **Java 8 or higher** — configured in system PATH
- ✅ **Maven 3.6+** — installed and configured
- ✅ **Chrome / Firefox / Edge** — latest stable version
- ✅ **ChromeDriver / GeckoDriver** — matching browser version
- ✅ **IDE** — Eclipse or IntelliJ IDEA
- ✅ **Git** — for version control

---

## ⚙️ Installation & Setup

**1. Clone the repository:**
```bash
git clone https://github.com/ranajitchowdhury/Multicart_Demo_Automation.git
cd Multicart_Demo_Automation
```

**2. Install all dependencies:**
```bash
mvn clean install -DskipTests
```

**3. Configure `src/test/resources/config/config.properties`:**
```properties
app.url=https://your-multicart-demo-url.com
browser=chrome
headless=false
implicit.wait=10
explicit.wait=20
page.load.timeout=30
```

---

## ▶️ Running Tests

### Run full test suite
```bash
mvn clean test
```

### Run Smoke tests
```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

### Run Regression tests
```bash
mvn test -Dcucumber.filter.tags="@regression"
```

### Run specific feature file
```bash
mvn test -Dcucumber.options="src/test/resources/features/CartCalculation.feature"
```

### Run with specific browser
```bash
mvn test -Dbrowser=firefox
```

### Run in headless mode (CI/CD)
```bash
mvn test -Dheadless=true
```

### Run with TestNG suite
```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Reports

### Cucumber HTML Report
Auto-generated after every run:
```
reports/cucumber-reports/report.html
```

Open in browser:
```bash
open reports/cucumber-reports/report.html
```

**Report includes:**
- ✅ / ❌ Step-level pass/fail status
- ⏱️ Execution time per scenario and step
- 📸 Embedded failure screenshots
- 🏷️ Feature and tag-based filtering

---

## 📸 Screenshot on Failure

```java
// Hooks.java
@After
public void tearDown(Scenario scenario) {
    if (scenario.isFailed()) {
        // Capture full-page screenshot
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver())
            .getScreenshotAs(OutputType.BYTES);

        // Embed in Cucumber HTML report
        scenario.attach(screenshot, "image/png", "FAILED_" + scenario.getName());

        // Save to file system
        String fileName = "reports/screenshots/FAILED_"
            + scenario.getName().replaceAll("\\s+", "_") + ".png";
        try {
            FileUtils.writeByteArrayToFile(new File(fileName), screenshot);
            System.out.println("📸 Screenshot saved: " + fileName);
        } catch (IOException e) {
            System.err.println("⚠ Screenshot save failed: " + e.getMessage());
        }
    }
    DriverManager.quitDriver();
}
```

---

## 🔄 Test Execution Flow

```
Feature Files (Gherkin)
        ↓
TestNG Runner (TestRunner.java)
        ↓
Step Definitions (steps/)
        ↓
Page Object Classes (pages/)
        ↓
DriverManager (Singleton WebDriver)
        ↓
Selenium WebDriver → Browser
        ↓
Multi-cart Application
        ↓
Cucumber HTML Report + Screenshots
```

---

## 🔧 CI/CD Integration

### Jenkins Pipeline

```groovy
pipeline {
    agent any

    tools {
        maven 'Maven 3.8'
        jdk 'JDK 8'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/ranajitchowdhury/Multicart_Demo_Automation.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run Smoke Tests') {
            steps {
                sh 'mvn test -Dheadless=true -Dcucumber.filter.tags="@smoke"'
            }
        }

        stage('Run Regression Tests') {
            steps {
                sh 'mvn test -Dheadless=true -Dcucumber.filter.tags="@regression"'
            }
        }

        stage('Publish Reports') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                         fileIncludePattern: '**/cucumber.json',
                         reportTitle: 'Multicart Demo Report'
            }
        }
    }

    post {
        failure {
            emailext(
                subject: "❌ FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Tests failed. Report: ${env.BUILD_URL}cucumber-html-reports",
                to: 'chyranajit@gmail.com'
            )
        }
        success {
            emailext(
                subject: "✅ PASSED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "All tests passed. Report: ${env.BUILD_URL}cucumber-html-reports",
                to: 'chyranajit@gmail.com'
            )
        }
    }
}
```

### GitHub Actions

```yaml
name: Multicart Demo Automation

on:
  push:
    branches: [main]
  pull_request:
    branches: [main]

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3

      - name: Set up JDK 8
        uses: actions/setup-java@v3
        with:
          java-version: '8'
          distribution: 'temurin'

      - name: Install dependencies
        run: mvn clean install -DskipTests

      - name: Run Tests
        run: mvn test -Dheadless=true

      - name: Upload Report
        uses: actions/upload-artifact@v3
        if: always()
        with:
          name: cucumber-report
          path: reports/cucumber-reports/

      - name: Upload Screenshots
        uses: actions/upload-artifact@v3
        if: failure()
        with:
          name: failure-screenshots
          path: reports/screenshots/
```

---

## 🏷️ Tags

| Tag | Description |
|-----|-------------|
| `@smoke` | Critical path — fast build verification |
| `@regression` | Full regression suite |
| `@cart` | Cart add, remove, update scenarios |
| `@checkout` | Checkout flow scenarios |
| `@payment` | Payment workflow scenarios |
| `@calculation` | Cart price and total calculation |

---

## 📈 Future Enhancements

- [ ] Docker containerization — isolated test environments
- [ ] Parallel execution — TestNG `parallel="scenarios"` across browsers
- [ ] BrowserStack / Sauce Labs — cloud cross-browser testing
- [ ] REST Assured — API-layer validation alongside UI tests
- [ ] Allure Reports — richer reporting with trend history
- [ ] Database validation — JDBC assertions for order data integrity

---

## 🤝 Contributing

1. Fork the repository
2. Create your branch: `git checkout -b feature/improvement`
3. Write BDD scenarios in Gherkin and implement step definitions
4. Run `mvn test` to verify no regressions
5. Commit: `git commit -m 'Add improvement'`
6. Open a Pull Request

---

## 📄 License

This project is open-source under the **MIT License**.

---

## 🌟 Why This Framework?

| Strength | Detail |
|----------|--------|
| ✅ Clean architecture | POM + BDD + Hooks — industry-standard design |
| ✅ Easy maintenance | Change one Page class, fix all related tests |
| ✅ Readable scenarios | Business-friendly Gherkin test cases |
| ✅ Self-documenting failures | Screenshots embedded in report |
| ✅ Environment-agnostic | Config-driven — switch environments without code changes |
| ✅ CI/CD compatible | Jenkins and GitHub Actions ready |

---

## 👤 Author

**Ranajit Baran Chowdhury**
Software Programmer & QA Automation Engineer
- 📧 Email: chyranajit@gmail.com
- 📞 Phone: +1 (267) 342-5565
- 🐙 GitHub: [@ranajitchowdhury](https://github.com/ranajitchowdhury)
- 🌐 Portfolio: [rbc6543.wixsite.com/rbc-portfolio](https://rbc6543.wixsite.com/rbc-portfolio)
- 💼 LinkedIn: [linkedin.com/in/ranajitchowdhury](https://linkedin.com/in/ranajitchowdhury)

---

**Version:** 1.0.0 | **Last Updated:** May 2026
