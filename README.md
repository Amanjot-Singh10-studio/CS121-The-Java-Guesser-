# CS121-The-Java-Guesser-
## Algorithm 
```
## Main 
```
main() 
    - guesser object 
    - constructor 
    - end main 
```
## Guesser
```
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
```
humanGuesser() 
    - generate random number  
