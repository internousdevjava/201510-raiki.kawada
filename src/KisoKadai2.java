import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai2{
	public static void main(String[] args)throws IOException {
		 int answer=(int)(Math.random()*100)+1;
		    int a=0;
		    int b;
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("�����ăQ�[��");
		      try{
		      for(b=0;a!=answer;b++){
		    	  System.out.print("���������悤 : ");
		    	  a=Integer.parseInt(br.readLine());
		    	  if(a<answer)
		          System.out.println("��");
		    	  else if(a>answer)
		          System.out.println("��");
		    	  }
		      System.out.println("������I�I  "+b+"��~�X���܂����B");
		      }
		      catch(NumberFormatException e){
		    	  System.err.println("�G���[");
		    	  }
		      }
	}
