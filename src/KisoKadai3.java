import java.io.*;
public class KisoKadai3 {
	public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	File file = new File("C:\\Users\\internous\\text.txt");
    	try{
    		if(file.exists()){
    			System.out.println("�t�@�C����ǋL���܂�");
    			FileWriter fw=new FileWriter(file, true);
    			String str=br.readLine();
    			fw.write("\r\n"+str);
    			fw.close();
    			System.out.println(str);
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
    	    	System.out.println(str+"��ۑ����܂����B");
    	    	}
    	    		System.out.println("�t�@�C����ǂݍ��݂܂��B");
    	    		//�e�L�X�g�o��
    	    		br = new BufferedReader(new FileReader(file));
    	    		String str = br.readLine();
    	    		System.out.println(str+"");
    	    			
    		System.out.print("�I�����܂�");
    		System.exit(0);
    		}
    	//�G���[
    	catch(FileNotFoundException e){
    	      System.out.println(e);
    	      }
    	catch(IOException e){
    		System.out.println(e);
    		}
    	}
	}