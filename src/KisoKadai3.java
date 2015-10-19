import java.io.*;
public class KisoKadai3 {
	public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	File file = new File("C:\\Users\\internous\\text.txt");
    	try{
    		if(file.exists()){
    			System.out.println("ファイルを追記します");
    			FileWriter fw=new FileWriter(file, true);
    			String str=br.readLine();
    			fw.write("\r\n"+str);
    			fw.close();
    			System.out.println(str);
    		}else if(file.createNewFile()){
    			System.out.println("ファイルを作ります");
    			FileWriter fw = new FileWriter(file);
    	    	//ファイルの新規作成
    			file.createNewFile();
    	    	//クラスのインスタンス化、引数でファイル名を指定
    	    	System.out.print("ファイルを作り書き込みをします。");
    	    	String str=br.readLine();
    	    	//書き込む文字
    	    	fw.write(str);
    	    	fw.close();
    	    	System.out.println(str+"を保存しました。");
    	    	}
    	    		System.out.println("ファイルを読み込みます。");
    	    		//テキスト出力
    	    		br = new BufferedReader(new FileReader(file));
    	    		String str = br.readLine();
    	    		System.out.println(str+"");
    	    			
    		System.out.print("終了します");
    		System.exit(0);
    		}
    	//エラー
    	catch(FileNotFoundException e){
    	      System.out.println(e);
    	      }
    	catch(IOException e){
    		System.out.println(e);
    		}
    	}
	}