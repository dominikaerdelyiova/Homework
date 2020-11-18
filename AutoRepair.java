package sk.kosickaakademia.dominika.erdelyiova.Homework;


    import java.io.*;
import java.nio.Buffer;

    public class AutoRepair {
        public void repairFile(String fileName){
            BufferedReader bf;
            String line;
            char ch;

            try{
                if(!(new File(fileName).exists())){
                    System.out.println("File not found");
                    return;
                }
                FileReader fr = new FileReader(fileName);
                File file = new File("out/output/newGit.txt");
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                bf = new BufferedReader(fr);
                while ((line = bf.readLine()) != null){
                    char[] originalLine = new char[line.length()];
                    for (int i = 0; i < line.length(); i++){
                        ch = line.charAt(i);
                        if (ch == 'I') ch = 'Y';
                        else if (ch == 'Y') ch = 'I';
                        else if (ch == 'i') ch = 'y';
                        else if (ch == 'y') ch = 'i';
                        else if (ch == '?') continue;
                        fw.write(ch);
                    }
                    fw.write("\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

