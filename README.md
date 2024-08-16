## Search Functionality Automation & Array Increment Problem
## Project Overview
-- This project contains two key components:

--  QA Automation Testing Task: Automating the search functionality of a website using Selenium and TestNG.
--  Problem Solving Task: Implementing a solution to increment a large integer represented as an array.
## Table of Contents

## Project Overview
-- Technologies Used
-- Test Automation: Search Functionality
-- Test Scenario
-- Test Script
-- Execution
-- Problem Solving Task: Array Increment
-- Problem Description
-- Solution Approach
-- Code Implementation
-- Contributing
-- License

## Technologies Used
-- Java: Programming language used for implementing the test scripts and the array increment solution.
-- Selenium: WebDriver used for automating web application testing.
-- TestNG: Testing framework used for structuring and running automated tests.
-- Maven: Build automation tool used for managing project dependencies.

## Test Automation: Search Functionality
## Test Scenario
-- This component automates the search functionality of a web page (e.g., Wikipedia). The objective is to verify that when a user enters a search term ("Selenium") in the input field and clicks the search button, the results area displays the expected outcome.

## Test Script
-- The test script is implemented in the searchpage.SearchSelenium class. It interacts with the search input field, the search button, and verifies that the search results display the expected text.
![image](https://github.com/user-attachments/assets/20051329-792a-46b4-97f2-47424f22994b)

## Execution in STS
-- To execute the test within Spring Tool Suite:
-- Right-click on the test class (SearchSelenium.java).
-- Select Run As > TestNG Test.
-- View the results in the TestNG view, which shows passed/failed test cases.

## Problem Solving Task: Array Increment
## Problem Description
-- You are given a large integer represented as an array of digits. The task is to increment this integer by one and return the resulting array.

## Solution Approach
-- The solution iterates through the array from the last digit to the first, handling cases where digits equal 9 by carrying over the increment. If necessary, a new array is created to accommodate an additional digit.
![image](https://github.com/user-attachments/assets/6631dbad-0403-41c6-a978-d688427c7980)

## Execution in STS
-- Right-click on the ArrayJava.java file.
-- Select Run As > Java Application.
-- The output will be displayed in the Console view.





