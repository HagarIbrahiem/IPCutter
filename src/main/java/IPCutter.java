public class IPCutter {
    public static int [] FunCutter (String ip){
            String [] cuts = ip.split("[.]");
            int [] parts = new int [4]; 
            for (int i = 0 ; i < cuts.length ;i++)
            {
                parts[i] = Integer.parseInt(cuts[i]);
            }
            return parts;
        }
}
