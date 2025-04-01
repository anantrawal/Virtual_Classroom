Virtual Classroom

Virtual Classroom is a Java-based application with a graphical user interface (GUI) that enables students and teachers to interact in an online learning environment. It includes user authentication, lecture uploads, real-time whiteboard synchronization, and video lectures.
Setup MySQL Database
Open MySQL and run the following queries to create the database and required tables:
CREATE DATABASE virtual_classroom;
USE virtual_classroom;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role ENUM('admin', 'teacher', 'student') NOT NULL
);
CREATE TABLE videos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content LONGBLOB NOT NULL
);
