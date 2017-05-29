import java.io.*;
class Trainer
{
    protected static void backup_everything()throws IOException{
        System.out.println("\u000C");
        BufferedReader br=new BufferedReader(new FileReader("Question.txt"));
        BufferedReader br1=new BufferedReader(new FileReader("Response.txt"));
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("bk_Question.txt")));
        PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("bk_Response.txt")));
        String s="";
        while((s=br.readLine())!=null)
        pw.println(s);
        s="";
        while((s=br1.readLine())!=null)
        pw1.println(s);
        s="";
        pw.close();
        pw1.close();
        br.close();
        br1.close();
        System.out.println(" Operation Successful! ");
    }
    private static void display()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new FileReader("Question.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("Response.txt"));
        System.out.println("\u000C");
        int c=0;
        String s="",p="";
        String f="";
        while((s=br1.readLine())!=null&&(p=br2.readLine())!=null)
        {
            System.out.println();
            System.out.println(" Question : " + s);
            System.out.println(" Reply : " + p);
        }
        System.out.println();
        System.out.println(" Enter Any Key To Exit : ");
        System.out.println();
        s=br.readLine();
    }
    public static void main(String args[])throws IOException
    {
        int choice=0;
        String x="",y="",z="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("Question.txt",true)));
        PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("Response.txt",true)));
        do
        {
            System.out.println("\u000C");
            System.out.println(" Enter Question Or Statement : ");
            System.out.println();
            y=br.readLine();
            if(y.equals("display mem_sector123cache")==true)
            {
                display();
            }
            else
            {
                System.out.println();
                System.out.println(" Enter Its Response : ");
                System.out.println();
                z=br.readLine();
                System.out.println();
                pw1.println(y);
                pw2.println(z);
            }
            System.out.println();
            System.out.println(" 1. Enter Another Question And Response. ");
            System.out.println(" 2. Exit ");
            System.out.println();
            System.out.println(" Enter Your Choice : ");
            System.out.println();
            choice=Integer.parseInt(br.readLine());
        }while(choice==1);
        pw1.close();
        pw2.close();
    }
}