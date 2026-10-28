# CS121-The-Java-Guesser-
## Algorithm
```
```
## Main
```text
main() 
    - guesser object 
    - constructor 
    - end main 
```

## Guesser
```text
guesser() 
    - scanner for user input 
    - choice = -1
    - loop while choice = 0 
        - print menu 
        - ask the user to enter a choice
        - if choice is 1:   
            -  humanGuesser() 
        - else if choice is 2
            - computerGuesser() 
        - else if choice is 0 
            - print thank you playing good "Goodbye" 
        - otherwise: 
            - print invalid choice
    - repeat until user enter 0 
    - end constructor
```

## humanGuesser
```text
humanGuesser() 
    - generate random number 
    - guess and turns = 0 
    - print human guesser
    - loop while guess is not correct
        - add +1 to turns
        - ask user to enter a number 
        - if guess is greater than the number 
            - print too high 
        - else if guess if less than number then 
            - print too low 
        - otherwise: 
            - display "Got it good job!" 
    - repeat until guess is correct
    - end 
```

## computerGuesser  
``` 
computerGuesser
    - 
