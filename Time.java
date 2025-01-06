public class Time
{
  // TODO: Part A - put your attributes here

  private int hours;
  private int minutes;
  private int seconds; 
  // TODO: Part B - create your non-default constructor
  public Time(int h, int m, int s) {
    this.hours = h;
    this.minutes = m;
    this.seconds = s;
  }
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */
  // TODO: Part C - create your default constructor

  public Time() {
    this(0, 0, 0); // 12 AM MIDNIGHT
  }
  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: Method pad takes in an integer value. If value is less than 10, meaning it is not
  * double digit, it will take a single digit number and add a zero in front of it. If value is greater than 10
  * it will just turn it into a string anyways without a zero in front.
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return null;
  }

  // TODO: Part F - write the tick method
  public void tick()
  {

  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {

  }
}
