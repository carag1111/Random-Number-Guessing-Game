#include <iostream>
#include <cstdlib> //for rand() and srand()
#include <ctime> //for time()
using namespace std;

int main() {
  int randomNumber, userGuess, guessCount = 0;

  // Seed the random number generator with the current time
  srand(time(0));
  randomNumber = rand() % 100 + 1; // Generate a random number between 1 and 100

  cout << "Guess the number between 1 and 100: " << endl;

  do {
    cout << "Enter your guess: ";
    cin >> userGuess;
    guessCount++;

    if (userGuess < randomNumber)
      cout << "Too low! Try again." << endl;
    else if (userGuess > randomNumber)
      cout << "Too high! Try again." << endl;
    else
      cout << "Congratulations! You guessed the number in " << guessCount << " tries." << endl;

    } while (userGuess != randomNumber);

   return 0;
  }