public class Q4 {
    public static void main(String[] args) {
      
        int n = Integer.parseInt(args[0]);
        for (int ligne = n; ligne >= 1; ligne--) {
          
            for (int i = ligne; i >= 1; i--) {
              
                System.out.print(i);
                if (i > 1) {
                  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  
}
