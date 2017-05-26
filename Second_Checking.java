import java.io.*;
class Second_Checking extends No_Match{
    static boolean second_response_found=false;
    private static int levenshtein_distance(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        int costs[]=new int[b.length()+1];
        for (int j=0;j<costs.length;j++)
            costs[j] = j;
        for (int i=1;i<=a.length();i++){
            costs[0]=i;
            int nw=i-1;
            for (int j=1;j<=b.length();j++){
                int cj=Math.min(1+Math.min(costs[j],costs[j-1]),a.charAt(i-1)==b.charAt(j-1)?nw:nw+1);
                nw=costs[j];
                costs[j]=cj;
            }
        }
        return costs[b.length()];
    }
    protected static void check2(String user_question,String original_question,String user_name)throws IOException, InterruptedException{
        second_response_found=false;
        int i=0,c=0,temp=0;
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
        int min=levenshtein_distance(question[0],user_question);
        for(i=0;i<question.length;i++){
            if(levenshtein_distance(question[i],user_question)<min){
                min=levenshtein_distance(question[i],user_question);
                temp=i;
            }
        }
        if(min<=10){
            Thread.sleep(2500);
            second_response_found=true;
            System.out.println();
            System.out.print(" Alice : " + response[temp]);
            System.out.println();
            pw1.println(user_name);
            pw2.println(user_question);
            pw3.println(response[temp]);
            pw4.println(" "+user_name+" : "+original_question);
            pw4.println(" Alice : "+response[temp]);
            pw4.println();
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