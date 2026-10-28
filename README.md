# CS121-The-Java-Guesser-
## Algorithm
```
```
## Main
```
main() 
    - create new Guesser object 
        - new Guesser() 
```

## Guesser
```
guesser() 
    - scanner for user input 
    - choice = -1
    - while choice != 0 
        - print menu
            - 0) exit 
            - 1) Human Guesser
            - 2) computer Guesser 
        - ask the user to enter a choice
        - if choice == 1   
            -  humanGuesser(inout) 
        - else if choice == 2
            - computerGuesser(input) 
        - else if choice == 0 
            - print Thanks for playing Great Job!
        - else: 
            - print invalid choice!
```

## humanGuesser
```
humanGuesser() 
    - generate random number between 1 and 100
    - guess = 0 
    - turns = 0  
    - print human guesser
    -  while guess != number
        - turns++
        - add +1 to turns
        - ask user to enter a number
        - guess = input.nextInt() 
        - if guess is greater than the number 
            - print too high 
        - else if guess if less than number 
            - print too low 
        - else: 
            - print "Got it!" 
            - print very good!
```

## computerGuesser  
``` 
computerGuesser()
    - low = 1
    - high = 100
    - turns = 0 
    - keepGoing = true
    - print Computer Guesser
    - while keepGoing && low <= high
        - guess = (low + high) / 2
        - turns++
        - print computer guess
        - ask user if guest is high, low or correct
        - response = input.next().toLowercase()
        - if response equals "h"
            - high = guess - 1
        - else if response equals "l"
            - low = guess + 1
        - else if response equals "c"
            - print got it!
            - keepGoing = false 
        - else 
            - print Invalid response!
            - turns 
    - if low > high 
        - print Amswer do not match!
```






















