# Internal Marks Calculator (EGSPEC Norms)

A simple Java Maven console application to calculate **internal marks** based on EGSPEC evaluation rules.  
It helps students compute CA, Activity, and final internal marks instantly through terminal input.

---

## Features

- CA marks calculation (out of 30)
- Activity marks calculation (out of 10)
- Final internal marks (out of 40)
- SAFE / NOT SAFE status based on CA performance
- Runs directly from generated JAR file

---

## Marking Logic

### Continuous Assessment (CA)
- CA1: 50 → scaled to 15
- CA2: 50 → scaled to 15  
- Total CA = 30 marks

### Activities
- Activity1: 40 → scaled to 5
- Activity2: 40 → scaled to 5  
- Total Activity = 10 marks

### Final Internal
- Total = CA (30) + Activity (10) = **40 marks**

### Safety Rule
- CA ≥ 17 → SAFE  
- CA < 17 → NOT SAFE  

---

## 🛠️ Requirements

- Java JDK 8 or higher
- Maven installed (`mvn -v`)

---

## 📁 Project Structure

```

internalCalculator/
│
├── pom.xml
└── src/
└── main/
└── java/
└── intern/
└── project/
└── App.java

```


##  How to Run

### 1. Clone the repository
```bash
git clone https://github.com/tharvesh2026/internalCalculator
````

### 2. Move into project directory

```bash
cd internalCalculator
```

### 3. Build the project

```bash
mvn clean package
```

### 4. Run the application

```bash
java -cp target\simpleapp-1.0-SNAPSHOT.jar intern.project.App
```

---

## Example Usage

```text
===== INTERNAL MARK CALCULATOR =====
Enter CA1 marks (out of 50): 45
Enter CA2 marks (out of 50): 40
Enter Activity1 marks (out of 40 or estimate): 38
Enter Activity2 marks (out of 40 or estimate): 35

===== RESULT =====
CA Marks (out of 30): 25.50
Activity Marks (out of 10): 9.13
Final Internal (out of 40): 34.63
Status: SAFE
```

---

##  Purpose

This tool is designed for students to quickly estimate their internal marks according to EGSPEC norms using a simple command-line interface.

---

## 👨‍💻 Author

* GitHub: [Tharvesh Muhaideen](https://github.com/tharvesh588)
* Project: Internal Marks Calculator

---

## 📄 License

This project is open-source and free to use for educational purposes.

