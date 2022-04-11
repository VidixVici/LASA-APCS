public class Main        
{ 
public static void main( String[] args    ) 
   {
      System.out.println("Running main() in Tasking class!\n");
      System.out.println("Trying mission()");
      mission();
      System.out.println(mission());
      System.out.println("");
      System.out.println("Trying favorite()");
      int nbr1 = Task.favorite(); 
      int nbr2 = Task.favorite();
      System.out.println("nbr1=" + nbr1);
      System.out.println("nbr2=" + nbr2);
      System.out.println("");
      System.out.println("Trying wasted()");
      double dpm = 3.75;
      int day = 30;
      double gallons;
      Task.wasted(dpm,day);
      Task.wasted(7.50,5);
      System.out.println();
      System.out.println("Trying count()");
      double a;
      double b;
      int mL;
      double beans = Task.count( 1.5, 0.9, 500);
      System.out.println("Task.count(1.5,0.9,500): " + (int)beans + " beans");
      beans = Task.count(2.0, 1.0, 25);
      System.out.println("Task.count(2.0,1.0,25): " + (int)beans + " beans");
      System.out.println("");
   }
	static String mission() 
	{
    String lhCode = ("The Liberal Arts and Science Academy cultivates responsible leaders, problem solvers, and thinkers by offering a nationally recognized, rigorous, innovative, evolving curriculum.");
    return(lhCode);
	}
}