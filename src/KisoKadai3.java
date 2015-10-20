import java.io.*;
public class KisoKadai3 {
	public static void main(String[] args)throws IOException {
		String a = "";
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("ファイルの検索をします");
		a =br.readLine();
    	File file = new File("C:\\Users\\internous\\"+ a +".txt");
    	try{
    		System.out.print("ファイルの検索中:"+a);
    		
    		if(file.exists()){
    			System.out.println("ファイルを追記しますか？：1");
    			System.out.println("それともファイルの読み込みをしますか？:2");
    			int b =0;
    			while(b < 1 || 2 < b){
    			FileWriter fw=new FileWriter(file, true);
    			String str=br.readLine();
    			b = Integer.parseInt(str);
    			if(b == 1){
    				System.out.print("ファイルの追記をします。");
    				String c = br.readLine();
    					fw.write("\r\n"+c);
    					fw.close();
    					System.out.println(c+"を上書きしました。");
    					}else if(b == 2){
    						System.out.println("ファイルを読み込みます。");
    						//テキスト出力
    						String str1 = br.readLine();
    						System.out.println(str1);
    						}else if(b < 1 || 2 < b){
							System.out.println("1か2で答えてください。");
						}
    			}
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