import java.io.*;
public class KisoKadai3 {
	public static void main(String[] args)throws IOException {
		String a = "";
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("�t�@�C���̌��������܂�");
		a =br.readLine();
    	File file = new File("C:\\Users\\internous\\"+ a +".txt");
    	try{
    		System.out.print("�t�@�C���̌�����:"+a);
    		
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
    					System.out.println(c+"���㏑�����܂����B");
    					}else if(b == 2){
    						System.out.println("�t�@�C����ǂݍ��݂܂��B");
    						//�e�L�X�g�o��
    						String str1 = br.readLine();
    						System.out.println(str1);
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
    	    	System.out.println(str+"��ۑ����܂����B");
    	    	}
    	    			
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