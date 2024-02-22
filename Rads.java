class Rads extends ConsoleProgram {

  /**
  *  converts degree measures to radian measures
  * @author: Emma Chan
  */
  
  public void run() {
    
    //define degree
    double dblDegree = readInt ("What is the angle? "); 
    //convert degree to radian
    dblDegree = Math.toRadians(dblDegree); 
    System.out.println (dblDegree);


    
  }
}