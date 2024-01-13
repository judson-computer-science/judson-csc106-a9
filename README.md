# Assignment 9 - Generics
In this assignment, you are going to implement a sports roster management system for football players and track & field athletes. The system should be able to manage different rosters and allow trading of athletes between teams.

You are provided with an `Athlete` class and the beginnings of the application class.  You must provide the remaining implementations.

## Assignment Submission
You will submit your assignment using GitHub Classroom.  When you are finished and want to make your final submission, use the checkin comment "FINAL SUBMISSION":

        git add .
        git commit -m "FINAL SUBMISSION"
        git push origin main

Any submission not having this comment will be assumed to be a work-in-progress and therefore will be ignored.  This implies that you must make your final push with this commit comment before the deadline.

## Implementation Notes
- You will need to create two different implementations of the `Athlete` abstract class:
   - `FootballPlayer`: This implementation should be used for football players. It should have the following additional properties and methods related to football (along with their getters):
      - **position**: a `String` representing the position of the football player
      - **numberOfTouchdowns**: an `int` representing the number of touchdowns scored by the football player
      - `void printDetails()`: override method that prints football player's details
   - `TrackAndFieldAthlete`: This implementation should be used for track & field athletes. It should have the following additional properties and methods related to track & field (along with their getters):
      - **event**: a `String` representing the event in which the athlete competes
      - **numberOfMedals**: an `int` representing the number of medals won by the athlete
      - **personalBests**: a `Map<String, Float>` representing the athlete's personal bests in different events
      - `void printDetails()`: override method that prints track & field athlete's details

- You will need to create a generic class called `Roster<T extends Athlete>` that defines the following methods:
   - `String getTeamName()`: returns the team name
   - `void setTeamName(String teamName)`: sets the team name
   - `List<T> getAthletes()`: returns the list of athletes in the roster
   - `void setAthletes(List<T> athletes)`: sets the list of athletes in the roster
   - `void addAthlete(T athlete)`: adds an athlete to the roster
   - `static <T extends Athlete> void trade(Roster<T> roster1, Roster<T> roster2, String name1, String name2)`: trades the athelete named `name1` on `roster1` with the athlete named `name2` on `roster2`.

- You will need to create an enum called `Sport` that defines the following constants:
   - `TRACK_AND_FIELD`
   - `FOOTBALL`

# Input
None

# Output
~~~~
Football Team 1 roster before trade: 
Name: Tom Brady
Position: Quarterback
Number of Touchdowns: 500

Name: Drew Brees
Position: Quarterback
Number of Touchdowns: 450

Football Team 2 roster before trade: 
Name: Patrick Mahomes
Position: Quarterback
Number of Touchdowns: 200

Name: Josh Allen
Position: Quarterback
Number of Touchdowns: 150

Football Team 1 roster after trade: 
Name: Drew Brees
Position: Quarterback
Number of Touchdowns: 450

Name: Josh Allen
Position: Quarterback
Number of Touchdowns: 150

Football Team 2 roster after trade: 
Name: Patrick Mahomes
Position: Quarterback
Number of Touchdowns: 200

Name: Tom Brady
Position: Quarterback
Number of Touchdowns: 500

Track and Field Team 1 roster before trade: 
Name: Usain Bolt
Main Event: Sprints
Medal Count: 12
Personal Best Times: 
  - 100m: 9.58 sec
  - 200m: 19.19 sec

Name: Asafa Powell
Main Event: Sprints
Medal Count: 10
Personal Best Times: 
  - 100m: 9.72 sec
  - 200m: 19.9 sec

Track and Field Team 2 roster before trade: 
Name: Tyson Gay
Main Event: Sprints
Medal Count: 8
Personal Best Times: 
  - 100m: 9.69 sec
  - 200m: 19.58 sec

Name: Yohan Blake
Main Event: Sprints
Medal Count: 7
Personal Best Times: 
  - 100m: 9.69 sec
  - 200m: 19.26 sec

Track and Field Team 1 roster after trade: 
Name: Usain Bolt
Main Event: Sprints
Medal Count: 12
Personal Best Times: 
  - 100m: 9.58 sec
  - 200m: 19.19 sec

Name: Tyson Gay
Main Event: Sprints
Medal Count: 8
Personal Best Times: 
  - 100m: 9.69 sec
  - 200m: 19.58 sec

Track and Field Team 2 roster after trade: 
Name: Yohan Blake
Main Event: Sprints
Medal Count: 7
Personal Best Times: 
  - 100m: 9.69 sec
  - 200m: 19.26 sec

Name: Asafa Powell
Main Event: Sprints
Medal Count: 10
Personal Best Times: 
  - 100m: 9.72 sec
  - 200m: 19.9 sec
~~~~
