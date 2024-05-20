# Duckburg Bank Mortgage Repayment Calculator

## Introduction
This program calculates the monthly installment of the mortgage repayment for customers of Duckburg Bank. Given the principal amount (loan amount received by the customer) and the loan term (in months), the program computes the monthly installment using a predefined formula.

## Program Structure

### Method: calculateMonthlyInstallment
- **Purpose**: Calculates the monthly installment based on the principal amount and loan term provided by the user.
- **Input**: Principal amount (double) and loan term (int).
- **Output**: Monthly installment amount (double).
- **Special Situations**: 
  - If the loan term is 0 or negative, throw an IllegalArgumentException.

## Implementation
The program is implemented in Java and follows an object-oriented approach for better code organization and reusability. It includes a single method, `calculateMonthlyInstallment`, to perform the core calculation.

### Code Files
- `MortgageCalculator.java`: Contains the implementation of the `calculateMonthlyInstallment` method.

## Usage
To use the program, execute the `main` method in the `MortgageCalculator` class. Follow the prompts to enter the principal amount and loan term, and the program will display the calculated monthly installment.

## Conclusion
By using a well-structured program with routine abstraction, Duckburg Bank can easily calculate mortgage repayments for its customers with minimal risk of errors.
