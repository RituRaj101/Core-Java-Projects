# 🎵 Music Player Application

A console-based Music Player Application developed using Core Java that enables users to manage their music collection, create playlists, and simulate music playback through a clean and interactive menu-driven interface.

This project demonstrates the implementation of Object-Oriented Programming principles, Java Collections Framework, exception handling, and modular application design in a real-world inspired application.

---

# 📌 Project Overview

The Music Player Application provides essential music management functionalities such as:

- Music library management
- Playlist creation and management
- Song playback simulation
- Audio controls
- Song searching and navigation

The project is designed as part of a Core Java Internship Project to showcase strong understanding of Java fundamentals and software design concepts.

---

# ✨ Features

## 🎼 Music Library Management
- Add songs to the music library
- Store song metadata:
  - Song ID
  - Title
  - Artist
  - Album
  - Duration
- Display all available songs

---

## ▶️ Music Playback Controls
- Play songs
- Pause playback
- Stop playback
- Simulated audio playback system

---

## 📂 Playlist Management
- Create playlists
- Add songs to playlists
- Remove songs from playlists
- View playlist contents

---

## 🔍 Search Functionality
- Search songs by:
  - Song title
  - Artist name

---

## 🔊 Audio Controls
- Volume adjustment support
- Volume range validation (0–100)

---

## ⚠️ Error Handling
- Invalid menu option handling
- Song not found handling
- Playlist validation
- Invalid volume handling

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core Programming Language |
| OOP Concepts | Application Design |
| ArrayList | Song Storage |
| HashMap | Playlist Management |
| Scanner Class | User Input |
| Exception Handling | Runtime Error Handling |

---

# 🏗️ Project Architecture

```
MusicPlayerApp
│
├── Song.java
├── Playlist.java
├── MusicPlayer.java
└── Main.java
```

---

# 📖 Module Description

## 1. Song.java
Represents a song entity within the application.

### Responsibilities:
- Store song information
- Provide getter methods
- Display formatted song details

---

## 2. Playlist.java
Manages playlist-related operations.

### Responsibilities:
- Add songs to playlist
- Remove songs from playlist
- Display playlist contents

---

## 3. MusicPlayer.java
Core business logic of the application.

### Responsibilities:
- Manage music library
- Handle playback operations
- Manage playlists
- Control audio volume
- Perform song searching

---

## 4. Main.java
Application entry point.

### Responsibilities:
- Display menu
- Handle user interaction
- Control application flow

---

# ⚙️ System Requirements

Before running the project, ensure the following software is installed:

| Requirement | Version |
|---|---|
| Java JDK | 8 or Above |
| Operating System | Windows / Linux / macOS |
| IDE (Optional) | IntelliJ / Eclipse / VS Code |

---

# ☕ Java Installation

## Step 1: Download Java JDK

Download and install Java JDK from:

- Oracle JDK  
  https://www.oracle.com/java/technologies/downloads/

OR

- Eclipse Adoptium  
  https://adoptium.net/

---

## Step 2: Verify Installation

Open terminal or command prompt and run:

```bash
java -version
```

If Java is installed successfully, the installed version will be displayed.

---

# ▶️ How to Run the Project

## Method 1: Using Command Prompt / Terminal

---

## Step 1: Create Project Folder

Create a folder named:

```text
MusicPlayerApp
```

---

## Step 2: Add Java Files

Create the following files inside the folder:

```text
Song.java
Playlist.java
MusicPlayer.java
Main.java
```

Paste the respective source code into each file.

---

## Step 3: Open Terminal

Open terminal or command prompt inside the project folder.

---

## Step 4: Compile the Project

Run the following command:

```bash
javac *.java
```

### Compilation Output
The compiler generates `.class` files:

```text
Song.class
Playlist.class
MusicPlayer.class
Main.class
```

---

## Step 5: Execute the Application

Run the application using:

```bash
java Main
```

---

# 💻 Running the Project in IDEs

## ▶️ Visual Studio Code

### Steps:
1. Install VS Code
2. Install **Extension Pack for Java**
3. Open the project folder
4. Open `Main.java`
5. Click **Run**

---

## ▶️ IntelliJ IDEA

### Steps:
1. Create a new Java project
2. Add all Java source files
3. Open `Main.java`
4. Click **Run**

---

## ▶️ Eclipse IDE

### Steps:
1. Create a new Java project
2. Create all Java classes
3. Paste the source code
4. Right-click `Main.java`
5. Select:

```text
Run As → Java Application
```

---

# 🖥️ Sample Console Output

```text
===== MUSIC PLAYER =====

1. View Music Library
2. Play Song
3. Pause Song
4. Stop Song
5. Set Volume
6. Create Playlist
7. Add Song to Playlist
8. View Playlists
9. View Playlist Songs
10. Search Song
0. Exit

Enter choice: 1

Music Library:
1. Shape of You | Artist: Ed Sheeran
2. Believer | Artist: Imagine Dragons
3. Perfect | Artist: Ed Sheeran
```

---

# 📚 Core Concepts Implemented

## Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Constructors
- Method Abstraction

---

## Java Collections Framework
- ArrayList
- HashMap

---

## Exception Handling
- Input validation
- Runtime exception prevention

---

## Console-Based Application Design
- Menu-driven architecture
- User interaction handling

---
# 📋 Minimum Requirements

- Java JDK 8 or above
- Any Java IDE or terminal
- Basic understanding of Java execution
````
