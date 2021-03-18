
/**
 *
 * @author Hrishi
 */
public class Pattern2 {
    public static void main(String args[]) { 
        int i, j,n=5;  
        int alphabet = 65;  
        for(i=0; i<n; i++) { 
            for(j=2*(n-i); j>=0; j--){           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++){       
                System.out.print((char) alphabet+" ");
                alphabet++;
            }           
            System.out.println(); 
        } 
    } 
}
