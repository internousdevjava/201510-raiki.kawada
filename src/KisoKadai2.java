import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai2{
	public static void main(String[] args)throws IOException {
		 int answer=(int)(Math.random()*100)+1;
		    int a=0;
		    int b;
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("数当てゲーム");
		      try{
		      for(b=0;a!=answer;b++){
		    	  System.out.print("数字を入れよう : ");
		    	  a=Integer.parseInt(br.readLine());
		    	  if(a<answer)
		          System.out.println("上");
		    	  else if(a>answer)
		          System.out.println("下");
		    	  }
		      System.out.println("当たり！！  "+b+"回ミスしました。");
		      }
		      catch(NumberFormatException e){
		    	  System.err.println("エラー");
		    	  }
		      }
	}
