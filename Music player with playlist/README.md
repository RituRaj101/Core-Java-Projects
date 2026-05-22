# 🎵 Music Player with Playlist Using JDBC

A console-based Music Player Application developed using **Core Java**, **JDBC API**, and **Oracle/MySQL Database**.

This application allows users to:
- Manage music collections
- Create and manage playlists
- Store songs and playlists in a database
- Search songs
- Simulate music playback operations

The project demonstrates real-world implementation of:
- JDBC Connectivity
- Database Operations
- Object-Oriented Programming (OOP)
- SQL Queries
- Menu-Driven Application Design

---

# 📌 Project Overview

The Music Player Application is designed to simulate the basic functionality of a modern music player system.

The application provides:
- Song management
- Playlist creation and management
- Database storage using JDBC
- Music playback simulation
- Search and filtering features

This project serves as a strong beginner-to-intermediate level JDBC project for learning Java database integration and application architecture.

---

# ✨ Features

## 🎼 Music Library Management
- Add songs to the database
- View all available songs
- Store song metadata:
  - Song ID
  - Title
  - Artist
  - Album
  - Genre
  - Duration

---

## 📂 Playlist Management
- Create playlists
- Add songs to playlists
- Remove songs from playlists
- View playlist songs

---

## ▶️ Music Playback Simulation
- Play songs
- Pause songs
- Stop songs
- Skip songs

---

## 🔍 Search Functionality
- Search songs by artist name

---

## 🛢️ JDBC Database Integration
- Store songs persistently
- Store playlists persistently
- Manage playlist-song relationships

---

## ⚠️ Error Handling
- Database connection handling
- SQL exception handling
- Invalid menu handling
- Runtime exception handling

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core Programming Language |
| JDBC API | Database Connectivity |
| Oracle/MySQL | Database |
| SQL | Database Queries |
| OOP Concepts | Application Design |
| PreparedStatement | Secure SQL Execution |
| ResultSet | Data Retrieval |

---

# 🏗️ Project Structure

```text
MusicPlayerJDBC
│
├── DBConnection.java
├── Song.java
├── Playlist.java
├── MusicPlayerService.java
└── Main.java
```

---

# 🛢️ Database Schema

---

# 1️⃣ Songs Table

```sql
CREATE TABLE songs (

    song_id NUMBER PRIMARY KEY,
    title VARCHAR2(100),
    artist VARCHAR2(100),
    album VARCHAR2(100),
    genre VARCHAR2(50),
    duration NUMBER
);
```

---

# 2️⃣ Playlists Table

```sql
CREATE TABLE playlists (

    playlist_id NUMBER PRIMARY KEY,
    playlist_name VARCHAR2(100)
);
```

---

# 3️⃣ Playlist Songs Table

```sql
CREATE TABLE playlist_songs (

    playlist_id NUMBER,
    song_id NUMBER,

    FOREIGN KEY (playlist_id)
    REFERENCES playlists(playlist_id),

    FOREIGN KEY (song_id)
    REFERENCES songs(song_id)
);
```

---

# 📖 Module Description

## 1. DBConnection.java
Handles JDBC database connectivity.

### Responsibilities:
- Load JDBC Driver
- Establish database connection
- Return Connection object

---

## 2. Song.java
Represents a song entity.

### Responsibilities:
- Store song metadata
- Provide getter methods

---

## 3. Playlist.java
Represents playlist information.

### Responsibilities:
- Store playlist details
- Manage playlist data

---

## 4. MusicPlayerService.java
Contains core business logic.

### Responsibilities:
- Add/View songs
- Create playlists
- Add/remove songs from playlists
- Search songs
- Music playback simulation
- Execute JDBC operations

---

## 5. Main.java
Application entry point.

### Responsibilities:
- Display menu
- Handle user interaction
- Manage program flow

---

# ⚙️ System Requirements

Before running the project, ensure the following software is installed:

| Requirement | Version |
|---|---|
| Java JDK | 8 or Above |
| Oracle Database / MySQL | Installed |
| JDBC Driver | Added to Project |
| IDE (Optional) | IntelliJ / Eclipse / VS Code |

---

# ☕ Java Installation

## Step 1: Download Java JDK

Download Java JDK from:

