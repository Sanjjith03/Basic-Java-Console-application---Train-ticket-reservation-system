# 🚆 Java Railway Reservation Console Application

A simple yet functional **Railway Reservation System** built in Java for learning and showcasing basic object-oriented programming and console-based application development.

## 🧠 Purpose

This project was developed to gain hands-on exposure to **Java fundamentals**, including:

- Object-Oriented Programming (OOP)
- Java Collections (ArrayList)
- Basic I/O (Scanner)
- Console interaction
- Simple logic for managing resources (trains & tickets)

It was designed without any external database—data is temporarily stored in-memory using Lists to maintain simplicity and focus on logic-building.

---

## ⚙️ Features

- 📋 Display available trains with details
- ✅ Check seat availability by train number
- 🎟️ Book tickets by providing passenger name and train number
- ❌ Cancel a booked ticket using the passenger's name
- 🧾 View all booked tickets
- 🔁 Continuous interaction using a menu-driven console loop
- 🚫 Graceful handling of invalid inputs and edge cases

---

## 🧩 Components Used

### 1. `Main` (Controller Class)
Handles user interaction via the console and routes the user's actions to the `reservation` class.

### 2. `train` (Model Class)
Represents the train object with:
- Name
- Time
- Maximum capacity
- Train number

### 3. `reservation` (Service Class)
Handles the core business logic:
- Initializes available trains
- Manages ticket bookings, cancellations, and availability checks

---

## 📦 Tech Stack

- Language: **Java**
- IDE: Compatible with any Java-supported IDE (e.g., IntelliJ, Eclipse, VS Code)
- Build Tool: None (Pure Java Console App)

---

## 🔍 Sample Output


Railway Reservation System Menu:
1. Display Available Trains
2. Check Seat Availability
3. Book a Ticket
4. Cancel a Ticket
5. Display Booked Tickets
6. Exit
Enter your choice:

-------------------------------------------------------------------------------------------------
💡 Learning Outcomes

-Writing clean, modular Java code

-Real-time console user interaction

-Error handling and logic branching

-Data modeling using custom classes

-Understanding in-memory data storage using collections

--------------------------------------------------------------------------------------------------
🚀 Future Enhancements

Integrate a database (like MySQL) for persistent storage

-Add login and registration functionality

-Enable booking by train class (Sleeper, AC, etc.)

-GUI interface using JavaFX or Swing

-Export booked tickets to PDF or CSV

---------------------------------------------------------------------------------------------------
📁 How to Run

Clone the repository
git clone https://github.com/yourusername/railway-reservation-java.git

Open in your favorite Java IDE

Run the Main.java file

__________________________________________________________________________________________________________________________________________________________________________________________________________________
