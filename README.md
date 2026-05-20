# Project Planner

A simple Java command-line project planner for collecting project ideas, selecting the most important ones, assigning durations, and generating a day-by-day schedule.

## What this software does

- Asks the user for a name, age, and project title
- Collects project ideas entered by the user
- Shows all ideas and allows the user to select which ideas should be included
- Prompts for a duration in days for each selected idea
- Prints a daily schedule that assigns each idea to consecutive days

## Who it’s for

This program is designed for a student or beginner developer who wants to organize project ideas and turn them into a simple timeline.

## How to run the program

1. Open a terminal in the repository root.
2. Compile the Java files:
   ```bash
   javac src/*.java
   ```
3. Run the application:
   ```bash
   java -cp src App
   ```
4. Follow the prompts to enter your name, age, project title, ideas, selections, and durations.

## Project structure

- `src/App.java` - main driver program with user prompts and workflow
- `src/Idea.java` - stores an idea description and duration
- `src/ProjectManager.java` - manages all ideas and selected ideas
- `src/Schedule.java` - generates and prints the final schedule

## Key concepts used

- Object-oriented design with multiple classes
- `ArrayList` for storing ideas
- Basic input handling with `Scanner`
- Encapsulation with private fields and getters/setters
- Simple schedule generation using loops and idea durations

## Example usage

- Enter your name and age
- Give your project a title
- Type several ideas, one per line, then type `done`
- Choose idea indexes to select the ideas you want
- For each selected idea, enter the number of days required
- The program prints a sequence of `Day N: idea` entries

## Known limitations

- No validation for negative durations or invalid selection input beyond index bounds
- Selected ideas stay in the order they were entered
- The schedule is linear and does not support parallel tasks or dates

## Future improvements

- Add input validation and error handling
- Allow editing or removing ideas before schedule generation
- Support start dates and calendar-style output
- Save/load project plans to a file

## Notes

This README is written for the final project implementation and describes the actual code present in the repository.
