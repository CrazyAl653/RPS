public class Config {
    public static String printRules() {
        return "Pick between ROCK, PAPER, or SCISSORS. ";
    }

    // 0 = Draw, 1 = Player Wins, -1 = NPC Wins
    public static int calcuateWinner{int pChoice, int npcChoice}  {
        if (pChoice == npcChoice) {
            return 0; // Draw if both players are the same
        } else if ((pChoice == 0 && npcChoice = 2)) || (pChoice == 1 && npcChoice == 0) || (pChoice == 2 && npcChoice == 1)) {
            return 1; // Player Wins
        } else {
            return -1; // NPC Wins
        }
    }

        public static String printOutcome(int result) {
            if (result == 1) {
                return "The Player Wins!";
            } else if (result == -1) {
                return "The Computer Wins!"
            } else {
                return "It's a Draw!";
            }
        }

        public static String printChoice(int choice) {
            String choiceString = "";
            if(choice == 0) {
                choiceString = "ROCK";
            } else if(choice == 1) {
                choiceString = "PAPER";
            } else if(choice == 2) {
                choiceString = "SCISSORS";
            }
            return choiceString;
        }
    }

