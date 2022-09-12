Laboration 5 : Yatzi. 

Målet går ut på att sätt sig in i Clean code och hur vi kan refaktorera vår kod för att få den
läsbar och enkel att förstå. 

Programmet är väldigt enkelt- det skapar upp 5 stycken tärningar och slår dem åt spelaren. 
Om vi får yatsi (d.v.s om alla tärningar har samma värde), så säger den det samt i vilken 
valör vi fick yatzi i och avslutar spelet. 

Det finns inga andra sätt att vinna eller få poäng. Efter varje slag som inte blev yatzi så får 
spelaren frågan om denne vill slå en gång till. När spelaren slagit 3 ggr (och inte fått yatzi) så 
blir det "Game over" och fråga om spelaren vill spela igen. 

Uppgift: 

Uppgiften går ut på att få koden så läsbar som möjligt. Använd alla knep ni få under 
främst den första föreläsningen den här veckan och refaktorera koden (d.v.s koden ska fungera 
på samma sätt som den redan gör men vara enkel att förstå och sätta sig in i för nya personer).

Ni ska också ha fyllt i testkod som testar om det blir yatzi och om alla tärningar är lika
, samt ett test som visar att det inte är yatzi när en tärning inte matchar (dessa test finns påbörjade i YatziTest.java).
Ni får gärna skriva mer test om det hjälper er med faktoreringen men det är dock inget krav. 

tips: Bryt ut kod i mindre metoder, rensa bort sådant som inte används och se till att det inte 
finns duplicerad kod nånstans. Namnge även variabler, metoder och klasser utifrån vad de gör. 

---------------------------------------------------------------
Laboration 5: Yatzi. 

The goal is to learn and make clean code and how we can refactor our code to make it easier to understand.

The program is very simple- it creates 5 dices and roll them for the user. If the user gets yatzi (all 
5 dices is the same value), the program tells us that and what value the dices are and ends the game. 

There is no other way to score points or to win the game. After each roll that does´nt end with yatzi, 
the user gets a choice of rolling again or ending the game. The user can roll the dices three times, after that
it is "Game is" over and the user gets to answere the question if they want to play again. 

Assignment: 

Make the code as easy to read as possible. Use every trick we talked about in class especially during the first lecture 
this week and refactor the code (it should work the same but be easy for other programmers 
to read and understand). 

You should also make tests that test if user gets yatzi and all the dices are the same, 
and a test that shows that it´s not yatsi when a dice does´nt match the others (these tests are already started
in file YatziTest.java). If you want to you can write more tests but it´s not necessary. 

tip: make the code to smaller methods, clean out stuff that does´nt being used and make 
sure that the code is not duplicated. Name the variables, methods and classes depending of what function they
have. 

// Carola Lindfors Sejsing. 