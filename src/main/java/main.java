
public class main {
       public static void main(String[] args) {
       int [] parts = new int[4];    
       parts = IPCutter.FunCutter ("163.121.12.30");
       for (int i = 0 ; i < parts.length ;i++)
            {
               System.out.println(parts[i]);
            }
    }
}
