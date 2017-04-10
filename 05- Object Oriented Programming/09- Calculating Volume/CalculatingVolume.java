package objectOrientedProgramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

//Write your code here

class Calculate{
Scanner sc = null; 
Output output = new Output();
public Calculate(){
  sc = new Scanner(System.in);
}
public static Calculate do_calc(){
 return new Calculate();
}

public int get_int_val() throws IOException{
    int returnVal = sc.nextInt();
    if(returnVal <= 0) throw new java.lang.NumberFormatException("All the values must be positive");
    return returnVal;
}
public double get_double_val() throws IOException{
  double returnVal = sc.nextDouble();
  if(returnVal <= 0) throw new java.lang.NumberFormatException("All the values must be positive");
  return returnVal;
}
public double get_volume(int a){
  double volume = a*a*a;
  return volume;
}
public double get_volume(int l, int b, int h){
  double volume = l*b*h;
  return volume;
}
public double get_volume(double r){
  double res1 = Math.PI * 2/3;
  double res2 = r*r*r;
  double volume = ((res1)*(res2));
  return volume;
}
public double get_volume(double r, double h){
  double volume = Math.PI*r*r*h;
  return volume;
}

}
class Output{
public void display(double volume){
  System.out.println(String.format("%.3f", volume));
}
}
public class CalculatingVolume {
	public static void main(String[] args) {
	 DoNotTerminate.forbidExit();
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (IOException e) {
	    e.printStackTrace();
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution

	/**
	 *This class prevents the user form using System.exit(0)
	 * from terminating the program abnormally.
	 *
	 */
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {}

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	} //end of Do_Not_Terminate

