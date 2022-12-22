package goFish;

import java.util.Scanner;

public class goFish {
    public static final int NUM_SUITS = 4;
    public static final double NUM_FACES = 13;
    public static final int RESET_CARDS = 5;
    public static final int NUM_PLAYERS = 3;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean isdone = false;

        String playerHand = "";

        String computer1Hand = "";

        String computer2Hand = "";

        String computer3Hand = "";
        

        for (int i = 0; i < 5; i++) {
            playerHand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer1Hand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer2Hand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer3Hand += getCard() + " ";       
        }

        int playerscore = 0;
        int computer1score = 0;
        int computer2score = 0;
        int computer3score = 0; 

        while(!isdone){        
        playerscore += checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = numCards(playerHand);
        playerscore = playerscore + checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = add0(playerHand);

        System.out.println("Player Hand: " + playerHand);
        System.out.println("Score: " + playerscore);

        computer1score += checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);
        computer1Hand = numCards(computer1Hand);
        computer1score = computer1score + checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);

        System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
        System.out.println("Score: " + computer1score);

        computer2score += checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);
        computer2Hand = numCards(computer2Hand);
        computer2score = computer2score + checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);

        System.out.println("Computer2 Hand: " + displayHand(computer2Hand)); //code this method
        System.out.println("Score: " + computer2score);

        computer3score += checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);
        computer3Hand = numCards(computer3Hand);
        computer3score = computer3score + checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);

        System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
        System.out.println("Score: " + computer3score);

        if (playerscore == 10){
            System.out.println("Player wins!");
            isdone = false;
        }

        else if (computer1score == 10){
            System.out.println("Computer 1 Wins!");
            isdone = false;
        }
        else if (computer2score == 10){
            System.out.println("Computer 2 Wins!");
            isdone = false;
        }

        else if (computer3score == 10){
            System.out.println("Computer 3 Wins!");
            isdone = false;
        } 

    System.out.println(" ");

    boolean playerdone = false;

    if(playerscore < 10 && computer1score < 10 && computer2score < 10 && computer3score < 10){
        while(!playerdone){
            playerHand = removeZeros(playerHand);
            playerHand = removeSpace(playerHand);
                computer1Hand = removeSpace(computer1Hand);
                computer2Hand = removeSpace(computer2Hand);
                computer3Hand = removeSpace(computer3Hand);

             int playerask = getPlayerAsk(in);
             String playerwant = getPlayerWant(in);
             playerwant = removeZeros(playerwant);

            if(playerask == 1){
                playerHand = removeZeros(playerHand);
                boolean HaveCard = CheckCardTurn(computer1Hand, playerwant);

                if(HaveCard){
                    playerHand = removePairsTurn(playerHand, playerwant);
                    playerHand = removeSpace(playerHand);
                    playerscore++;

                    computer1Hand = removePairsTurn(computer1Hand, playerwant);
                    computer1Hand = removeSpace(computer1Hand);

                    playerHand = removeZeros(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerscore = playerscore + checkPairs(playerHand);
                    playerHand = removePairs(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerHand = numCards(playerHand);
                    playerscore = playerscore + checkPairs(playerHand);
                    playerHand = removePairs(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerHand = add0(playerHand);
             
                    System.out.println(" ");
                    System.out.println("Player Hand: " + playerHand);
                    System.out.println("Score: " + playerscore);
             
                    computer1Hand = removeZeros(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1score = computer1score + checkPairs(computer1Hand);
                    computer1Hand = removePairs(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1Hand = numCards(computer1Hand);
                    computer1score = computer1score + checkPairs(computer1Hand);
                    computer1Hand = removePairs(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
             
                    System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
                    System.out.println("Score: " + computer1score);
             
                    computer2Hand = removeZeros(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
                    computer2score = computer2score + checkPairs(computer2Hand);
                    computer2Hand = removePairs(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
                    computer2Hand = numCards(computer2Hand);
                    computer2score = computer2score + checkPairs(computer2Hand);
                    computer2Hand = removePairs(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
             
                    System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
                    System.out.println("Score: " + computer2score);
             
                    computer3Hand = removeZeros(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
                    computer3score = computer3score + checkPairs(computer3Hand);
                    computer3Hand = removePairs(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
                    computer3Hand = numCards(computer3Hand);
                    computer3score = computer3score + checkPairs(computer3Hand);
                    computer3Hand = removePairs(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
             
                    System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
                    System.out.println("Score: " + computer3score);
                    
                    // playerask = getPlayerAsk(in);
                    // playerwant = getPlayerWant(in);
                }

                else{
                    System.out.println("Go Fish!");
                    playerdone = true;
                }
            }

            else if(playerask == 2){
                playerHand = removeZeros(playerHand);
                boolean HaveCard = CheckCardTurn(computer2Hand, playerwant);

                if(HaveCard){
                    playerHand = removePairsTurn(playerHand, playerwant);
                    playerHand = removeSpace(playerHand);
                    playerscore++;

                    computer2Hand = removePairsTurn(computer2Hand, playerwant);
                    computer2Hand = removeSpace(computer2Hand);

                    playerHand = removeZeros(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerscore = playerscore + checkPairs(playerHand);
                    playerHand = removePairs(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerHand = numCards(playerHand);
                    playerscore = playerscore + checkPairs(playerHand);
                    playerHand = removePairs(playerHand);
                    playerHand = removeSpace(playerHand);
                    playerHand = add0(playerHand);
                    
                    System.out.println(" ");
                    System.out.println("Player Hand: " + playerHand);
                    System.out.println("Score: " + playerscore);
             
                    computer1Hand = removeZeros(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1score = computer1score + checkPairs(computer1Hand);
                    computer1Hand = removePairs(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1Hand = numCards(computer1Hand);
                    computer1score = computer1score + checkPairs(computer1Hand);
                    computer1Hand = removePairs(computer1Hand);
                    computer1Hand = removeSpace(computer1Hand);
             
                    System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
                    System.out.println("Score: " + computer1score);
             
                    computer2Hand = removeZeros(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
                    computer2score = computer2score + checkPairs(computer2Hand);
                    computer2Hand = removePairs(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
                    computer2Hand = numCards(computer2Hand);
                    computer2score = computer2score + checkPairs(computer2Hand);
                    computer2Hand = removePairs(computer2Hand);
                    computer2Hand = removeSpace(computer2Hand);
             
                    System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
                    System.out.println("Score: " + computer2score);
             
                    computer3Hand = removeZeros(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
                    computer3score = computer3score + checkPairs(computer3Hand);
                    computer3Hand = removePairs(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
                    computer3Hand = numCards(computer3Hand);
                    computer3score = computer3score + checkPairs(computer3Hand);
                    computer3Hand = removePairs(computer3Hand);
                    computer3Hand = removeSpace(computer3Hand);
             
                    System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
                    System.out.println("Score: " + computer3score);

                    // playerask = getPlayerAsk(in);
                    // playerwant = getPlayerWant(in);
                }

                else{
                    System.out.println("Go Fish!");
                    playerdone = true;
                }
        }

        else {
            playerHand = removeZeros(playerHand);
            boolean HaveCard = CheckCardTurn(computer3Hand, playerwant);

            if(HaveCard){
                playerHand = removePairsTurn(playerHand, playerwant);
                playerHand = removeSpace(playerHand);
                playerscore++;

                computer3Hand = removePairsTurn(computer3Hand, playerwant);
                computer3Hand = removeSpace(computer3Hand);

                playerHand = removeZeros(playerHand);
                playerHand = removeSpace(playerHand);
                playerscore = playerscore + checkPairs(playerHand);
                playerHand = removePairs(playerHand);
                playerHand = removeSpace(playerHand);
                playerHand = numCards(playerHand);
                playerscore = playerscore + checkPairs(playerHand);
                playerHand = removePairs(playerHand);
                playerHand = removeSpace(playerHand);
                playerHand = add0(playerHand);
                
                System.out.println(" ");
                System.out.println("Player Hand: " + playerHand);
                System.out.println("Score: " + playerscore);
         
                computer1Hand = removeZeros(computer1Hand);
                computer1Hand = removeSpace(computer1Hand);
                computer1score = computer1score + checkPairs(computer1Hand);
                computer1Hand = removePairs(computer1Hand);
                computer1Hand = removeSpace(computer1Hand);
                computer1Hand = numCards(computer1Hand);
                computer1score = computer1score + checkPairs(computer1Hand);
                computer1Hand = removePairs(computer1Hand);
                computer1Hand = removeSpace(computer1Hand);
         
                System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
                System.out.println("Score: " + computer1score);
         
                computer2Hand = removeZeros(computer2Hand);
                computer2Hand = removeSpace(computer2Hand);
                computer2score = computer2score + checkPairs(computer2Hand);
                computer2Hand = removePairs(computer2Hand);
                computer2Hand = removeSpace(computer2Hand);
                computer2Hand = numCards(computer2Hand);
                computer2score = computer2score + checkPairs(computer2Hand);
                computer2Hand = removePairs(computer2Hand);
                computer2Hand = removeSpace(computer2Hand);
         
                System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
                System.out.println("Score: " + computer2score);
         
                computer3Hand = removeZeros(computer3Hand);
                computer3Hand = removeSpace(computer3Hand);
                computer3score = computer3score + checkPairs(computer3Hand);
                computer3Hand = removePairs(computer3Hand);
                computer3Hand = removeSpace(computer3Hand);
                computer3Hand = numCards(computer3Hand);
                computer3score = computer3score + checkPairs(computer3Hand);
                computer3Hand = removePairs(computer3Hand);
                computer3Hand = removeSpace(computer3Hand);
         
                System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
                System.out.println("Score: " + computer3score);

                // playerask = getPlayerAsk(in);
                // playerwant = getPlayerWant(in);
            }

            else{
                System.out.println("Go Fish!");
                playerdone = true;
            }
        }
         }
        }
        if (playerdone = true){
            playerHand += getCard() + " ";
        }

        playerHand = removeZeros(playerHand);
        playerHand = removeSpace(playerHand);
        playerscore = playerscore + checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = numCards(playerHand);
        playerscore = playerscore + checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = add0(playerHand);

        System.out.println("Player Hand: " + playerHand);
        System.out.println("Score: " + playerscore);

        computer1Hand = removeZeros(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);
        computer1score = computer1score + checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);
        computer1Hand = numCards(computer1Hand);
        computer1score = computer1score + checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);

        System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
        System.out.println("Score: " + computer1score);

        computer2Hand = removeZeros(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);
        computer2score = computer2score + checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);
        computer2Hand = numCards(computer2Hand);
        computer2score = computer2score + checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);

        System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
        System.out.println("Score: " + computer2score);

        computer3Hand = removeZeros(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);
        computer3score = computer3score + checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);
        computer3Hand = numCards(computer3Hand);
        computer3score = computer3score + checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);

        System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
        System.out.println("Score: " + computer3score);

        if (playerscore == 10){
            System.out.println("Player wins!");
            isdone = false;
        }

        else if (computer1score == 10){
            System.out.println("Computer 1 Wins!");
            isdone = false;
        }
        else if (computer2score == 10){
            System.out.println("Computer 2 Wins!");
            isdone = false;
        }

        else if (computer3score == 10){
            System.out.println("Computer 3 Wins!");
            isdone = false;
        } 

        boolean computer1done = false;

        if(playerscore < 10 && computer1score < 10 && computer2score < 10 && computer3score < 10){
        while(!computer1done){
            playerHand = removeZeros(playerHand);
            playerHand = removeSpace(playerHand);
                computer1Hand = removeSpace(computer1Hand);
                computer2Hand = removeSpace(computer2Hand);
                computer3Hand = removeSpace(computer3Hand); 
            
            int player1ask = (int)(Math.random()*NUM_PLAYERS) + 1;
             String player1want = getComputerWant(computer1Hand);
             player1want = removeZeros(player1want);

            if(player1ask == 1){
                playerHand = removeZeros(playerHand);
                boolean HaveCard = CheckCardTurn(playerHand, player1want);

                if(HaveCard){
                    computer1Hand = removePairsTurn(computer1Hand, player1want);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1score++;

                    playerHand = removePairsTurn(playerHand, player1want);
                    playerHand = removeSpace(playerHand);

                    // player1ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                    // player1want = getComputerWant(computer1Hand);
                }

                else{
                    System.out.println("Go Fish!");
                    computer1done = true;
                }
            }

            else if(player1ask == 2){
                boolean HaveCard = CheckCardTurn(computer2Hand, player1want);

                if(HaveCard){
                    computer1Hand = removePairsTurn(computer1Hand, player1want);
                    computer1Hand = removeSpace(computer1Hand);
                    computer1score++;

                    computer2Hand = removePairsTurn(computer2Hand, player1want);
                    computer2Hand = removeSpace(computer2Hand);

                    // player1ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                    // player1want = getComputerWant(computer1Hand);
                }

                else{
                    System.out.println("Go Fish!");
                    computer1done = true;
                }
        }

        else {
            boolean HaveCard = CheckCardTurn(computer3Hand, player1want);

            if(HaveCard){
                computer1Hand = removePairsTurn(computer1Hand, player1want);
                computer1Hand = removeSpace(computer1Hand);
                computer1score++;

                computer3Hand = removePairsTurn(computer3Hand, player1want);
                computer3Hand = removeSpace(computer3Hand);

                // player1ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                // player1want = getComputerWant(computer1Hand);
            }

            else{
                System.out.println("Go Fish!");
                computer1done = true;
            }
        }
    }
        }
        if (computer1done = true){
            computer1Hand += getCard() + " ";
        }

        playerHand = removeZeros(playerHand);
        playerHand = removeSpace(playerHand);
        playerscore = playerscore + checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = numCards(playerHand);
        playerscore = playerscore + checkPairs(playerHand);
        playerHand = removePairs(playerHand);
        playerHand = removeSpace(playerHand);
        playerHand = add0(playerHand);

        System.out.println(" ");
        System.out.println("Player Hand: " + playerHand);
        System.out.println("Score: " + playerscore);

        computer1Hand = removeZeros(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);
        computer1score = computer1score + checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);
        computer1Hand = numCards(computer1Hand);
        computer1score = computer1score + checkPairs(computer1Hand);
        computer1Hand = removePairs(computer1Hand);
        computer1Hand = removeSpace(computer1Hand);

        System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
        System.out.println("Score: " + computer1score);

        computer2Hand = removeZeros(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);
        computer2score = computer2score + checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);
        computer2Hand = numCards(computer2Hand);
        computer2score = computer2score + checkPairs(computer2Hand);
        computer2Hand = removePairs(computer2Hand);
        computer2Hand = removeSpace(computer2Hand);

        System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
        System.out.println("Score: " + computer2score);

        computer3Hand = removeZeros(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);
        computer3score = computer3score + checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);
        computer3Hand = numCards(computer3Hand);
        computer3score = computer3score + checkPairs(computer3Hand);
        computer3Hand = removePairs(computer3Hand);
        computer3Hand = removeSpace(computer3Hand);

        System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
        System.out.println("Score: " + computer3score);

        if (playerscore == 10){
            System.out.println("Player wins!");
            isdone = false;
        }

        else if (computer1score == 10){
            System.out.println("Computer 1 Wins!");
            isdone = false;
        }
        else if (computer2score == 10){
            System.out.println("Computer 2 Wins!");
            isdone = false;
        }

        else if (computer3score == 10){
            System.out.println("Computer 3 Wins!");
            isdone = false;
        } 

        System.out.println(" ");
        boolean computer2done = false;

        if(playerscore < 10 && computer1score < 10 && computer2score < 10 && computer3score < 10){
    while(!computer2done){
        playerHand = removeZeros(playerHand);
            playerHand = removeSpace(playerHand);
            computer1Hand = removeSpace(computer1Hand);
            computer2Hand = removeSpace(computer2Hand);
            computer3Hand = removeSpace(computer3Hand);

            int player2ask = (int)(Math.random()*NUM_PLAYERS) + 1;
            String player2want = getComputerWant(computer2Hand);
            player2want = removeZeros(player2want);

           if(player2ask == 1){
               playerHand = removeZeros(playerHand);
               boolean HaveCard = CheckCardTurn(playerHand, player2want);

               if(HaveCard){
                   computer2Hand = removePairsTurn(computer2Hand, player2want);
                   computer2Hand = removeSpace(computer2Hand);
                   computer2score++;

                   playerHand = removePairsTurn(playerHand, player2want);
                   playerHand = removeSpace(playerHand);

                //    player2ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                //    player2want = getComputerWant(computer2Hand);
               }

               else{
                   System.out.println("Go Fish!");
                   computer2done = true;
               }
           }

           else if(player2ask == 2){
               boolean HaveCard = CheckCardTurn(computer1Hand, player2want);

               if(HaveCard){
                   computer2Hand = removePairsTurn(computer2Hand, player2want);
                   computer2Hand = removeSpace(computer2Hand);
                   computer2score++;

                   computer1Hand = removePairsTurn(computer1Hand, player2want);
                   computer1Hand = removeSpace(computer1Hand);

                //    player2ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                //    player2want = getComputerWant(computer2Hand);
               }

               else{
                   System.out.println("Go Fish!");
                   computer2done = true;
               }
       }

       else {
           boolean HaveCard = CheckCardTurn(computer3Hand, player2want);

           if(HaveCard){
               computer2Hand = removePairsTurn(computer2Hand, player2want);
               computer2Hand = removeSpace(computer2Hand);
               computer2score++;

               computer3Hand = removePairsTurn(computer3Hand, player2want);
               computer3Hand = removeSpace(computer3Hand);

            //    player2ask = (int)(Math.random()*NUM_PLAYERS) + 1;
            //    player2want = getComputerWant(computer1Hand);
           }
           else{
               System.out.println("Go Fish!");
               computer2done = true;
           }
       }
    }
        }

        if (computer2done = true){
            computer2Hand += getCard() + " ";}

       playerHand = removeZeros(playerHand);
       playerHand = removeSpace(playerHand);
       playerscore = playerscore + checkPairs(playerHand);
       playerHand = removePairs(playerHand);
       playerHand = removeSpace(playerHand);
       playerHand = numCards(playerHand);
       playerscore = playerscore + checkPairs(playerHand);
       playerHand = removePairs(playerHand);
       playerHand = removeSpace(playerHand);
       playerHand = add0(playerHand);

       System.out.println("Player Hand: " + playerHand);
       System.out.println("Score: " + playerscore);

       computer1Hand = removeZeros(computer1Hand);
       computer1Hand = removeSpace(computer1Hand);
       computer1score = computer1score + checkPairs(computer1Hand);
       computer1Hand = removePairs(computer1Hand);
       computer1Hand = removeSpace(computer1Hand);
       computer1Hand = numCards(computer1Hand);
       computer1score = computer1score + checkPairs(computer1Hand);
       computer1Hand = removePairs(computer1Hand);
       computer1Hand = removeSpace(computer1Hand);

       System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
       System.out.println("Score: " + computer1score);

       computer2Hand = removeZeros(computer2Hand);
       computer2Hand = removeSpace(computer2Hand);
       computer2score = computer2score + checkPairs(computer2Hand);
       computer2Hand = removePairs(computer2Hand);
       computer2Hand = removeSpace(computer2Hand);
       computer2Hand = numCards(computer2Hand);
       computer2score = computer2score + checkPairs(computer2Hand);
       computer2Hand = removePairs(computer2Hand);
       computer2Hand = removeSpace(computer2Hand);

       System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
       System.out.println("Score: " + computer2score);

       computer3Hand = removeZeros(computer3Hand);
       computer3Hand = removeSpace(computer3Hand);
       computer3score = computer3score + checkPairs(computer3Hand);
       computer3Hand = removePairs(computer3Hand);
       computer3Hand = removeSpace(computer3Hand);
       computer3Hand = numCards(computer3Hand);
       computer3score = computer3score + checkPairs(computer3Hand);
       computer3Hand = removePairs(computer3Hand);
       computer3Hand = removeSpace(computer3Hand);

       System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
       System.out.println("Score: " + computer3score);

       if (playerscore == 10){
        System.out.println("Player wins!");
        isdone = false;
        }

        else if (computer1score == 10){
        System.out.println("Computer 1 Wins!");
        isdone = false;
    }
    else if (computer2score == 10){
        System.out.println("Computer 2 Wins!");
        isdone = false;
    }

    else if (computer3score == 10){
        System.out.println("Computer 3 Wins!");
        isdone = false;
    } 

       boolean computer3done = false;

    while(!computer3done){
        playerHand = removeZeros(playerHand);
        playerHand = removeSpace(playerHand);
                computer1Hand = removeSpace(computer1Hand);
                computer2Hand = removeSpace(computer2Hand);
                computer3Hand = removeSpace(computer3Hand);

           int player3ask = (int)(Math.random()*NUM_PLAYERS) + 1;
           String player3want = getComputerWant(computer3Hand);
           player3want = removeZeros(player3want);

          if(player3ask == 1){
              playerHand = removeZeros(playerHand);
              boolean HaveCard = CheckCardTurn(playerHand, player3want);

              if(HaveCard){
                  computer3Hand = removePairsTurn(computer3Hand, player3want);
                  computer3Hand = removeSpace(computer3Hand);
                  computer3score++;

                  playerHand = removePairsTurn(playerHand, player3want);
                  playerHand = removeSpace(playerHand);

                //   player3ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                //   player3want = getComputerWant(computer3Hand);
              }

              else{
                  System.out.println("Go Fish!");
                  computer3done = true;
              }
          }

          else if(player3ask == 2){
              boolean HaveCard = CheckCardTurn(computer1Hand, player3want);

              if(HaveCard){
                  computer3Hand = removePairsTurn(computer3Hand, player3want);
                  computer3Hand = removeSpace(computer3Hand);
                  computer3score++;

                  computer1Hand = removePairsTurn(computer1Hand, player3want);
                  computer1Hand = removeSpace(computer1Hand);

                //   player3ask = (int)(Math.random()*NUM_PLAYERS) + 1;
                //   player3want = getComputerWant(computer3Hand);
              }

              else{
                  System.out.println("Go Fish!");
                  computer3done = true;
              }
      }

      else {
          boolean HaveCard = CheckCardTurn(computer2Hand, player3want);

          if(HaveCard){
              computer3Hand = removePairsTurn(computer3Hand, player3want);
              computer3Hand = removeSpace(computer3Hand);
              computer3score++;

              computer2Hand = removePairsTurn(computer2Hand, player3want);
              computer2Hand = removeSpace(computer2Hand);

            //   player3ask = (int)(Math.random()*NUM_PLAYERS) + 1;
            //   player3want = getComputerWant(computer3Hand);
          }

          else{
              System.out.println("Go Fish!");
              computer3done = true;
          }
       }
    }

      if (computer3done = true){
          computer3Hand += getCard() + " ";
      }
      playerHand = removeZeros(playerHand);
      playerHand = removeSpace(playerHand);
      playerscore = playerscore + checkPairs(playerHand);
      playerHand = removePairs(playerHand);
      playerHand = removeSpace(playerHand);
      playerHand = numCards(playerHand);
      playerscore = playerscore + checkPairs(playerHand);
      playerHand = removePairs(playerHand);
      playerHand = removeSpace(playerHand);
      playerHand = add0(playerHand);

      System.out.println(" ");
      System.out.println("Player Hand: " + playerHand);
      System.out.println("Score: " + playerscore);

      computer1Hand = removeZeros(computer1Hand);
      computer1Hand = removeSpace(computer1Hand);
      computer1score = computer1score + checkPairs(computer1Hand);
      computer1Hand = removePairs(computer1Hand);
      computer1Hand = removeSpace(computer1Hand);
      computer1Hand = numCards(computer1Hand);
      computer1score = computer1score + checkPairs(computer1Hand);
      computer1Hand = removePairs(computer1Hand);
      computer1Hand = removeSpace(computer1Hand);

      System.out.println("Computer1 Hand: " + displayHand(computer1Hand));
      System.out.println("Score: " + computer1score);

      computer2Hand = removeZeros(computer2Hand);
      computer2Hand = removeSpace(computer2Hand);
      computer2score = computer2score + checkPairs(computer2Hand);
      computer2Hand = removePairs(computer2Hand);
      computer2Hand = removeSpace(computer2Hand);
      computer2Hand = numCards(computer2Hand);
      computer2score = computer2score + checkPairs(computer2Hand);
      computer2Hand = removePairs(computer2Hand);
      computer2Hand = removeSpace(computer2Hand);

      System.out.println("Computer2 Hand: " + displayHand(computer2Hand));
      System.out.println("Score: " + computer2score);

      computer3Hand = removeZeros(computer3Hand);
      computer3Hand = removeSpace(computer3Hand);
      computer3score = computer3score + checkPairs(computer3Hand);
      computer3Hand = removePairs(computer3Hand);
      computer3Hand = removeSpace(computer3Hand);
      computer3Hand = numCards(computer3Hand);
      computer3score = computer3score + checkPairs(computer3Hand);
      computer3Hand = removePairs(computer3Hand);
      computer3Hand = removeSpace(computer3Hand);

      System.out.println("Computer3 Hand: " + displayHand(computer3Hand));
      System.out.println("Score: " + computer3score);
      System.out.println(" ");

       isdone = playAgain(in);
        if (!isdone){
        playerHand = "";

        computer1Hand = "";

        computer2Hand = "";

        computer3Hand = "";
        

        for (int i = 0; i < 5; i++) {
            playerHand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer1Hand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer2Hand += getCard() + " ";       
        }

        for (int i = 0; i < 5; i++) {
            computer3Hand += getCard() + " ";       
        }

        playerscore = 0;
        computer1score = 0;
        computer2score = 0;
        computer3score = 0; 
        }
    }
}

        private static String displayHand(String Hand) {
        String result = "";

        for (int i = 0; i < Hand.length(); i++) {
            String spaces = " ";

            if(!((Hand.substring(i, i+1)).equals(spaces))){
                result += "X";
            }

            else{
                result += Hand.substring(i, i+1);
            }
        }
        return result;
    }

        public static String add0(String Cards){
            String result = "";

            for (int i = 0; i < Cards.length(); i++) {
                if(Cards.substring(i, i+1).equals("1"))
                    result += Cards.substring(i, i+1) + "0";

                else
                    result += Cards.substring(i, i+1);
            }

            return result;
        }

        public static String getCard() {
            return getFace() + getSuit();
        }

        public static String getFace(){
            int x = (int) (Math.random() * NUM_FACES) + 1;

            if(x <= 9)
                return "" + x;

            else if (x == 11)
                return "J";

            else if (x == 12)
                return "Q";

            else if (x == 13)
                return "K";

            else
                return "A";
        }


        public static String getSuit() {
            int x = (int) (Math.random() * NUM_SUITS);

            if(x == 0)
                return "S";

            else if(x == 1)
                return "D";

            else if (x == 2)
                return "H";

            else
                return "C";
        }    

        public static String removePairs(String Hand){         
            for (int i = 0; i < Hand.length()-1; i+=3) {
                String num = Hand.charAt(i) + "";
                String b = Hand.substring(Hand.indexOf(num) + 2);

                if(b.contains(num)){     
                    Hand = Hand.substring(0, i) + b.substring(0, b.indexOf(num)) + b.substring(b.indexOf(num)+2);
                    i = RESET_CARDS;
                }
                }
                return Hand;
            }

        public static String removeSpace(String Hand){ 
            if ((Hand.substring(0,1)).equals(" ")){
                Hand = Hand.substring(1);
            }

            for (int j = 0; j < Hand.length()-1; j++) {
                if (Hand.length()-j >= 3){
                    if ((Hand.substring(j, j+1)).equals(" ") && (Hand.substring(j+1, j+2)).equals(" ") && (Hand.substring(j+2, j+3)).equals(" ")){
                    Hand = Hand.substring(0, j) + Hand.substring(j+2);
                }
            }
                else if (Hand.length()-j == 2){
                    if ((Hand.substring(j, j+1)).equals(" ") && (Hand.substring(j+1, j+2)).equals(" ")){
                        Hand = Hand.substring(0, j) + Hand.substring(j+1);
                    }
            }
        }
            return Hand;
        }

        public static int checkPairs(String Hand) {
            int score = 0;
            
            for (int i = 0; i < Hand.length()-1; i+=3) {
                String num = Hand.charAt(i) + "";
                String b = Hand.substring(Hand.indexOf(num) + 2);

                if (b.contains(num)){
                    // matches++;
                    // if(matches%2 == 0){
                    //     score++;
                    // }
                    score++;
                    if(Hand.length() >= 9 && (Hand.length()-1) - i+2 >= 3){
                        Hand = Hand.substring(0, i) + b.substring(0, b.indexOf(num)) + b.substring(b.indexOf(num)+2);
                        i = RESET_CARDS;
                    }
                    else if ((Hand.length() - i)/3 < 1) {
                        Hand = Hand.substring(0,i);
                    }
                    else{
                        Hand = Hand.substring(i+2);
                    }
            }
            }
            return score;
        }

        public static String numCards(String Hand){
            int num = Hand.length()/3;

            if(num < 1){
                for (int i = 0; i < 5; i++) {
                    Hand += getCard() + " ";       
                }
            }

            return Hand;
        }

        public static int getPlayerAsk(Scanner in){
            boolean isValidInput = false;

            while(!isValidInput){
                System.out.println("Who would you like to ask? Please enter the computer number in the following format (ex. for computer1, type 1): ");
                String y = in.nextLine();
                int x = Integer.parseInt(y);

                if(y.length() > 1){
                    isValidInput = false;
                }

                else if(x == 1 || x == 2 || x == 3){
                    return x;
                }

            }

            return 0;
                                    
        }

        public static String getPlayerWant(Scanner in){
            boolean isValidInput = false;

            while(!isValidInput){
                System.out.println("What card are you asking for? Please enter the card in the following format (enter card digit, and then suit in CAPITAL LETTERS ex. for Ace of Hearts , type AH): "); 
                String x = in.nextLine();
                x = x.toUpperCase();

                String digit = "";
                String suit = "";

                if(x.length() == 3){
                    digit = x.substring(0,2);
                    suit = x.substring(2);
                }

                else{
                    digit = x.substring(0,1);
                    suit = x.substring(1);
                }

                digit = digit.toUpperCase();
                suit = suit.toUpperCase();

                if("2345678910JKQA".indexOf(digit) != -1 && "HCSD".indexOf(suit) != -1){
                    if(digit.length()>1 && digit.equals("10")){
                        return x + " ";
                    }
                    
                    else if(x.length() == 2){
                    return x + " ";
                    }
                }
            }
            return "";
        }

        public static boolean CheckCardTurn(String Hand, String playerwant) {
            boolean HasCard = false;

            String num = playerwant.substring(0,1);
            
            for (int i = 0; i < Hand.length()-1; i+=3) {
            if(Hand.contains(num)){
                    HasCard = true;
                }
            }
            return HasCard;
        }
        
        
        private static String removePairsTurn(String Hand, String playerwant) {
            String num = playerwant.substring(0,1);
            int matches = 0;
                
            for (int i = 0; i < Hand.length()-1; i+=3) {
            if(num.equals(Hand.substring(i, i+1))){
                matches++;
            }
            }
                if(matches%2 == 1){
                    Hand = Hand.substring(0, Hand.indexOf(num)) + Hand.substring(Hand.indexOf(num)+2);
                }

                if(matches%2 == 0){
                    Hand = Hand.substring(0, Hand.indexOf(num)) + Hand.substring(Hand.indexOf(num)+2);
                }
            return Hand;
            
        }


        private static String removeZeros(String Hand) {
            String result = "";

            for (int i = 0; i < Hand.length(); i++) {
                if(!(Hand.substring(i, i+1).equals("0")))
                    result += Hand.substring(i, i+1);
            }

            return result;
        }

        private static String getComputerWant(String Hand) {
            int num = Hand.length()/3;
            int option = (int) (Math.random()*num) + 1;

            String result = Hand.substring (option-1, option+2);

            return result;
        }

        private static boolean playAgain(Scanner in) {      
            
            System.out.print("Play Again? (Y/N): ");
            boolean isValidInput = false;
                    
            while (!isValidInput) {
                String temp = in.nextLine().toLowerCase();
                    if (temp.equals("yes") || temp.equals("y"))
                        return false;
                    else if (temp.equals("no") || temp.equals("n"))
                        return true;
                    else
                        System.out.print("Play Again? (Y/N): ");
            }
            return false;
        } 

    }











