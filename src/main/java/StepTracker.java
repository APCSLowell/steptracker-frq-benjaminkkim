import java.util.ArrayList;
public class StepTracker {
 private int minSteps, totalSteps;
 private int totalDays, activeDays;
 public StepTracker(int numSteps) {
  minSteps = numSteps;
  totalSteps = 0;
  totalDays = 0;
  activeDays = 0;
 }
 public void addDailySteps(int n) {
  totalSteps += n;
  totalDays++;
  if(n >= minSteps) {
   activeDays++;
  }
 }
 public int activeDays() {
  return activeDays;
 }
 public double averageSteps() {
  if(totalDays == 0) {
   return 0.0;
  }
  return (double)totalSteps/totalDays;
 }
} 
