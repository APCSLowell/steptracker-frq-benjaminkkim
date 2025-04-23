import java.util.ArrayList;
public class StepTracker {
 int steps;
 public StepTracker(int numSteps) {
  numSteps = steps;
 }
 public void addDailySteps(int n) {
  int dailySteps = 0;
  n += steps;
  dailySteps++;
 }
 public int activeDays() {
  int totalDays = 0;
  for(int i = 0; i < dailySteps; i++) {
   if(steps >= 10000) {
    totalDays++;
   }
  }
  return totalDays;
 }
 public double averageSteps() {
  return steps/totalDays;
 }
} 
