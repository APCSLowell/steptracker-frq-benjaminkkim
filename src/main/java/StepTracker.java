import java.util.ArrayList;
public class StepTracker {
 //4 member variables to count steps and days
 private int minSteps, totalSteps;
 private int totalDays, activeDays;
 public StepTracker(int numSteps) {
  //initialize only this one bc the constructor only takes one argument + needs a count of daily steps
  minSteps = numSteps;
  totalSteps = 0;
  totalDays = 0;
  activeDays = 0;
 }
 //adds the daily amount of steps to the total steps taken, counts the days too
 public void addDailySteps(int n) {
  totalSteps += n;
  totalDays++;
  //if the amount of steps is greater than 10000, the day is considered active
  if(n >= 10000) {
   activeDays++;
  }
 }
 //returns the amount of active days
 public int activeDays() {
  return activeDays;
 }
 //returns the average steps from all days so returns a double
 public double averageSteps() {
  if(totalDays == 0) {
   return 0.0;
  }
  return (double)totalSteps/totalDays;
 }
} 
