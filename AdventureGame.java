/**************************************************************
Choose your own Adventure:
   -	Have at least 10 unique choices for the user to make
   -	Have at least 3 endings (not including immediate deaths)
   -	Have at least 2 flags that add variation to the ending.
       -	Did they find the treasure? If so, are now rich. 
**************************************************************/


import java.util.Scanner;

public class AdventureGame
{
	public static void main( String args[] )
	{
      Scanner input = new Scanner(System.in);
      //flags
      boolean foundTreasure = false;
      boolean tookInjury = false;
      boolean foundCompanion = false;
      int money = 0;
      
      //beginning
		System.out.println("This is a game where your choices will decide your fate, so choose carefully.");
      System.out.println("                      ,---------------------------,              ");
      System.out.println("                     |  /---------------------\\  |               ");
      System.out.println("                     | |                       | |               ");
      System.out.println("                     | |      WELCOME  TO      | |               ");
      System.out.println("                     | |          THE          | |               ");
      System.out.println("                     | |       MAZE GAME       | |               ");
      System.out.println("                     | |                       | |               ");  
      System.out.println("                     |  \\_____________________/  |               ");
      System.out.println("                     |___________________________|               ");
      System.out.println("                   ,---\\_____     []     _______/------,         ");
      System.out.println("                 /         /______________\\           /|         ");
      System.out.println("               /___________________________________ /  | ___     ");
      System.out.println("               |                                   |   |    )    ");
      System.out.println("               |  _ _ _  By: Rachel Le  [-------]  |   |   (     ");
      System.out.println("               |  o o o                 [-------]  |  /    _)_   ");
      System.out.println("               |__________________________________ |/     /  /   ");
      System.out.println("           /-------------------------------------/|      ( )/    ");
      System.out.println("         /-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /               ");
      System.out.println("       /-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /                 ");
      System.out.println("       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                   ");
      System.out.println("Will you continue? (Input the number that corresponds with your answer.)");
      System.out.println("   1: Yes");
      System.out.println("   2: No");
      String choice = " " + input.nextLine() + " ";
      
      while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
      {
         checkInput(choice, money,2);
         choice = " " + input.nextLine() + " ";
      }
      
      if(choice.contains(" 1 "))
      {
         System.out.println("It's not like you had any other choice. Your journey starts now...");
      }
      else 
      {
         System.out.println("Haha, you have no choice, your journey starts now...");
      }
      
      System.out.println("    1: Continue");
      choice = " " + input.nextLine() + " ";
      
      while (!choice.contains(" 1 "))
      {
         checkInput(choice, money, 1);
         choice = " " + input.nextLine() + " ";
      }  
      
      System.out.println("You are at the entrance to a maze. Your goal is to find the treasure inside and make it out alive.");
      System.out.println("                                         ______________");
      System.out.println("                       __,.,---'''''              '''''---..._");
      System.out.println("                    ,-'             .....:::''::.:            '`-.");
      System.out.println("                   '           ...:::.....       '");
      System.out.println("                               ''':::'''''       .               ,");
      System.out.println("                   |'-.._           ''''':::..::':          __,,-");
      System.out.println("                    '-.._''`---.....______________.....---''__,,-");
      System.out.println("                         ''`---.....______________.....---''");
      System.out.println();
      System.out.println("You will automatically earn coins along your way through, and defeating bosses will earn you loot!");
      System.out.println("Remember to choose your decisions wisely, however, as being rich but dead isn't the best combination.");
      System.out.println("(You can check your balance along the way by inputing the word \"wallet\" into the console.)");
      System.out.println("    1: Continue");
      choice = " " + input.nextLine() + " ";
      //enter maze
      
      while (!choice.contains(" 1 "))
      {
         checkInput(choice, money, 1);
         choice = " " + input.nextLine() + " ";
      }  
      //**********1st choice***********
      System.out.println("You enter the maze and are immediately met with two options.");
      System.out.println("Will you choose to go left or right?");
      System.out.println("    1: Left");
      System.out.println("    2: Right");
      choice = " " + input.nextLine() + " ";
      
      //left or right
      while (!choice.contains(" 1 ") && !choice.contains( " 2 "))
      {
         checkInput(choice, money,2);
         choice = " " + input.nextLine() + " ";
      }  
      //right == death
      if (choice.contains(" 2 "))
      {
         //bro's ded
         deathImage();
         System.out.println("You turn right and fall down into a pitch black hole. Great job, you died right away.");
         System.out.println("Rerun the program to give it another shot. REMEMBER TO GO LEFT NEXT TIME!!!");
      }
      //left
      else if (choice.contains(" 1 "))
      {
         //three way intersection
         money = addMoney(money);
         System.out.println("You turn left and meet with a 3 way intersection this time.");
         System.out.println("    1: Continue");
         choice = " " + input.nextLine() + " ";
         
         while (!choice.contains(" 1 "))
         {
            checkInput(choice, money,1);
            choice = " " + input.nextLine() + " ";
         }
         
         //**********2nd choice**********
         
         //choose 3 ways
         System.out.println("Which way will you go?");
         System.out.println("    1: Left");
         System.out.println("    2: Forward");
         System.out.println("    3: Right");
         choice = " " + input.nextLine() + " ";
            
         while (!choice.contains(" 1 ") && !choice.contains(" 2 ") && !choice.contains(" 3 "))
         {
            checkInput(choice, money,3);
            choice = " " + input.nextLine() + " ";
         }
         
         if (choice.contains(" 1 "))
         {
           //left == ded end
           money = addMoney(money);
           System.out.println("You turn left and reach a dead end.");
           System.out.println("You turn around and go back to where you were.");
           System.out.println("    1: Continue");
           choice = " " + input.nextLine() + " ";
           //choose again
           
           while (!choice.contains(" 1 "))
           {
              checkInput(choice, money,1);
              choice = " " + input.nextLine() + " ";
           }
         
           if (choice.contains( "1 "))
           {
              //********** 2nd Choice Again **********
              System.out.println("Now which way will you go?");
              System.out.println("    1: Forward");
              System.out.println("    2: Right");
              choice = " " + input.nextLine() + " ";
               
              while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
              {
                 checkInput(choice, money,2);
                 choice = " " + input.nextLine() + " ";
              }
            
              // forward == dragon from sleeping beauty
               if (choice.contains(" 1 "))
               {
                  money = addMoney(money);
                  System.out.println("You continue forward and find a boss in your way.");
                  System.out.println("A towering, black dragon huffs green flames from its"); 
                  System.out.println("nostrils as it stands in the way of 3 passages.");
                  dragon();
                  System.out.println("     1: Continue");
                  choice = " " + input.nextLine() + " ";

                  while (!choice.contains(" 1 "))
                  {
                     checkInput(choice, money,1);
                     choice = " " + input.nextLine() + " ";
                  } 
                  // ********** 3rd choice **********
                  System.out.println("You now have 3 choices. Will you attempt to defeat the Dragon and go forward,"); 
                  System.out.println("flee to the passage on the left, or flee to the other passage on the right?");
                  System.out.println("     1: Fight");
                  System.out.println("     2: Flee Left");
                  System.out.println("     3: Flee Right");
                  choice = " " + input.nextLine() + " ";
              
                  while (!choice.contains(" 1 ") && !choice.contains(" 2 ") && !choice.contains(" 3 "))
                  {
                     checkInput(choice, money,3);
                     choice = " " + input.nextLine() + " ";
                  }
                  //fight == take damage but win
                  if (choice.contains(" 1 "))
                  {
                     money = addMoney(money);
                     tookInjury = true;
                     System.out.println("You fight the dragon with all your might, a sword suddenly");
                     System.out.println("spawning in the area which you utilized to eventually win");
                     System.out.println("and earn 100 coins!");
                     System.out.println("         />_________________________________");
                     System.out.println("[########[]_________________________________>");
                     System.out.println("         \\>");
                     System.out.println("Although you sustain a few injuries, you move forward.");
                     money += 100;
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                  
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money,1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     money = addMoney(money);
                     System.out.println("You continue limping down the passage for what seems like forever,");
                     System.out.println("until you hear a deep growl and stop in your tracks.");
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     System.out.println("You turn and see an aggressive dog slowing approaching you.");
                     dog();
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //********** 4th Choice **********
                     System.out.println("What will you do?");
                     System.out.println("    1: Run");
                     System.out.println("    2: Avoid eye contact and stay still");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                     {
                        checkInput(choice, money, 2);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //run == die
                     if (choice.contains(" 1 "))
                     {
                        System.out.println("You try to run but the dog chases after you and due to your injury,");
                        System.out.println("the dog easily catches up to you and kills you.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //########## 1st Ending ##########
                        deathStats(foundTreasure, money);
                     }
                     //still == new companion
                     else if (choice.contains(" 2 "))
                     {
                        money = addMoney(money);
                        System.out.println("You remain calm and lower your eyes and knees to the floor.");
                        System.out.println("The dog stops growling and starts sniffing you.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }  
                        
                        System.out.println("The dog sits and starts wagging its tail.");
                        System.out.println("Congragulations, you've acquired a new companion");
                        System.out.println("to accompany you on your journey!");
                        foundCompanion = true;
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("You both continue down the passage until you reach a dead end.");
                        System.out.println("You turn back around to where you were with the boss.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //********** 3rd Choice Again **********
                        System.out.println("Now which way will you go?");
                        System.out.println("    1: Left");
                        System.out.println("    2: Right");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //left == new boss lion
                        if (choice.contains(" 1 "))
                        {
                           money = addMoney(money);
                           System.out.println("You turn to the left and meet a new boss.");
                           System.out.println("A frightening lions blocks your escape.");
                           lion();
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //********** 5th Choice **********
                           System.out.println("What will you do now?");
                           System.out.println("    1: Fight");
                           System.out.println("    2: Try to Move Pass");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                           {
                              checkInput(choice, money, 2);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //fight == die
                           if (choice.contains(" 1 "))
                           {
                              //companion die but you live
                              if (foundCompanion)
                              {
                                 System.out.println("You and your companion fight the lion, and in the end,");
                                 System.out.println("you were the only one who made it out alive, with many wounds however.");
                                 foundCompanion = false;
                                 money += 100;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You trudge you way down the passage to escape.");
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You almost made it out, but you took too many injuries and die before escaping.");
                                 
                                 //########### 2nd Ending ##########
                                 deathStats(foundTreasure, money);
                                                                  
                              } 
                              //you die
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to fight the lion, but you took too many injuries and fail.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 3rd Ending ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           //move pass == companion die
                           else if (choice.contains(" 2 "))
                           {
                              if (foundCompanion)
                              {
                                 money = addMoney(money);
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("Your companion sacrifices himself and saves you, and you run to escape.");
                                 foundCompanion = false;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }    
                                                   
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########### 4th Ending ##########
                                 winStats(foundTreasure, tookInjury, foundCompanion, money);
                                                                   
                              }
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 5th Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           
                           
                        }
                        //right == die
                        else if (choice.contains(" 2 "))
                        {
                           System.out.println("You turn to the right and encounter MANY barels with radioactive waste.");
                           radioactive();
                           System.out.println("You die almost instantly.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########## 6th Ending ##########
                           deathStats(foundTreasure, money);
                              
                         }
                     }
                  }
                  //flee left == new boss lion
                  else if (choice.contains(" 2 "))
                  {
                           money = addMoney(money);
                           System.out.println("You flee to the left and meet a new boss.");
                           System.out.println("A frightening lions blocks your escape.");
                           lion();
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //********** 5th Choice again **********
                           System.out.println("What will you do now?");
                           System.out.println("    1: Fight");
                           System.out.println("    2: Try to Move Pass");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                           {
                              checkInput(choice, money, 2);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //fight == die
                           if (choice.contains(" 1 "))
                           {
                              //companion die but you live
                              if (foundCompanion)
                              {
                                 System.out.println("You and your companion fight the lion, and in the end,");
                                 System.out.println("you were the only one who made it out alive, with many wounds however.");
                                 foundCompanion = false;
                                 money += 100;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You trudge you way down the passage to escape.");
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You almost made it out, but you took too many injuries and die before escaping.");
                                 
                                 //########### 2nd Ending again ##########
                                 deathStats(foundTreasure, money);
                                                                  
                              } 
                              //you die
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to fight the lion, but you took too many injuries and fail.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 3rd Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           //move pass == companion die
                           else if (choice.contains(" 2 "))
                           {
                              if (foundCompanion)
                              {
                                 money = addMoney(money);
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("Your companion sacrifices himself and saves you, and you run to escape.");
                                 foundCompanion = false;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }    
                                                   
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########### 4th Ending again ##########
                                 winStats(foundTreasure, tookInjury, foundCompanion, money);
                                                                   
                              }
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 5th Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }

                        }
                  
             
                  //flee right == die
                  else if (choice.contains(" 3 "))
                  {
                     System.out.println("You flee to the right and encounter MANY barels with radioactive waste.");
                     radioactive();
                     System.out.println("You die almost instantly.");
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //########## 6th Ending again ##########
                     deathStats(foundTreasure, money);
                     
                  }
                }
               
             
               //right == another 2 way
               else if (choice.contains(" 2 "))
               {
                  money = addMoney(money);
                  System.out.println("You turn right and have two options again.");
                  System.out.println("There is visible light from the left, and you can smell smoke from the right.");
                  System.out.println("    1: Continue");
                  choice = " " + input.nextLine() + " ";
                  
                  while (!choice.contains(" 1 "))
                  {
                     checkInput(choice, money,1);
                     choice = " " + input.nextLine() + " ";
                  } 
                  
                  //********** 6th Choice **********
                  System.out.println("Which way will you go?");
                  System.out.println("    1: Left");
                  System.out.println("    2: Right");
                  choice = " " + input.nextLine() + " ";
                  
                  while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                  {
                     checkInput(choice, money,2);
                     choice = " " + input.nextLine() + " ";
                  }
                  
                  //left == bomb DIE
                  //########## 7th Ending ##########
                  if (choice.contains(" 1 "))
                  {
                     money = addMoney(money);
                     System.out.println("You turn left and a bomb EXPLODES!!!");
                     bomb();
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice,money,1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     deathStats(foundTreasure, money);
                  }
                  //right == boss (caterpillar from Alice in the Wonderland)
                  else if (choice.contains(" 2 "))
                  {
                     money = addMoney(money);
                     System.out.println("You turn right and find a large caterpillar"); 
                     System.out.println("on a mushroom smoking from a pipe.");
                     caterpillar();
                     System.out.println("\"Choose one to eat,\" he said, gesturing towards");
                     System.out.println("the two small pieces of mushroom in front of him.");
                     mushroom();
                     //******** 7th Choice***********
                     System.out.println("Which will you choose?");
                     System.out.println("    1: Left Piece");
                     System.out.println("    2: Right Piece");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                     {
                        checkInput(choice, money,2);
                        choice = " " + input.nextLine() + " ";
                     }
                     //left piece == shrink
                     if (choice.contains(" 1 "))
                     {
                        money = addMoney(money);
                        System.out.println("You choose the left piece and take a bite of it.");
                        System.out.println("The walls and ceiling grow taller as you shrink down to the floor.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }

                        System.out.println("The ground shakes as a giant rat runs towards you.");
                        rat();
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        System.out.println("You try to run but your small legs couldn't get you far, and ");
                        System.out.println("the rat EATS YOU!!!");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while(!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        //######### 8th Ending ##########
                        deathImage();
                        deathStats(foundTreasure,money);
                        
                     }
                     //right piece == grow
                     else if (choice.contains(" 2 "))
                     {
                        money = addMoney(money);
                        System.out.println("You choose the right piece and take a bite of it.");
                        System.out.println("The walls close in on you as you grow so big that you can barely move through");
                        System.out.println("the passage and you have to crouch down to avoid bumping your now big head.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("You slowly continue crawling forward on all fours, until you reach the next boss in your way.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("A giant tarantula with its sticky web blocks your way of escape.");
                        tarantula();
                        System.out.println("    1:Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //********** 8th Choice **********
                        System.out.println("What will you do?");
                        System.out.println("    1: Fight");
                        System.out.println("    2: Try to Move Pass");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                        {
                           checkInput(choice,money,2);
                           choice = " " + input.nextLine() + " ";
                        }
                        //fight == win and escape
                        if (choice.contains(" 1 "))
                        {
                           money += 100;
                           System.out.println("You fight and easily defeat the tarantula due to your gigantic size.");
                           System.out.println("You continue forward with 100 more coins now in your wallet.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           money = addMoney(money);
                           System.out.println("After what feels like hours of crawling, you escape the maze as a new, bigger human!");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########### 9th Ending ###########
                           winStats(foundTreasure, tookInjury, foundCompanion, money);
                           
                        }
                        //move pass == die
                        else if (choice.contains(" 2 "))
                        {
                           System.out.println("You try to move pass the tarantula, only to realize how stupid you are");
                           System.out.println("and that you can't move pass the tarantula due to your now large size.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           System.out.println("The tarantula spits poison on you and you die.");
                           System.out.println("It now has enough food for the rest of its life!");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########## 10th Ending ###########
                           deathStats(foundTreasure, money);
                           
                        }
                        
                     }
                  }
                 }
               }
             }
            
            // forward == dragon from sleeping beauty
            else if (choice.contains(" 2 "))
               {
                  money = addMoney(money);
                  System.out.println("You continue forward and find a boss in your way.");
                  System.out.println("A towering, black dragon huffs green flames from its"); 
                  System.out.println("nostrils as it stands in the way of 3 passages.");
                  dragon();
                  System.out.println("     1: Continue");
                  choice = " " + input.nextLine() + " ";

                  while (!choice.contains(" 1 "))
                  {
                     checkInput(choice, money,1);
                     choice = " " + input.nextLine() + " ";
                  } 
                  // ********** 3rd choice **********
                  System.out.println("You now have 3 choices. Will you attempt to defeat the Dragon and go forward,"); 
                  System.out.println("flee to the passage on the left, or flee to the other passage on the right?");
                  System.out.println("     1: Fight");
                  System.out.println("     2: Flee Left");
                  System.out.println("     3: Flee Right");
                  choice = " " + input.nextLine() + " ";
              
                  while (!choice.contains(" 1 ") && !choice.contains(" 2 ") && !choice.contains(" 3 "))
                  {
                     checkInput(choice, money,3);
                     choice = " " + input.nextLine() + " ";
                  }
                  //fight == take damage but win
                  if (choice.contains(" 1 "))
                  {
                     money = addMoney(money);
                     tookInjury = true;
                     System.out.println("You fight the dragon with all your might, a sword suddenly");
                     System.out.println("spawning in the area which you utilized to eventually win");
                     System.out.println("and earn 100 coins!");
                     System.out.println("         />_________________________________");
                     System.out.println("[########[]_________________________________>");
                     System.out.println("         \\>");
                     System.out.println("Although you sustain a few injuries, you move forward.");
                     money += 100;
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                  
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money,1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     money = addMoney(money);
                     System.out.println("You continue limping down the passage for what seems like forever,");
                     System.out.println("until you hear a deep growl and stop in your tracks.");
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     System.out.println("You turn and see an aggressive dog slowing approaching you.");
                     dog();
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //********** 4th Choice **********
                     System.out.println("What will you do?");
                     System.out.println("    1: Run");
                     System.out.println("    2: Avoid eye contact and stay still");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                     {
                        checkInput(choice, money, 2);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //run == die
                     if (choice.contains(" 1 "))
                     {
                        System.out.println("You try to run but the dog chases after you and due to your injury,");
                        System.out.println("the dog easily catches up to you and kills you.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //########## 1st Ending ##########
                        deathStats(foundTreasure, money);
                     }
                     //still == new companion
                     else if (choice.contains(" 2 "))
                     {
                        money = addMoney(money);
                        System.out.println("You remain calm and lower your eyes and knees to the floor.");
                        System.out.println("The dog stops growling and starts sniffing you.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }  
                        
                        System.out.println("The dog sits and starts wagging its tail.");
                        System.out.println("Congragulations, you've acquired a new companion");
                        System.out.println("to accompany you on your journey!");
                        foundCompanion = true;
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice, money, 1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("You both continue down the passage until you reach a dead end.");
                        System.out.println("You turn back around to where you were with the boss.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //********** 3rd Choice Again **********
                        System.out.println("Now which way will you go?");
                        System.out.println("    1: Left");
                        System.out.println("    2: Right");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                        {
                           checkInput(choice, money, 2);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //left == new boss lion
                        if (choice.contains(" 1 "))
                        {
                           money = addMoney(money);
                           System.out.println("You turn to the left and meet a new boss.");
                           System.out.println("A frightening lions blocks your escape.");
                           lion();
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //********** 5th Choice **********
                           System.out.println("What will you do now?");
                           System.out.println("    1: Fight");
                           System.out.println("    2: Try to Move Pass");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                           {
                              checkInput(choice, money, 2);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //fight == die
                           if (choice.contains(" 1 "))
                           {
                              //companion die but you live
                              if (foundCompanion)
                              {
                                 System.out.println("You and your companion fight the lion, and in the end,");
                                 System.out.println("you were the only one who made it out alive, with many wounds however.");
                                 foundCompanion = false;
                                 money += 100;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You trudge you way down the passage to escape.");
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You almost made it out, but you took too many injuries and die before escaping.");
                                 
                                 //########### 2nd Ending ##########
                                 deathStats(foundTreasure, money);
                                                                  
                              } 
                              //you die
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to fight the lion, but you took too many injuries and fail.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 3rd Ending ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           //move pass == companion die
                           else if (choice.contains(" 2 "))
                           {
                              if (foundCompanion)
                              {
                                 money = addMoney(money);
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("Your companion sacrifices himself and saves you, and you run to escape.");
                                 foundCompanion = false;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }    
                                                   
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########### 4th Ending ##########
                                 winStats(foundTreasure, tookInjury, foundCompanion, money);
                                                                   
                              }
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 5th Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           
                           
                        }
                        //right == die
                        else if (choice.contains(" 2 "))
                        {
                           System.out.println("You turn to the right and encounter MANY barels with radioactive waste.");
                           radioactive();
                           System.out.println("You die almost instantly.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########## 6th Ending ##########
                           deathStats(foundTreasure, money);
                              
                         }
                     }
                  }
                  //flee left == new boss lion
                  else if (choice.contains(" 2 "))
                  {
                           money = addMoney(money);
                           System.out.println("You flee to the left and meet a new boss.");
                           System.out.println("A frightening lions blocks your escape.");
                           lion();
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice, money, 1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //********** 5th Choice again **********
                           System.out.println("What will you do now?");
                           System.out.println("    1: Fight");
                           System.out.println("    2: Try to Move Pass");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                           {
                              checkInput(choice, money, 2);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //fight == die
                           if (choice.contains(" 1 "))
                           {
                              //companion die but you live
                              if (foundCompanion)
                              {
                                 System.out.println("You and your companion fight the lion, and in the end,");
                                 System.out.println("you were the only one who made it out alive, with many wounds however.");
                                 foundCompanion = false;
                                 money += 100;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You trudge you way down the passage to escape.");
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 System.out.println("You almost made it out, but you took too many injuries and die before escaping.");
                                 
                                 //########### 2nd Ending again ##########
                                 deathStats(foundTreasure, money);
                                                                  
                              } 
                              //you die
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to fight the lion, but you took too many injuries and fail.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 3rd Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }
                           //move pass == companion die
                           else if (choice.contains(" 2 "))
                           {
                              if (foundCompanion)
                              {
                                 money = addMoney(money);
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("Your companion sacrifices himself and saves you, and you run to escape.");
                                 foundCompanion = false;
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }    
                                                   
                                 System.out.println("Along the way, a gleam of light catches your eye.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                  while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 money = addMoney(money);
                                 System.out.println("You turn to investigate, only to find the treasure!!!");
                                 treasure();
                                 foundTreasure = true;
                                 System.out.println("You drag it along with you to leave the maze.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########### 4th Ending again ##########
                                 winStats(foundTreasure, tookInjury, foundCompanion, money);
                                                                   
                              }
                              else if (!foundCompanion)
                              {
                                 System.out.println("You try to move pass the lion, but the lion lunges towards you.");
                                 System.out.println("    1: Continue");
                                 choice = " " + input.nextLine() + " ";
                                 
                                 while (!choice.contains(" 1 "))
                                 {
                                    checkInput(choice, money, 1);
                                    choice = " " + input.nextLine() + " ";
                                 }
                                 
                                 //########## 5th Ending again ##########
                                 deathStats(foundTreasure,money);
                                 
                              }
                              
                           }

                        }
                  
             
                  //flee right == die
                  else if (choice.contains(" 3 "))
                  {
                     System.out.println("You flee to the right and encounter MANY barels with radioactive waste.");
                     radioactive();
                     System.out.println("You die almost instantly.");
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice, money, 1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     //########## 6th Ending again ##########
                     deathStats(foundTreasure, money);
                     
                  }
                }

             
            
            //right == another 2 way
            else if (choice.contains(" 3 "))
               {
                  money = addMoney(money);
                  System.out.println("You turn right and have two options again.");
                  System.out.println("There is visible light from the left, and you can smell smoke from the right.");
                  System.out.println("    1: Continue");
                  choice = " " + input.nextLine() + " ";
                  
                  while (!choice.contains(" 1 "))
                  {
                     checkInput(choice, money,1);
                     choice = " " + input.nextLine() + " ";
                  } 
                  
                  //********** 6th Choice **********
                  System.out.println("Which way will you go?");
                  System.out.println("    1: Left");
                  System.out.println("    2: Right");
                  choice = " " + input.nextLine() + " ";
                  
                  while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                  {
                     checkInput(choice, money,2);
                     choice = " " + input.nextLine() + " ";
                  }
                  
                  //left == bomb DIE
                  //########## 7th Ending ##########
                  if (choice.contains(" 1 "))
                  {
                     money = addMoney(money);
                     System.out.println("You turn left and a bomb EXPLODES!!!");
                     bomb();
                     System.out.println("    1: Continue");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 "))
                     {
                        checkInput(choice,money,1);
                        choice = " " + input.nextLine() + " ";
                     }
                     
                     deathStats(foundTreasure, money);
                  }
                  //right == boss (caterpillar from Alice in the Wonderland)
                  else if (choice.contains(" 2 "))
                  {
                     money = addMoney(money);
                     System.out.println("You turn right and find a large caterpillar"); 
                     System.out.println("on a mushroom smoking from a pipe.");
                     caterpillar();
                     System.out.println("\"Choose one to eat,\" he said, gesturing towards");
                     System.out.println("the two small pieces of mushroom in front of him.");
                     mushroom();
                     //******** 7th Choice***********
                     System.out.println("Which will you choose?");
                     System.out.println("    1: Left Piece");
                     System.out.println("    2: Right Piece");
                     choice = " " + input.nextLine() + " ";
                     
                     while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                     {
                        checkInput(choice, money,2);
                        choice = " " + input.nextLine() + " ";
                     }
                     //left piece == shrink
                     if (choice.contains(" 1 "))
                     {
                        money = addMoney(money);
                        System.out.println("You choose the left piece and take a bite of it.");
                        System.out.println("The walls and ceiling grow taller as you shrink down to the floor.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }

                        System.out.println("The ground shakes as a giant rat runs towards you.");
                        rat();
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        System.out.println("You try to run but your small legs couldn't get you far, and ");
                        System.out.println("the rat EATS YOU!!!");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while(!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        //######### 8th Ending ##########
                        deathImage();
                        deathStats(foundTreasure,money);
                        
                     }
                     //right piece == grow
                     else if (choice.contains(" 2 "))
                     {
                        money = addMoney(money);
                        System.out.println("You choose the right piece and take a bite of it.");
                        System.out.println("The walls close in on you as you grow so big that you can barely move through");
                        System.out.println("the passage and you have to crouch down to avoid bumping your now big head.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("You slowly continue crawling forward on all fours, until you reach the next boss in your way.");
                        System.out.println("    1: Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        money = addMoney(money);
                        System.out.println("A giant tarantula with its sticky web blocks your way of escape.");
                        tarantula();
                        System.out.println("    1:Continue");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 "))
                        {
                           checkInput(choice,money,1);
                           choice = " " + input.nextLine() + " ";
                        }
                        
                        //********** 8th Choice **********
                        System.out.println("What will you do?");
                        System.out.println("    1: Fight");
                        System.out.println("    2: Try to Move Pass");
                        choice = " " + input.nextLine() + " ";
                        
                        while (!choice.contains(" 1 ") && !choice.contains(" 2 "))
                        {
                           checkInput(choice,money,2);
                           choice = " " + input.nextLine() + " ";
                        }
                        //fight == win and escape
                        if (choice.contains(" 1 "))
                        {
                           money += 100;
                           System.out.println("You fight and easily defeat the tarantula due to your gigantic size.");
                           System.out.println("You continue forward with 100 more coins now in your wallet.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           money = addMoney(money);
                           System.out.println("After what feels like hours of crawling, you escape the maze as a new, bigger human!");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########### 9th Ending ###########
                           winStats(foundTreasure, tookInjury, foundCompanion, money);
                           
                        }
                        //move pass == die
                        else if (choice.contains(" 2 "))
                        {
                           System.out.println("You try to move pass the tarantula, only to realize how stupid you are");
                           System.out.println("and that you can't move pass the tarantula due to your now large size.");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           System.out.println("The tarantula spits poison on you and you die.");
                           System.out.println("It now has enough food for the rest of its life!");
                           System.out.println("    1: Continue");
                           choice = " " + input.nextLine() + " ";
                           
                           while (!choice.contains(" 1 "))
                           {
                              checkInput(choice,money,1);
                              choice = " " + input.nextLine() + " ";
                           }
                           
                           //########## 10th Ending ###########
                           deathStats(foundTreasure, money);
                           
                        }
                        
                     }
                  }
                 }
          }
      
	}


public static int addMoney(int money)
{
   //int rnd = (int) (Math.random() * (range + 1) + minValue);
   int add = (int) (Math.random() * (25 + 1) + 1);
   return money + add;
}

public static void checkInput(String choice, int money, int numChoices)
{
   if (choice.contains("wallet") || choice.contains("Wallet"))
   {
      System.out.println("Balance = " + money + " coins");
   }
   else if (numChoices == 1)
   {
      System.out.println("Choose 1. You cannot escape your fate.");
   }
   else if (numChoices == 2)
   {
      System.out.println("Choose either 1 or 2. Don't let your indecisiveness bring your downfall.");
   }
   else if (numChoices == 3)
   {
      System.out.println("Choose either 1, 2, or 3. Don't let your indecisiveness bring your downfall.");
   }
   else
   {
      System.out.println("Spell correctly...stupid.");
   }
}

public static void deathStats(boolean foundTreasure, int money)
{
   deathImage();
   if (!foundTreasure)
   {
      System.out.println("You died with " + money + " coins in your wallet and no treasure!");
      System.out.println("Rerun the program to try your luck again!");
   }
   else
   {
      System.out.println("You died with " + money + " coins in your wallet and the treasure!");
      System.out.println("What a waste!!!!");
      System.out.println("Rerun the program to try your luck again!");
   }
}

public static void winStats(boolean foundTreasure, boolean tookInjury, boolean foundCompanion, int money)
{
   trophy();
   System.out.println();
   
   if (tookInjury)
   {
      System.out.print("Although you took some hits, y");
   }
   else 
   {
      System.out.print("Y");
   }

   if (foundTreasure)
   {
      System.out.println("ou escaped the maze with " + money + " coins in your wallet");
      System.out.println("and the treasure!!! Your are now rich!!!");
      treasure2();
      
      if (foundCompanion)
      {
         System.out.println("Along with that, you also found a companion for life!");
         companion();
      }
      System.out.println("CONGRAGULATIONS ON WINNING THE GAME!!!");
   }
   else
   {
      System.out.println("ou escaped the maze with " + money + " coins in your wallet");
      System.out.println("but without the treasure. You failed to reach the goal of the game.");
      
      if (foundCompanion)
      {
         System.out.println("You did, however, find a companion for life!");
         companion();
      }
      System.out.println("Rerun the program to try to find the treasure again!");
   }
   
}

public static void deathImage()
{
   System.out.println("                  _..--\"\"---.");
   System.out.println("                 /           \".");
   System.out.println("                 `            l");
   System.out.println("                 |'._  ,._ l/\"\\");
   System.out.println("                 |  _J<__/.v._/");
   System.out.println("                  \\( ,~._,,,,-)");
   System.out.println("                   `-\\' \\`,,j|");
   System.out.println("                      \\_,____J");
   System.out.println("                 .--.__)--(__.--.");
   System.out.println("                /  `-----..--'. j");
   System.out.println("                '.- '`--` `--' \\\\");
   System.out.println("               //  '`---'`  `-' \\\\");
   System.out.println("              //   '`----'`.-.-' \\\\");
   System.out.println("            _//     `--- -'   \\' | \\________");
   System.out.println("           |  |         ) (      `.__.---- -'\\");
   System.out.println("            \\7          \\`-(               74\\\\\\");
   System.out.println("            ||       _  /`-(               l|//7__");
   System.out.println("            |l    ('  `-)-/_.--.          f''` -.-\"|");
   System.out.println("            |\\     l\\_  `-'    .'         |     |  |");
   System.out.println("            llJ   _ _)J--._.-('           |     |  l");
   System.out.println("            |||( ( '_)_  .l   \". _    ..__I     |  L");
   System.out.println("            ^\\\\\\||`'   \"   '\"-. \" )''`'---'     L.-'`-.._");
   System.out.println("                 \\ |           ) /.              ``'`-.._``-.");
   System.out.println("                 l l          / / |      YOU DIED!       |''|");
   System.out.println("                  \" \\        / /   \"-..__                |  |");
   System.out.println("                  | |       / /          1       ,- t-...J_.'");
   System.out.println("                  | |      / /           |       |  |");
   System.out.println("                  J  \\  /\"  (            l       |  |");
   System.out.println("                  | ().'`-()/            |       |  |");
   System.out.println("                 _.-\"_.____/             l       l.-l");
   System.out.println("             _.-\"_.+\"|                  /        \\.  \\");
   System.out.println("       /\"\\.-\"_.-\"  | |                 /          \\   \\");
   System.out.println("       \\_   \"      | |                1            | `'|");
   System.out.println("         |ll       | |                |            i   |");
   System.out.println("         \\\\\\       |-\\               \\j ..          L,,'. `/");
   System.out.println("        __\\\\\\     ( .-\\           .--'    ``--../..'      '-..");
   System.out.println("          `'''`----`\\\\\\\\ .....--'''");
   System.out.println("              \\\\\\\\                           ");
}

public static void dragon()
{
   System.out.println("      .:'                                  `:.             ");                       
   System.out.println("     ::'                                    `::            ");                        
   System.out.println("    :: :.                                  .: ::           ");                        
   System.out.println("     `:. `:.             .             .:'  .:'            ");                        
   System.out.println("      `::. `::           !           ::' .::'              ");                        
   System.out.println("          `::.`::.    .' ! `.    .::'.::'                  ");                        
   System.out.println("            `:.  `::::'':!:``::::'   ::'                   ");                        
   System.out.println("            :'*:::.  .:' ! `:.  .:::*`:                    ");                        
   System.out.println("           :: HHH::.   ` ! '   .::HHH ::                   ");                        
   System.out.println("          ::: `H TH::.  `!'  .::HT H' :::                  ");                        
   System.out.println("          ::..  `THHH:`:   :':HHHT'  ..::                  ");                        
   System.out.println("          `::      `T: `. .' :T'      ::'                  ");                        
   System.out.println("            `:. .   :         :   . .:'                    ");                        
   System.out.println("              `::'               `::'                      ");                        
   System.out.println("                :'  .`.  .  .'.  `:                        ");                        
   System.out.println("                :' ::.       .:: `:                        ");                        
   System.out.println("                :' `:::     :::' `:                        ");                        
   System.out.println("                 `.  ``     ''  .'                         ");                        
   System.out.println("                  :`...........':                          ");                        
   System.out.println("                  ` :`.     .': '                          ");                        
   System.out.println("                   `:  `\"\"\"` : '  "); 
}

public static void caterpillar()
{
   System.out.println("          o    o");
   System.out.println("           \\__/");
   System.out.println("           /oo\\");
   System.out.println("           \\()/");
   System.out.println("           |~~|");
   System.out.println("           |~~|");
   System.out.println("           |~~|               /\\");
   System.out.println("           \\~~\\              /\\/");
   System.out.println("            \\~~\\____________/\\/");
   System.out.println("             \\/ | | | | | | \\/");
   System.out.println("              ~~~~~~~~~~~~~~~");
}

public static void mushroom()
{
   System.out.println("             __.......__");
   System.out.println("           .\"           \".");
   System.out.println("          :    EAT ME!!!  :");
   System.out.println("          :               :");
   System.out.println("           `.._________..'");
   System.out.println("                :   :");
   System.out.println("                :   :");
   System.out.println("                :   :");
   System.out.println("                `...'");
}

public static void bomb()
{
   System.out.println("                        .               "); 
   System.out.println("                        .               "); 
   System.out.println("                        .       :       "); 
   System.out.println("                        :      .        "); 
   System.out.println("               :..   :  : :  .          "); 
   System.out.println("                  ..  ; :: .            "); 
   System.out.println("                     ... .. :..         "); 
   System.out.println("                    ::: :...            "); 
   System.out.println("                ::.:.:...;; .....       "); 
   System.out.println("             :..     .;.. :;     ..     "); 
   System.out.println("                   . :. .  ;.           "); 
   System.out.println("                    .: ;;: ;.           "); 
   System.out.println("                   :; .BRRRV;           "); 
   System.out.println("                      YB BMMMBR         "); 
   System.out.println("                     ;BVIMMMMMt         "); 
   System.out.println("               .=YRBBBMMMMMMMB          "); 
   System.out.println("             =RMMMMMMMMMMMMMM;          "); 
   System.out.println("           ;BMMR=VMMMMMMMMMMMV.         "); 
   System.out.println("          tMMR::VMMMMMMMMMMMMMB:        "); 
   System.out.println("         tMMt ;BMMMMMMMMMMMMMMMB.       "); 
   System.out.println("        ;MMY ;MMMMMMMMMMMMMMMMMMV       "); 
   System.out.println("        XMB .BMMMMMMMMMMMMMMMMMMM:      "); 
   System.out.println("        BMI +MMMMMMMMMMMMMMMMMMMMi      "); 
   System.out.println("       .MM= XMMMMMMMMMMMMMMMMMMMMY      "); 
   System.out.println("        BMt YMMMMMMMMMMMMMMMMMMMMi      "); 
   System.out.println("        VMB +MMMMMMMMMMMMMMMMMMMM:      "); 
   System.out.println("        ;MM+ BMMMMMMMMMMMMMMMMMMR       "); 
   System.out.println("         tMBVBMMMMMMMMMMMMMMMMMB.       "); 
   System.out.println("          tMMMMMMMMMMMMMMMMMMMB:        "); 
   System.out.println("           ;BMMMMMMMMMMMMMMMMY          "); 
   System.out.println("             +BMMMMMMMMMMMBY:           "); 
   System.out.println("               :+YRBBBRVt;"); 
}

public static void rat()
{
   System.out.println("            _     __,..---\"\"-._                 ';-, ");
   System.out.println("     ,    _/_),-\"`             '-.                `\\\\");
   System.out.println("    \\|.-\"`    -_)                 '.                ||");
   System.out.println("    /`   a   ,                      \\              .'/");
   System.out.println("    '.___,__/                 .-'    \\_        _.-'.'");
   System.out.println("       |\\  \\      \\         /`        _`\"\"\"\"\"\"`_.-'");
   System.out.println("          _/;--._, >        |   --.__/ `\"\"\"\"\"\"`");
   System.out.println("        (((-'  __//`'-......-;\\      )");
   System.out.println("             (((-'       __//  '--. /");
   System.out.println("                       (((-'    __//");
   System.out.println("                              (((-'");
}


public static void tarantula()
{
   System.out.println("           ____                      ,");
   System.out.println("          /---.'.__             ____//");
   System.out.println("               '--.\\           /.---'");
   System.out.println("          _______  \\\\         //");
   System.out.println("        /.------.\\  \\|      .'/  ______");
   System.out.println("       //  ___  \\ \\ ||/|\\  //  _/_----.\\__");
   System.out.println("      |/  /.-.\\  \\ \\:|< >|// _/.'..\\   '--'");
   System.out.println("         //   \\'. | \\'.|.'/ /_/ /  \\\\");
   System.out.println("        //     \\ \\_\\/\" ' ~\\-'.-'    \\\\");
   System.out.println("       //       '-._| :H: |'-.__     \\\\");
   System.out.println("      //           (/'==='\\)'-._\\     ||");
   System.out.println("      ||                        \\\\    \\|");
   System.out.println("      ||                         \\\\    '");
   System.out.println("      |/                          \\\\");
   System.out.println("                                   ||");
   System.out.println("                                   ||");
   System.out.println("                                   \\\\");
   System.out.println("                                    '");
}


public static void trophy()
{
   System.out.println("              _________");
   System.out.println("             |         |");
   System.out.println("            (|   YOU   |)");
   System.out.println("             | ESCAPED |");
   System.out.println("              \\       /");
   System.out.println("               `-----'");
   System.out.println("               _|___|_");
}

public static void treasure()
{
   System.out.println("*******************************************************************************");
   System.out.println("          |                   |                  |                     |");
   System.out.println(" _________|________________.=\"\"_;=.______________|_____________________|_______");
   System.out.println("|                   |  ,-\"_,=\"\"     `\"=.|                  |");
   System.out.println("|___________________|__\"=._o`\"-._        `\"=.______________|___________________");
   System.out.println("          |                `\"=._o`\"=._      _`\"=._                     |");
   System.out.println(" _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______");
   System.out.println("|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |");
   System.out.println("|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________");
   System.out.println("          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |");
   System.out.println(" _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______");
   System.out.println("|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |");
   System.out.println("|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________");
   System.out.println("____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____");
   System.out.println("/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_");
   System.out.println("____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____");
   System.out.println("/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_");
   System.out.println("____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____");
   System.out.println("/______/______/______/______/______/______/______/______/______/______/______/_");
   System.out.println("*******************************************************************************");
}

public static void treasure2()
{
   System.out.println("                            _.--.");
   System.out.println("                        _.-'_:-'||");
   System.out.println("                    _.-'_.-::::'||");
   System.out.println("               _.-:'_.-::::::'  ||");
   System.out.println("             .'`-.-:::::::'     ||");
   System.out.println("            /.'`;|:::::::'      ||_");
   System.out.println("           ||   ||::::::'     _.;._'-._");
   System.out.println("           ||   ||:::::'  _.-!oo @.!-._'-.");
   System.out.println("           \\'.  ||:::::.-!()oo @!()@.-'_.|");
   System.out.println("            '.'-;|:.-'.&$@.& ()$%-'o.'\\U||");
   System.out.println("              `>'-.!@%()@'@_%-'_.-o _.|'||");
   System.out.println("               ||-._'-.@.-'_.-' _.-o  |'||");
   System.out.println("               ||=[ '-._.-\\U/.-'    o |'||");
   System.out.println("               || '-.]=|| |'|      o  |'||");
   System.out.println("               ||      || |'|        _| ';");
   System.out.println("               ||      || |'|    _.-'_.-'");
   System.out.println("               |'-._   || |'|_.-'_.-'");
   System.out.println("                '-._'-.|| |' `_.-'");
   System.out.println("                    '-.||_/.-'");
   System.out.println();
}

public static void companion()
{
   System.out.println("            |\\_/|                  ");
   System.out.println("            | @ @   Woof! ");
   System.out.println("            |   <>              _  ");
   System.out.println("            |  _/\\------____ ((| |))");
   System.out.println("            |               `--' |  "); 
   System.out.println("        ____|_       ___|   |___.' ");
   System.out.println("       /_/_____/____/_______|");
}


public static void radioactive()
{
   System.out.println("                             __    _               ");                    
   System.out.println("                        _wr\"\"        \"-q__         ");                    
   System.out.println("                     _dP                 9m_     ");
   System.out.println("                   _#P                     9#_     ");                    
   System.out.println("                  d#@                       9#m    ");                    
   System.out.println("                 d##                         ###   ");                    
   System.out.println("                J###                         ###L  ");                    
   System.out.println("                {###K                       J###K  ");                    
   System.out.println("                ]####K      ___aaa___      J####F  ");                    
   System.out.println("            __gmM######_  w#P\"\"   \"\"9#m  _d#####Mmw__ ");                 
   System.out.println("         _g##############mZ_         __g##############m_ ");              
   System.out.println("       _d####M@PPPP@@M#######Mmp gm#########@@PPP9@M####m_");             
   System.out.println("      a###\"\"          ,Z\"#####@\" '######\"\\g          \"\"M##m");            
   System.out.println("     J#@\"             0L  \"*##     ##@\"  J#              *#K");           
   System.out.println("     #\"               `#    \"_gmwgm_~    dF               `#_");          
   System.out.println("    7F                 \"#_   ]#####F   _dK                 JE");          
   System.out.println("    ]                    *m__ ##### __g@\"                   F");          
   System.out.println("                           \"PJ#####LP\"                       ");          
   System.out.println("     `                       0######_                      ' ");          
   System.out.println("                           _0########_                       ");            
   System.out.println("         .               _d#####^#####m__              ,     ");         
   System.out.println("          \"*w_________am#####P\"   ~9#####mw_________w*\"      ");            
   System.out.println("              \"\"9@#####@M\"\"           \"\"P@#####@M\"\"");   
}

public static void dog()
{
   System.out.println("                                             ,d\"\"7b.");
   System.out.println("                                           ,'    ,d^b.");
   System.out.println("                            __,d\"\"\"\"\"\"\"b..d.    d'");
   System.out.println("              ,d\"\"\"\"-.  ,d\"\"'              `\"b.dP");
   System.out.println("            dP' ,___  `7b.                     `b");
   System.out.println("          `\"788P'  `\".   \"                       `b");
   System.out.println("          ,d\" `b      `\"                          `7.");
   System.out.println("    `P\"\"\"\"7.   8)                                   7.");
   System.out.println("     `.    8  ,P               ,---.                 \"\"\"\"b.");
   System.out.println("      8.  d' ,P             ,d\"   ,88b.         \"b       `8");
   System.out.println("     d' `\"  ,P             \"\"    ,P   `7b        `b     ,dP");
   System.out.println("    d'      8                    d       `b.      d8888888888b.");
   System.out.println("   ,'      d'                   ,8.     8   78\"\"\"\"\"\"788888888' `\"b.");
   System.out.println("   8b _   8P                 ,P'   `\"\"\"oo.,d\"          \"\"788'     `7.");
   System.out.println(" .-\"\"\"\"8 d8'            ,-\"\"7P                       .    `7.      ,8.");
   System.out.println("`b     8 88              ,d\"8   d8b.                 8b    `b      d `.");
   System.out.println("  `b___8 88             '  ,8  d8888888b.           ; `b    8     ,P  8.");
   System.out.println("   8     88                8  d8\"7P\"\"8\"\"\"\"b..      ,8  `b  ,8\"\"\"\"\"8'  88");
   System.out.println("   8     `b ,d\"'           7  8  8   8   ,8. 7P--,dP   ,8\"'     ,8' _,d8.");
   System.out.println("   7.     8d\"                 8 ,db.P\"\"bd' `7P ,d\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'    8");
   System.out.println("   `b     d'                  8P'  8   88  ,P\"'                         8");
   System.out.println("    7. _,d'                   7b  ,d88888\"'                            d'");
   System.out.println("    ,P' '8                     8888888\"'                               8");
   System.out.println("   ,P   88                     `888P'                                  8");
   System.out.println("  ,8_mGk_8                       \"'                                   d'");
   System.out.println("        \"8                                                    ,'     d'");
   System.out.println("         `b                                                  d8b..d\"\"");
   System.out.println("          `b                                              ,dP'");
   System.out.println("           `7.                           ______________,d\"\"");
   System.out.println("             `7b.                     ,d\"\"");
   System.out.println("                `7b..             _,d\"'");
   System.out.println("                     \"\"\"--....-\"\"\"'");
}


public static void lion()
{
   System.out.println("                                              ,,ccccccc,.      .,d$$??,     ");
   System.out.println("                                           ,c$$$$$$$$$$$$$$$$$$$$F,;! ),    ");
   System.out.println("                                     ,,, ,c$$$$$$$$\"\"\"\"?$$$$$$$$\",dF    ");
   System.out.println("                                   ?' cc\"$$$$$$$$$.\"  ,J\">`$$$$$$ `'zP\"     ");
   System.out.println("                                   `? P\"\"?$$$$$$$Fr.  ` Cc$$$$$$$ K         ");
   System.out.println("                                      ,  J$$$$$$$$,,ccc$$$$$$$$$CJ$,        ");
   System.out.println("                                     4cd $$$$$$$$$ x\"?$$$$$$$$$$$$$$        ");
   System.out.println("                                     `$$<$$$$$$$$$JMMnrrC$$$$$$$$$$$L       ");
   System.out.println("                                      `\"`??????',nMMMP L$$P\"\"??$$$$$$,      ");
   System.out.println("                                        \"nc,,,cdMMMP\",MM`\",MMMMn`?$$$$      ");
   System.out.println("                                          \"TT\".,,nndMMMM dMMMMMMMn`?$$,     ");
   System.out.println("                                           zF4MMMMMMMMM dMMMMMMMMM, $$$     ");
   System.out.println("                                         ,$$$,\"4MMMPP\",dMMMMMMMMMMM $$$     ");
   System.out.println("                                        ,$$$$$hcccc=$F 4MMMMMMMMMMML`$PJ.   ");
   System.out.println("                                       ,$$$$$$$$$$$L`$c`4MMMMMMMMMMM $$$b   ");
   System.out.println("                                      ,$$$$$$$$$$$$$c`$$c`4MMMMMMMMM,?$$$.  ");
   System.out.println("                                      $$$$$$$$$$$$$$$c`$$$ MMMMMMMMMM,\"$$$  ");
   System.out.println("                                   zP $$$$$$$$$$$$$$$$b ?$,)MMMMMMMMMM,`?$r ");
   System.out.println("                                ,c$$F;$$$$$$$$$$$$$$$$$$,\"F)MMMMMMMMMMMb`$$ ");
   System.out.println("                             ,c$$$$$>;$$$$$$$$$$$$$$$$$$$, JMMMMMMMMMMM\">?$ ");
   System.out.println("                         ,zd$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$ )MMMMMMMMMMM> J$ ");
   System.out.println("                      ,c$$$$$$$$$$$$d$$$$$$$$$$$$$$$$$$$$$>4MMMMMMMMMMMM $P ");
   System.out.println("                   ,c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ dMMMMMMMMMMM zP' ");
   System.out.println("                ,c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$F,MMMMMMMMMMM dF'  ");
   System.out.println("              ,d$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ dMMMMMMMMMM zF,   ");
   System.out.println("            ,$$$$$$$$$$$$$$$$$$$$$$$$\"$$$$$$$$$$$$$$$$$$ nMMMMMMMMMP'd$4$   ");
   System.out.println("           c$$$$$$$$$$$$$$$$$$$$$$$$F,$$$$$$$$$$$$$$$$$  MMMMMMMMP'z$$$$$   ");
   System.out.println("         ,$$$$$$$$$$$$$$$$$$$$$$$$P.c$$$$$$$$$$$$$$$$$(d MMMMMP\",c$$$$$$F   ");
   System.out.println("        ,$$$$$$$$$$$$$$$$$$$$$$$$$';$$$$$$$$$$$$$$$$$$$F MMP',c$$$$$$$$P'   ");
   System.out.println("       c$$$$$$$?????$$$$$$$$$$$$$F `$$$$$$$$$$$$$$$$$$$ '',c$$$$$$$$$$$'    ");
   System.out.println("      d$$$$P\",zc$$$c,`$$$$$$$P\",nMb $$$$$$$$$$$$$$$$$$$ c$$$$$$$$$$$$$'     ");
   System.out.println("     d$$$F ,$$$$$$$$$b $$$$P\"nMMMMM $$$$$$$$$$$$$$$$$$P $$$$$$$$$$$$$$      ");
   System.out.println("    d$P\",c$$$$$$$$$$$$.?$P'nMMMMMMM.3$$$$$$$$$$$$$$$$$>;$$$$$$$$$$$$$'      ");
   System.out.println("   d$F,c$$$$$$$$$$$$$$L \"xMMMMMMMMM> $$$$$$$$$$$$$$$$$ J$$$$$$$$$$$$F       ");
   System.out.println("  ,$$$$$$$$$$$$$$$$$$$$ MMMMMMMMMMMM $$$$$$$$$$$$$$$$$ $$$$$$$$$$$$$'       ");
   System.out.println("  $$$$$$$$$$$$$$$$$$$$P MMMMMMMMMMMM,?$$$$$$$$$$$$$$$F $$$$$$$$$$$$P        ");
   System.out.println(" J$$$$$$$$$$$$$$$$$$$$'JMMMMMMMMMMMMM $$$$$$$$$$$$$$$F.$$$$$$$$$$$$'        ");
   System.out.println(" $$$$$$$$$$$$$$$$$$$$$ JMMMMMMMMMMMMMx`$$$$$$$$$$$$$$'`$$$$$$$$$$$F         ");
   System.out.println(",$$$$$$$$$$$$$$$$$$$$$ MMMMMMMMMMMMMMM.`$$$$$$$$$$$$$  ?$$$$$$$$$$'         ");
   System.out.println("J$$$$$$$$$$$$$$$$$$$$F,MMMMMMMMMMMMMMM  ?$$$$$$$$$$$$  `$$$$$$$$$$          ");
   System.out.println("J$$$$$$$$$$$$$$$$$$$$'MMMMMMMMMMMMMMP,$h $$$$$$$$$$$$   ?$$$$$$$$$          ");
   System.out.println("J$$$$$$$$$$$$$$$$$$$'dMMMMMMMMMMMMM z$$P-`$$$$$$$$$$$,   $$$$$$$$$h         ");
   System.out.println("$$$$$$$$$$$$$$$$$$P nMMMMMMMMMMMM\",L,ccd? ?$$$$$$$$$$b   ?$$$$$$$$$h        ");
   System.out.println("$'$$$$$$$$$$$$$$P\",dMMMMMMMMMMP',d$$$$$?Jb $$$$$$$$$$$b,  ?$???$P.,,,3$$b $,"); 
   System.out.println("$,\"$$$$?????\"\",,cc,   cc,`\"\"'      \"\"\"\"\"\"\" ?$$$$$$$$$?$$P\"\" -$$b..`$$ 3$$L`$"); 
   System.out.println("$',$$$$$$$$$$$?',,,?$$c`$b`,                ?$$$$$$$$\",c,`$$$c`$$..`$><$$P,P"); 
   System.out.println("F `??$$$$$$$$\"d$$$$,?$$ $P \"                 `?$$$$$'d$$$>?$$$.?$b4 \" `\"\"   ");
   System.out.println("L             \"\"?$$\"?$$$F'?\"          ");
   System.out.println("$c                                                `\"`\"\"\"\"                   ");
   System.out.println("$$$c,.                                     .,,                              ");
   System.out.println("?$$$$$$$ccc,,,,,,,,,,,,,,cccccccccccccccc/`':");

}

}