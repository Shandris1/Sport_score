# Sport_score
 
This library can be used to keep track of scores in the world cup. It was designed for professional use, so some considerations were made with the view that the library will be used by professional users,
and therefore there are fewer safeguards then in library designed for normal people. Such examples include the fact that scoring allows to record multiple scores in a row, or score can be subtracted, with only limitation
being the fact that score cannot be set below 0. In addition there is no verification on country names, or on countries being duplicates. This is done due to the fact that the system is designed to prevent confusion if there is 
an overlap in games for some reason.

How to use
This library introduces a new data type
Game
that is made out of home and away team countries, and well as home and away score. Games can be combined together into AllGamesQueue 

Examples of usage can be found in unit tests, but here are selected examples

new game("Mexico","Brazil"); - Creates a new game with Mexico playing at home and Brazil away

game.increaseHomeScore(1); - records a home goal
game.increaseBothScores(1,2); - records 1 score for home and 2 for away
game.getOutputString(); - creates output string formated as "HOME HOMESCORE - AWAY AWAYSCORE"

AllGamesQueue.addNewGame(new game("Russia","China")); - add a Russia vs China game into the array
AllGamesQueue.getGameByPosition(0).increaseHomeScore(5); - increase the score of the oldest game by 5 for home
AllGamesQueue.printAllGamesPosition() - print all games position in DB. Can be used to make sure correct game is removed
AllGamesQueue.removeByPosition(1); remove second oldest game. This shifts all newer games one space to left

AllGamesQueue.getAllGamesSortedByScore() - returns an array list of all games sorted by score, with newest game on top.

The library is designed to be used interactively, hence the nature of the errors and and catching some of the errors