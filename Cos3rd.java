class Cos3rd extends ConsoleProgram {

  /**
  * lets you entre two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side. 
  * @author: Emma Chan
  */
  
  public void run() {
    
    //define the veriables 
    double sideA = readDouble("Side length A: ");
    double sideB = readDouble("Side length B: "); 
    double angleC = readDouble("Angle C: "); 

    //calculating the third side 
    double squareA = Math.pow (sideA,2);
    double squareB = Math.pow (sideB,2);
    double newA = Math.cos (Math.toRadians(angleC)); 
    double endbit = squareA + squareB - 2 * sideA * sideB * newA;
    double answer = Math.sqrt(endbit);

    System.out.println (answer);
    
  }
}