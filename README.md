# Criminal Face Detection System

## 📌 Project Overview

The Criminal Face Detection System is a Java-based application that detects and identifies criminals by comparing a user's uploaded image with a database of registered criminal images. The system uses OpenCV for face detection and image processing, JavaFX for the graphical user interface, and MySQL for storing criminal records.

---

## 🎯 Objectives

- Detect faces from uploaded images.
- Process facial images for better comparison.
- Compare the detected face with stored criminal images.
- Display criminal details if a match is found.
- Provide a simple and user-friendly interface.

---

## 🛠️ Technologies Used

- Java
- JavaFX
- OpenCV
- MySQL
- JDBC
- Scene Builder
- Maven
- VS Code / IntelliJ IDEA

---

## 📂 Project Structure

```
Criminal-Face-Detection-System/
│
├── src/
│   ├── controller/
│   ├── database/
│   ├── faceDetection/
│   ├── imageProcessing/
│   ├── faceMatching/
│   └── ui/
│
├── resources/
│   ├── haarcascade_frontalface_default.xml
│   ├── css/
│   └── images/
│
├── database/
│   └── criminal_database.sql
│
├── pom.xml
└── README.md
```

---

## ✨ Features

- Upload an image for identification.
- Automatic face detection using Haar Cascade.
- Image preprocessing for improved accuracy.
- Face comparison using histogram correlation.
- Criminal information retrieval from MySQL database.
- JavaFX graphical user interface.

---

## ⚙️ Modules

### 1. Database Module
- Stores criminal information.
- Stores criminal face images.
- Retrieves matching records.

### 2. Face Detection Module
- Detects human faces using OpenCV Haar Cascade.
- Crops the detected face.

### 3. Image Processing Module
- Converts image to grayscale.
- Resizes image.
- Applies Gaussian Blur.
- Histogram Equalization.

### 4. Face Matching Module
- Compares uploaded face with stored criminal images.
- Calculates similarity score.
- Returns the best matching result.

---

## 🗄 Database Fields

- Criminal ID
- Name
- Gender
- Age
- Crime Details
- Image Path

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/yourusername/Criminal-Face-Detection-System.git
```

2. Open the project in VS Code or IntelliJ.

3. Install Java JDK.

4. Install OpenCV and configure native libraries.

5. Import the MySQL database.

6. Update database credentials.

7. Run the JavaFX application.

---

## 📷 Workflow

```
Upload Image
      │
      ▼
Face Detection
      │
      ▼
Image Processing
      │
      ▼
Feature Comparison
      │
      ▼
Database Matching
      │
      ▼
Display Criminal Details
```

---

## 🚀 Future Enhancements

- Deep Learning based Face Recognition
- Real-time CCTV Integration
- Multiple Face Detection
- Criminal Alert Notifications
- Cloud Database Support
- Higher Matching Accuracy

---

## 👥 Team Members

- Member 1 – Database Module
- Member 2 – Face Matching Module
- Member 3 – Face Detection Module
- Member 4 – Image Processing Module

---

## 📖 Learning Outcomes

- JavaFX GUI Development
- OpenCV Image Processing
- Face Detection Techniques
- MySQL Database Integration
- Image Matching Algorithms
- Java Multithreading
- Software Development Workflow

---

## 📜 License

This project is developed for educational purposes.
