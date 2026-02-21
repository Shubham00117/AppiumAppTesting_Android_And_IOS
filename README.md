# 📱 Appium Mobile Testing — Android & iOS

Comprehensive **mobile test automation** examples using **Appium** with Java for both **Android** and **iOS** platforms. Covers device setup, element interactions, gestures, and cross-platform testing.

---

## 📖 Overview

This repository provides hands-on Appium test automation examples covering a wide range of mobile testing scenarios — from basic device setup to advanced interactions like swiping, scrolling, drag-and-drop, and iOS-specific elements.

---

## 📚 Topics Covered

### 📱 Android Testing

| Category | Examples |
|----------|---------|
| **Device Setup** | Install app on Virtual Device, Install app on Real Device |
| **Basic Interactions** | Calculator, Phone Dialer, API Demo App |
| **UI Elements** | Dropdowns, Alerts, Popups, Checkboxes, Radio Buttons, Text Fields |
| **Gestures** | Horizontal Scrolling, Vertical Scrolling, Drag & Drop, Swipe (Touch Action) |
| **Advanced** | Expandable Lists, Star Rating |

### 🍎 iOS Testing

| Category | Examples |
|----------|---------|
| **Basic** | TextField interactions, UIKit Catalog |
| **UI Elements** | Alerts, Switch, Picker View, Search |
| **Advanced** | Slider validation, Slider value reading |

---

## 📂 Project Structure

```
AppiumAppTesting_Android_And_IOS/
├── pom.xml
├── src/test/java/
│   ├── Day1_Device/                    # Device installation setup
│   │   ├── Example1InstallAppVirtualDevice.java
│   │   └── Example2InstallAppRealDevice.java
│   └── basics/                         # All automation examples
│       ├── Calculator.java
│       ├── Calculator2_Vivo_Phone.java
│       ├── DialNumberPhoneApp.java
│       ├── APIDmostTest1.java
│       ├── PracticeAPP.java
│       ├── Example3HandleSwitchEmulator.java
│       ├── Example4HandleDropDownsById.java
│       ├── Example5AlertsAPIDemo.java
│       ├── Example5HandleAlertsByFindElementsClassName.java
│       ├── Example6DragAndDropAction.java
│       ├── Example6HorizontalScrolling.java
│       ├── Example7VericalScrolling.java
│       ├── Example9CheckboxRadioButtonTextField.java
│       ├── Example10ExpandableList.java
│       ├── Example14Rating5Star.java
│       ├── Example15SwipeTouchAction.java
│       ├── IOSSimpleTest1_TextField.java
│       ├── IOSSimpleTest8_Search.java
│       ├── IOSAlertHandling.java
│       ├── IOSSwitchHandle.java
│       ├── IOSPickerViewTest.java
│       ├── IOSAdvancedTest1_SliderValidation.java
│       ├── IOSSliderValue.java
│       └── IOSUIKitCatalogTest.java
```

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Programming language |
| **Appium** | Mobile automation framework |
| **Selenium WebDriver** | WebDriver protocol |
| **TestNG** | Test framework |
| **Maven** | Build management |
| **Android SDK** | Android emulator & tools |
| **Xcode** | iOS simulator (macOS only) |

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 11+
- Maven 3.x
- Appium Server installed (`npm install -g appium`)
- **For Android:** Android SDK, Emulator or real device
- **For iOS:** macOS with Xcode, iOS Simulator or real device

### Installation
```bash
git clone https://github.com/Shubham00117/AppiumAppTesting_Android_And_IOS.git
cd AppiumAppTesting_Android_And_IOS
mvn clean install
```

### Running Tests
```bash
# Start Appium server first
appium

# Run tests
mvn test -Dtest=basics.Calculator
```

---

## 📜 License

This project is open source and available for educational purposes.
