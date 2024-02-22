class Power extends ConsoleProgram {

  /**
  * let you enter two numbers and will power them 
  * @author: Emma Chan
  */
  
  public void run() {
    
    // define veriables
    double intA = readInt( "Value of A: "); 
    double intB = readInt ("Value of B: "); 

    //compute 
    double answer = Math.pow(intA, intB);

    System.out.println ("The answer is: " + answer);
    
  }
}