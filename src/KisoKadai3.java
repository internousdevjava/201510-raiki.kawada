import java.io.*;

public class KisoKadai3 {
	public static void main(String[] args)throws IOException {
		String a = "";
		String d = "";
		System.out.println("dir");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//System.out.println("�t�@�C���̌��������܂�");
		//d =br.readLine();
    	
		a =br.readLine();
		
		System.out.println("file");
    	br = new BufferedReader(new InputStreamReader(System.in));
    	//System.out.println("�t�@�C���̌��������܂�");
    	
		d =br.readLine();
		
		//a =br.readLine();
    	File file = new File("C:\\Users\\internous\\"+a);
    	//try{
    		System.out.println("�t�H���_����"+a);
    		if(file.exists()){
    			System.out.println(a);
    		}else if(file.mkdir()){
             System.out.println("�t�H���_���쐬���܂����B");
    		}
    	//}
    	//catch(Exception e){
  	     // System.out.println(e);
  	     // }
    	//try{
    		System.out.print("�t�@�C���̌�����:"+d);
    		file = new File("C:\\Users\\internous\\"+a+"\\"+d+".txt");
    		if(file.exists()){
    			System.out.println("�t�@�C����ǋL���܂����H�F1");
    			System.out.println("����Ƃ��t�@�C���̓ǂݍ��݂����܂����H:2");
    			int b =0;
    			while(b < 1 || 2 < b){
    			FileWriter fw=new FileWriter(file, true);
    			
    			
    			String str=br.readLine();
    			
    			b = Integer.parseInt(str);
    			
    			if(b == 1){
    				System.out.print("�t�@�C���̒ǋL�����܂��B");
    				
    				
    				String c = br.readLine();
    					fw.write("\r\n"+c);
    					fw.close();
    					System.out.println("�ǋL���܂����B");
    					}else if(b == 2){
    						FileReader fr = new FileReader("C:\\Users\\internous\\"+a+"\\"+d);
    						int ch;
    						System.out.println("�t�@�C����ǂݍ��݂܂��B");
    						while ((ch = fr.read()) != -1) {
    						System.out.print((char) ch);
    					    }
    						System.out.print("\n�I�����܂�");
    			    		System.exit(0);
    						}else if(b < 1 || 2 < b){
							System.out.println("1��2�œ����Ă��������B");
						}
    			}
    			}else if(file.createNewFile()){
    			System.out.println("�t�@�C�������܂�");
    			FileWriter fw = new FileWriter(file);
    	    	//�t�@�C���̐V�K�쐬
    			file.createNewFile();
    	    	//�N���X�̃C���X�^���X���A�����Ńt�@�C�������w��
    	    	System.out.print("�t�@�C������菑�����݂����܂��B");
    	    	String str=br.readLine();
    	    	//�������ޕ���
    	    	fw.write(str);
    	    	fw.close();
    	    	System.out.println("�ۑ����܂����B");
    	    	}
    	    			
    		System.out.print("�I�����܂�");
    		System.exit(0);
    	//	}
    	//�G���[
    	//catch(FileNotFoundException e){
    	      //System.out.println(e);
    	      //}
    	//catch(IOException e){
    		//System.out.println(e);
    		//}
    	}
}