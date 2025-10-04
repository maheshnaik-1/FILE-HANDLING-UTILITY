# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: SUGALI MAHESH NAIK

*INTERN ID*: CT04DY1974

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# Description of the Task1:

The goal of this task is to implement a Java program that can handle files by writing, reading, and appending material, as well as creating new files and opening existing ones.  This project's main objective is to show off practical understanding of Java's Input/Output  package and use it to address persistent storage-related real-world issues.

Files enable us to store data on the system permanently, in contrast to temporary variables that vanish when a program terminates.  Because of this, one of the most crucial ideas for programmers and software developers is file handling.  This task allowed me to investigate how Java works with the file system of the operating system and how user input can be efficiently stored, retrieved, and altered.

# Tools Used:

Programming Language: Java (JDK 8)

## Java Packages:

  java.io.File – for file creation and management

  FileWriter – for writing text to files

  BufferedReader & FileReader – for reading text from files

  Error Handling: Implemented using try-catch blocks for safe execution

  Used resources like GOOGLE, QUICKREF, YOUTUBE AND CHATGPT for quick reference and to know some info, they helped me complete tasks efficiently.

# Editors and Compiler Platforms used:

During the development and testing process, I used multiple environments to ensure the program’s portability and correctness:

IntelliJ IDEA – Used as the main IDE for writing and debugging code.

Eclipse IDE – Used for alternate testing and cross-verification.

Command Line Interface (Windows CMD/PowerShell) – To compile (javac) and run (java) the program without IDE support.

Online Java Compilers – Platforms like JDoodle and Programiz were tested.  Some online compilers, however, limit file input/output, so the software functions best on a local computer (PC compiler), where it may communicate with the system files directly.

# Applications of the Task:

## The program and information created here can be used in a variety of situations:

 Log management- It is the process of storing system or application logs in files.

 Data storage- It is the process of keeping notes, structured text, and user inputs for later use.

 Configuration handling- It involves reading and making changes to application configuration files.

 Educational practice- It helps in comprehending the operation of persistent storage is an educational practice.

 Mini Projects- Providing a backend for small text-based applications like simple record keepers or notepads.

# How the Program Works:

  User Input for File Path: The application initially requests that the user enter the whole path or file name.  This decides whether an existing file will be opened or a new one will be created.

  File Creation or Opening: The system creates the file if it doesn't already exist.  The software opens it for additional actions if it already exists.

  The operations menu: It  gives the user choices like adding text, reading already-written information, and creating new content.

  Writing Data: The user can add new content to the file by overwriting it with FileWriter.

  Reading Data: The application reads the file line by line and shows it on the console using FileReader and BufferedReader.

  Appending Data: Without deleting the original information, more text can be added at the end of the file.

  Confirmation Messages: To let the user know what has happened, the application shows a success or error message following each activity.

  # Output:

  Do you want to create a new file or open existing? (C/O): 
  
  c
  
  Enter the full path of the file (e.g., C:\Users\Mahi\Documents\file.txt):

  C:\Users\Dell\Downloads\HelloWorld.txt

  File created successfully at: C:\Users\Dell\Downloads\HelloWorld.txt

  Enter text to write to the file (will overwrite existing content):
  
  Good Morning
  
  Data written successfully!

  --- File Content ---
  
  Good Morning

  Enter text to append to the file:
  
  How are you?
  
  Data appended successfully!

  --- Updated File Content ---
  
  Good Morning
  
  How are you?

![Image](https://github.com/user-attachments/assets/ad0fe7ed-4ba8-4742-bfdc-c4b99a92be4c)

![Image](https://github.com/user-attachments/assets/835ecd30-6afc-4413-80dc-55671183f53a)
