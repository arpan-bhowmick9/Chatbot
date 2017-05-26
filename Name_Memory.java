import java.io.*;
class Name_Memory{
    protected static boolean memory(String user_name)throws IOException{
        BufferedReader br1=new BufferedReader(new FileReader("Name.txt"));
        String s="";
        while((s=br1.readLine())!=null){
            if(s.equalsIgnoreCase(user_name)==true)
                return true;
        }
        return false;
    }
}