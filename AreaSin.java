class AreaSin extends ConsoleProgram {

  /**
  * uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle
  * @author: Emma Chan
  */
  
  public void run() {
    
    //define veriables 
    double sideA = readDouble("Side length A: ");
    double sideB = readDouble("Side length B: "); 
    double  angleC = readDouble("Angle C: "); 

    //calculate area
    double angleNew = Math.sin (Math.toRadians(angleC));
    double numerator = sideA * sideB * angleNew;
    double denominator = numerator / 2;

    //Print
    System.out.println ("The area of the triangle is: " + denominator); 
}
}
