import java.io.*;
class No_Match extends Countries_Capitals{
    protected static void no_match(String user_question,String original_question,String user_name)throws IOException, InterruptedException{
        System.out.println();
        Thread.sleep(2500);
        System.out.print(" Alice : Could you please rephrase your statement. I have not understood it completely.");
        System.out.println();
        PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("Unknown_Question.txt",true)));
        PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("Unknown_Qname.txt",true)));
        PrintWriter pw3=new PrintWriter(new BufferedWriter(new FileWriter("Memory.txt",true)));
        pw1.println(user_question);
        pw2.println(user_name);
        pw3.println(" "+user_name+" : "+original_question);
        pw3.print(" Alice : Could you please rephrase your statement. I have not understood it completely. ");
        pw3.println();
        pw3.println();
        pw1.close();
        pw2.close();
        pw3.close();
    }
}