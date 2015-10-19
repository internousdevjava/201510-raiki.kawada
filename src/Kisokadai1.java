import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kisokadai1 {
	public static void main(String[] args)throws IOException {
		int x;
    	int y;
    	System.out.print("x‚Æy‚Ì“ü—Í:");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
    	for(int i=x;i>=1;i--){
    		for(int j=1;j<=y;j++){
    			  System.out.print(i*j+",");
    			  }
    		System.out.println("");
    		}
    	}
	}
	