- Oracle JDK  
  https://www.oracle.com/java/technologies/downloads/


## Step 2: Install Java

Install the JDK normally.

---

## Step 3: Verify Installation

Open terminal or command prompt and run:

```bash
java -version
```

If Java is installed successfully, the installed version will be displayed.

---

# 🛢️ Database Setup

You can use either:
- Oracle Database
OR
- MySQL Database

---

# ▶️ Oracle Database Setup

## Step 1: Install Oracle Database

Download Oracle Database21c.
https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html

---

## Step 2: Start Oracle Services

Ensure Oracle Database services are running.

---

## Step 3: Open SQL Developer

Connect using:
- Username
- Password
- Port Number

---

## Step 4: Create Tables

Run the SQL queries provided above.

---

# ▶️ MySQL Database Setup (Optional)

If using MySQL:

Replace:

```java
jdbc:oracle:thin:@localhost:1521:orcl
```

with:

```java
jdbc:mysql://localhost:3306/musicdb
```

Also update:
- Username
- Password
- JDBC Driver

---

# 🔌 JDBC Driver Setup

---

# ▶️ For Oracle JDBC

Download:
- `ojdbc17.jar`

Add it to your project libraries.

---

# ▶️ For MySQL JDBC

Download:
- `mysql-connector-j.jar`

Add it to your project libraries.

---

# ▶️ How to Add JDBC Driver in VS Code

## Step 1:
Create a folder named:

```text
lib
```

---

## Step 2:
Paste JDBC `.jar` file inside `lib`

---

## Step 3:
Add library path in VS Code Java Project settings.

---

# ▶️ How to Add JDBC Driver in IntelliJ IDEA

## Steps:
1. Open Project Structure
2. Libraries
3. Add `.jar` file
4. Apply changes

---

# ▶️ How to Add JDBC Driver in Eclipse

## Steps:
1. Right-click project
2. Build Path
3. Configure Build Path
4. Add External JARs
5. Select JDBC `.jar`

---

# ▶️ How to Run the Project in Local Environment

---

# Step 1: Create Project Folder

Create folder:

```text
MusicPlayerJDBC
```

---

# Step 2: Add Java Files

Create:

```text
DBConnection.java
Song.java
Playlist.java
MusicPlayerService.java
Main.java
```

Paste the source code into each file.

---

# Step 3: Configure Database

- Start Oracle/MySQL database
- Create required tables
- Update database credentials in `DBConnection.java`

Example:

```java
private static final String URL =
"jdbc:oracle:thin:@localhost:1521:xe";

private static final String USERNAME =
"system";

private static final String PASSWORD =
"system";
```

---

# Step 4: Add JDBC Driver

Add:
- Oracle JDBC Driver OR
- MySQL JDBC Driver

to project libraries.

---

# Step 5: Open Terminal

Open terminal inside project folder.

---

# Step 6: Compile Java Files

Run:

```bash
javac *.java
```

---

# Step 7: Run the Application

Execute:

```bash
java Main
```

---

# 💻 Running the Project in IDEs

---

# ▶️ Visual Studio Code

### Steps:
1. Install VS Code
2. Install **Extension Pack for Java**
3. Add JDBC Driver
4. Open project folder
5. Open `Main.java`
6. Click **Run**

---

# ▶️ IntelliJ IDEA

### Steps:
1. Create Java Project
2. Add Java files
3. Add JDBC Driver
4. Configure database
5. Run `Main.java`

---

# ▶️ Eclipse IDE

### Steps:
1. Create Java Project
2. Add Java files
3. Configure Build Path
4. Add JDBC Driver
5. Run `Main.java`

---

# 🖥️ Sample Console Output

```text
===== MUSIC PLAYER =====

1. Add Song
2. View Songs
3. Create Playlist
4. Add Song To Playlist
5. View Playlist Songs
6. Remove Song From Playlist
7. Search By Artist
8. Play Song
9. Pause Song
10. Stop Song
11. Skip Song
0. Exit
```

## Exception Handling
- SQL Exception Handling
- Database Error Handling
- Runtime Exception Handling

---

# 📋 Minimum Requirements

- Java JDK 8 or above
- Oracle/MySQL Database
- JDBC Driver
- Any Java IDE or terminal

---

