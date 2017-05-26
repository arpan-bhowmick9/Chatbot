import java.io.*;
class First_Checking extends Second_Checking{
    static boolean first_response_found=false;
    protected static void check1(String user_question,String original_question,String user_name)throws IOException, InterruptedException{
        first_response_found=false;
        int i=0,c=0;
        String s="";
        PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("Name.txt",true)));
        PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("Runtime_Question.txt",true)));
        PrintWriter pw3=new PrintWriter(new BufferedWriter(new FileWriter("Runtime_Response.txt",true)));
        PrintWriter pw4=new PrintWriter(new BufferedWriter(new FileWriter("Memory.txt",true)));
        BufferedReader br1=new BufferedReader(new FileReader("Question.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("Question.txt"));
        BufferedReader br3=new BufferedReader(new FileReader("Response.txt"));
        while((s=br1.readLine())!=null)
            c++;
        s="";
        String question[]=new String[c];
        String response[]=new String[c];
        c=0;
        while((s=br2.readLine())!=null)
            question[c++]=s;
        s="";
        c=0;
        while((s=br3.readLine())!=null)
            response[c++]=s;
        c=0;
        s="";
        for(i=0;i<question.length;i++){
            if(user_question.equalsIgnoreCase(question[i])==true){
                Thread.sleep(2500);
                first_response_found=true;
                System.out.println();
                System.out.print(" Alice : " + response[i]);
                System.out.println();
                pw1.println(user_name);
                pw2.println(user_question);
                pw3.println(response[i]);
                pw4.println(" "+user_name+" : "+original_question);
                pw4.println(" Alice : "+response[i]);
                pw4.println();
                break;
            }
        }
        pw1.close();
        pw2.close();
        pw3.close();
        pw4.close();
        br1.close();
        br2.close();
        br3.close();
    }
}