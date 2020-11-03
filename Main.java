/**
 * returns the first digit of a number
 * @author Cole Girling
 */
public class Main {

  public static int firstDigit(int number){
    //if the number is negative this will make it positive
    if(number < 0){
      number = number * -1;
    }
    //runs while there is more than one digit in the number
    while(number >= 10){
      number = number / 10;
    }
    return number;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //calls the method and inserts the number into the method
    int first = firstDigit(2);
    
    //prints the last digit to the screen
    System.out.println(first);
    
    
  }
}
