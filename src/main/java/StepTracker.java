import java.util.ArrayList;
public class StepTracker {
 int steps;
 public StepTracker(int num) {
  num = steps;
 }
 public void addDailySteps(int n) {
  n = steps;
 }
 public int activeDays() {
  int totalDays = 0;
  for(int i = 0; i < num; i++) {
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
