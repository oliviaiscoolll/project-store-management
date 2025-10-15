# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](Copy of UML Diagram.pdf)

## Description

For my project, I created a program that is designed to simulate when ordering from the resturaunt Chipotle, letting users pick between ordering a bowl or a wrap.The Meal class serves as the superclass with properties such as price and side(s), and Bowl and Wrap are subclasses that extend Meal with additional attributes such as size and diameter. Users can interact with the resturaunt through the console using a Scanner object, where they input choices for meal type, price, sides, and size or diameter. The program uses setter methods to update the objects with user input and getter methods to retrieve these values when printing the order. Finally, the toString method demonstrates method overriding, allowing each subclass to display its unique information while still using the common Meal properties. This project helped me see how classes and objects can represent real-world items and how user input can control program behavior.