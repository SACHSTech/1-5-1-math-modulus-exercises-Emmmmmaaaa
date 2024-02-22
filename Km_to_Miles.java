
class Km_to_Miles extends ConsoleProgram {

  /**
  * lets you enter a distance in kilometers and that converts it into miles
  * @author: Emma Chan
  */
  
  public void run() {
    // define veriable 
    double kilometers = readDouble("Kilometers: "); 
    
    //conversion 
    double miles = kilometers * 0.621371; 

    System.out.println (kilometers + "km is equivalent to "+ miles + " miles");


    
  }
}
