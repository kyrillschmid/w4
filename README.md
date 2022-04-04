# Week 4 Assignment - Timers: a list of your favorite timers

This is assignment 4 of the 'mobile application development' course at Munich University of Applied Sciences.

## Basics for this assignment
Follow lesson 6 'Persistence' in the [udacity course](https://www.udacity.com/course/developing-android-apps-with-kotlin--ud9012)
or read [06.1, 06.2, and 06.3](https://codelabs.developers.google.com/android-kotlin-fundamentals/) in Google codelabs.

## What to do with this repository

1. Clone the repository
2. You can create your own development branch or work with the master branch. 
3. Read the assignment on [Moodle Assignment 'Week 4 - Lesson 6 of online course'](https://moodle.hm.edu/mod/assign/view.php?id=426274) or down below.
4. Start coding and have fun.

## Assignment

Extend your timer app to **timers** (multiple timers). In your timer app last week, you have a single timer and you need to change your start time depending on what you want to do.
This week you use a room database to store your favorite timers (e.g. a timer for brushing your teeth, a timer for cooking hard-boiled easter eggs, a timer for cooking spaghetti, etc.). No more changing start times, just select the appropriate timer from your list of timers. 

Extend your timer app or start with the code provided in this repository.

- Create a database for timers.
- A timer has a time in seconds and a name.
- Define a DAO for timers to *insert*, *update*, and *delete* a timer; use a query to *sort* the timers in ascending order by length of time
- Extend your timer app to list all the timers in your database. The user can select a timer in the list to start it. Check the code in this repository to see how to use a ```RecyclerView```. If you don't want to use your timer, you can use the [Android built-in timer](https://developer.android.com/guide/components/intents-common#CreateTimer), which is part of [Common Intents](https://developer.android.com/guide/components/intents-common). You find it in the ```Timer.kt``` in this repository. 
- The user should be able to *create* a timer, to *delete* a timer, to *change* time and name of a timer, and to *sort* the list of timers.

 Screenshot of the starter code in the repository:
<p align="center">
  <img width="337" height="600" src="https://github.com/gsocher/w4/blob/master/doc/timers_example.png">
</p>


