# 📚 Lambdas Exercises - Level 1 & Level 2

## 📄 Description

This repository contains exercises for **Level 1** and **Level 2** focused exclusively on **Java Lambdas and Streams** (Java 8+). The exercises include filtering, mapping, sorting, and using Functional Interfaces with lambdas.

All exercises are written in English, follow the Sprint 0 best practices, and are structured in separate packages for each level and task.

---

## 🧩 Level 1 - Lambdas Exercises

### Exercise 1 - Strings containing 'o'

- Filter a list of strings and return only those that contain the letter `'o'`.
- Print the result.

### Exercise 2 - Strings containing 'o' and longer than 5 characters

- Filter a list of strings to return only those containing `'o'` **and** with more than 5 characters.
- Print the result.

### Exercise 3 - Print all months using a lambda

- Create a list with all months of the year.
- Print each element using a lambda.

### Exercise 4 - Print all months using method reference

- Print the same list as in Exercise 3 using a method reference.

### Exercise 5 - Functional Interface getPiValue()

- Create a Functional Interface with a method `getPiValue()` returning a `double`.
- Instantiate it in `Main`, assign the value `3.1415`, invoke it, and print the result.

### Exercise 6 - Sort strings by length

- Create a list containing strings and numbers as strings.
- Sort the list from shortest to longest string.

### Exercise 7 - Sort strings in reverse

- Sort the same list as Exercise 6, from longest to shortest string.

### Exercise 8 - Functional Interface reverse()

- Create a Functional Interface `reverse()` that receives and returns a `String`.
- Use a lambda in `Main` to reverse a string and print the result.

---

## 🧩 Level 2 - Lambdas Exercises

### Exercise 1 - Strings starting with 'A' and length 3

- Create a list of proper names.
- Return only those starting with `'A'` and exactly 3 letters.
- Print the result.

### Exercise 2 - Prefix numbers with 'e' or 'o'

- Create a method that converts a list of integers into a string, where each number is preceded by:
  - `'e'` if even
  - `'o'` if odd  
- Example: `(3, 55, 44)` → `"o3, o55, e44"`

### Exercise 3 - Functional Interface operacio()

- Create a Functional Interface `operacio()` returning a `float`.
- Use lambdas to perform different operations: addition, subtraction, multiplication, and division.

### Exercise 4 - Strings and numbers ordering

- Create a list containing strings and numbers.
- Sort alphabetically by first character.
- Strings containing `'e'` come first, the rest after.
- Modify all elements containing `'a'` → replace `'a'` with `'4'`.
- Print only numeric elements (even though stored as strings).

---

## 💻 Technologies Used

- Java 24
- Maven (optional project build)
- IntelliJ IDEA
- Git & GitHub

---

## 📋 Requirements

- **Java 17+**
- IDE: Eclipse or IntelliJ IDEA recommended
- Maven (if project is Maven-based)
- Git

---

## 🛠️ Installation

1. **Clone the Repository:**

```bash
git clone https://github.com/christo256/S1.08---Lambdas---Level-1-2-
```
---
## ▶️ Compilate and Execution:

### 1️⃣ Compile all packages
From the root of the project:

```bash
javac task1and2_Lambdas_Level1/*.java \
      task2_Lambdas_Level1/*.java \
      task3and4_Lambdas_Level1/*.java \
      task5_Lambdas_Level2/*.java \
      task6and7_Lambdas_Level1/*.java \
      task8_Lambdas_Level1/*.java \
      task1_Lambdas_Level2/*.java \
      task2_Lambdas_Level2/*.java \
      task3_Lambdas_Level2/*.java \
      task4_Lambdas_Level2/*.java
```
### 2️⃣ Run each Main
```bash
 java task1and2_Lambdas_Level1.main 
      task2_Lambdas_Level1.main
      task3and4_Lambdas_Level1.main 
      task5_Lambdas_Level2.main
      task6and7_Lambdas_Level1.main 
      task8_Lambdas_Level1.main 
      task1_Lambdas_Level2.main 
      task2_Lambdas_Level2.main 
      task3_Lambdas_Level2.main 
      task4_Lambdas_Level2.main


      


