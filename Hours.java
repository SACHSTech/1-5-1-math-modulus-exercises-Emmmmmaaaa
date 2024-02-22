class Hours extends ConsoleProgram {

  /**
  * lets you enter a number of hours, and that converts it to days and hours
  * @author: Emma Chan
  */
  
  public void run() {
    
    //define veriables
    int hours = readInt("Number of Hours: "); 

    //convert hours into days 
    int hoursLeft = hours % 24; 
    int days = (hours - hoursLeft) / 24;

    System.out.println (hours + " hours = " + days + " days " + hoursLeft + " hours" );
  }
}