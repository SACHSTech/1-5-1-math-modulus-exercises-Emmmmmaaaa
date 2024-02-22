class FtoC extends ConsoleProgram {

  /**
  * lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure
  * @author: Emma Chan
  */
  
  public void run() {
    
    //Define Veriables 
    double fahrenheit = readDouble("What is the tempurature in (f)? "); 

    //calculate
    double bracket = fahrenheit - 32; 
    double celsius = bracket * 5/9; 
    
    System.out.println (fahrenheit + " farenheit in Celcius is " + celsius); 

    
  }
}