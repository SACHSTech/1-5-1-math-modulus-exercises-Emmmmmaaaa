class Minutes extends ConsoleProgram {

  /**
  * lets you enter a number of minutes, and that will calculate the number of days,
  * hours and minutes that represents.
  * @author: Emma Chan 
  */
  
  public void run() {

    // get hours 
    int minutes = readInt ("Input the number of minutes: ");

    //calculate 
    int minutesLeft = minutes % 60;
    int hours = (minutes - minutesLeft) / 60;
    int hoursLeft = hours % 24;
    int days = (hours - hoursLeft) / 24;

    //output answer
    System.out.println (days + " days, " + hoursLeft + " hours, and " + minutesLeft + " minutes.");
    
  }
}