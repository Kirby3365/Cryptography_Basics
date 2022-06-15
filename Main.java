class Main {
  public static void main(String[] args) {
    String message = "assassinate the enemy leader. Please.";
    char[] messageAsArray = message.toCharArray();
    int shift = 9; 
    
    for (int i = 0; i < messageAsArray.length; i++) {
      char character = messageAsArray[i];
      int thatCharacterAsNumber = (int) character;
      System.out.print("" + character + " as a number is: " + thatCharacterAsNumber);
      int newNumber = 0;
      
      //Shift the number and find the new character.
      if(thatCharacterAsNumber > 96 && thatCharacterAsNumber < 123){
        newNumber = thatCharacterAsNumber+shift;
        if(newNumber > 122){
          newNumber = newNumber%122 + 96;
        }
      }
      else{
         newNumber = thatCharacterAsNumber; //Leave it the same
      }
      
      char newCharacter = (char) newNumber;  
      System.out.println("    Add " + shift + " and get " + newNumber +" which is: " + newCharacter );
    }
  }
}