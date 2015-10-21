import java.io.*;

public class KisoKadai1 {
	public static void main(String[] args)throws IOException {
		int x;
    	int y;
    	System.out.print("xとyを入力");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 try{
       System.out.print("\nxを入力:");
       x = Integer.parseInt(br.readLine());
       BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("yを入力:");
       y = Integer.parseInt(br1.readLine());
       
    	for(int i=x;i>=1;i--){
    		for(int j=1;j<=y;j++){
    			  System.out.print(i*j+",");
    			  }
    		System.out.println("");
    	}
        }
        catch(NumberFormatException e){
	    	  System.err.println("エラー");
	    	  }
        }
    	}
	
	