class RPS {
    public static void main(String args[]) {
         System.out.println(Config.printrules());

         Player player = new Player();
         int pChoice = player.getPcChoice(); // Store player's choice
         String pcChoiceString = Config.printChoice(pChoice);

         Player npc = new Player();
         int npcChoice = npc.getNpcChoice(); //Store the bots choices
         String npcChoiceString = Config.printChoice(npcChoice);

        System.out.println("Player chose: " + pcChoiceString);
        System.out.println("NPC chose: " + npcChoiceString);
        System.out.println(Config.printOutcome(Config.calculateWinner(pChoice, npcChoice)));
    }
}

