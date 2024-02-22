class Circumference extends ConsoleProgram {

  /**
  * Computes the circumference of a circle given a radius from user entry. 
  * @author: Emma Chan
  */
  
  public void run() {

    // define radius
    double radius = readDouble ("What is the radius? ");

    //compute circumference 
    double circomference = 2 * radius * Math.PI; 
    System.out.println ("The circomference is " + circomference); 
    
  }
}