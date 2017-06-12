import java.io.*;
import java.util.*;
import java.text.*;
class Alice extends First_Checking{
    private static String prepare(String original_question){
        original_question=original_question.toLowerCase();
        String user_question="";
        original_question=original_question.trim();
        original_question=original_question+' ';
        int c=0,i=0;
        for(i=0;i<original_question.length();i++){
            if(original_question.charAt(i)==' ')
                c++;
        }
        String arr[]=new String[c];
        c=0;
        while(original_question.length()>0){
            int index=original_question.indexOf(' ');
            arr[c++]=original_question.substring(0,index);
            original_question=original_question.substring(index+1);
        }
        c=0;
        for(i=0;i<arr.length;i++){
            char p=arr[i].charAt(arr[i].length()-1);
            if(((p<65)||(p>90))&&(p<97))
                arr[i]=arr[i].substring(0,arr[i].length()-1);
            else if(((p<97)||(p>122))&&(p>90))
                arr[i]=arr[i].substring(0,arr[i].length()-1);
        }
        for(i=0;i<arr.length;i++){
            user_question=(user_question+arr[i]);
            user_question=(user_question+' ');
        }
        user_question=user_question.trim();
        return user_question;
    }
    private static boolean country_question(String user_question){
        String w[]={"what","is","the","capital","of"};
        String z=user_question;
        z=z.trim();
        z=z+' ';
        int c=0,i=0,j=0;
        for(i=0;i<z.length();i++){
            if(z.charAt(i)==' ')
            c++;
        }
        String arr[]=new String[c];
        c=0;
        while(z.length()>0){
            int index=z.indexOf(' ');
            arr[c++]=z.substring(0,index);
            z=z.substring(index+1);
        }
        c=0;
        for(i=0;i<5;i++){
            for(j=0;j<arr.length;j++){
                if(w[i].equalsIgnoreCase(arr[j])==true)
                    c++;
            }
        }
        if(c>=5)
        return true;
        else
        return false;
    }
    private static boolean hello_question(String user_question){
        String w[]={"hello","hi"};
        String z=user_question;
        z=z.trim();
        z=z+' ';
        int c=0,i=0,j=0;
        for(i=0;i<z.length();i++){
            if(z.charAt(i)==' ')
            c++;
        }
        String arr[]=new String[c];
        c=0;
        while(z.length()>0){
            int index=z.indexOf(' ');
            arr[c++]=z.substring(0,index);
            z=z.substring(index+1);
        }
        c=0;
        for(i=0;i<2;i++){
            for(j=0;j<arr.length;j++){
                if(w[i].equalsIgnoreCase(arr[j])==true)
                    c++;
            }
        }
        if(c>=1)
        return true;
        else
        return false;
    }
    public static void main(String args[])throws IOException, InterruptedException{
        int chat_counter=0;
        BufferedReader br1=new BufferedReader(new FileReader("Chat_Counter.txt"));
        chat_counter=Integer.parseInt(br1.readLine());
        br1.close();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\u000C");
        System.out.print(" Enter Your First Name : ");
        String user_name=br.readLine();
        System.out.println("\u000C");
        String original_question="",user_question="";
        do{
            System.out.println();
            System.out.println();
            System.out.print(" "+user_name+" : ");
            original_question=br.readLine();
            user_question=prepare(original_question);
            chat_counter++;
            if(original_question.equals("#date&time#")==true){
                Date date=new Date();
                SimpleDateFormat ft=new SimpleDateFormat ("E dd/MM/yyyy 'at' hh:mm:ss a zzz");
                System.out.println();
                Thread.sleep(2500);
                System.out.print(" Alice : "+ft.format(date));
                System.out.println();
            }
            if((country_question(user_question)==true)&&(original_question.equals("#date&time#")==false)){
                String capital_name=capital(user_question.substring(23));
                if((capital_name.equals("INVALID")==true)){
                    System.out.println();
                    Thread.sleep(2500);
                    System.out.print(" Alice : Invalid country name!");
                    System.out.println();
                }
                else{
                    System.out.println();
                    Thread.sleep(2500);
                    System.out.print(" Alice : "+capital_name+".");
                    System.out.println();
                }
            }
            if((user_question.equals("do you remember me")==true)&&(original_question.equals("#date&time#")==false)){
                if(memory(user_name)==true){
                    System.out.println();
                    Thread.sleep(2500);
                    System.out.print(" Alice : Yes! I remember you. We have chatted before.");
                    System.out.println();
                }
                else{
                    System.out.println();
                    Thread.sleep(2500);
                    System.out.print(" Alice : No. We have not chatted before.");
                    System.out.println();
                }
            }
            if((hello_question(user_question)==true)&&(user_question.equals("do you remember me")==false)&&(original_question.equals("#date&time#")==false)){
                System.out.println();
                Thread.sleep(2500);
                System.out.print(" Alice : Hello, "+user_name+".");
                System.out.println();
            }
            if(original_question.equals("#play number game#")==true&&(hello_question(user_question)==false)&&(user_question.equals("do you remember me")==false)&&(original_question.equals("#date&time#")==false))
                game(user_name);
            if((original_question.equals("#exit#")==false)&&(original_question.equals("#play number game#")==false)&&(country_question(user_question)==false)&&(hello_question(user_question)==false)&&(user_question.equals("do you remember me")==false)&&(original_question.equals("#date&time#")==false))
                check1(user_question,original_question,user_name);
            if((first_response_found==false)&&(original_question.equals("#exit#")==false)&&(original_question.equals("#play number game#")==false)&&(country_question(user_question)==false)&&(hello_question(user_question)==false)&&(user_question.equals("do you remember me")==false)&&(original_question.equals("#date&time#")==false))
                check2(user_question,original_question,user_name);
            if((second_response_found==false)&&(first_response_found==false)&&(original_question.equals("#exit#")==false&&(original_question.equals("#play number game#")==false))&&(country_question(user_question)==false)&&(hello_question(user_question)==false)&&(user_question.equals("do you remember me")==false)&&(original_question.equals("#date&time#")==false))
                no_match(user_question,original_question,user_name);
        }while(original_question.equals("#exit#")==false);
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Chat_Counter.txt")));
        pw.println(Integer.toString(chat_counter));
        pw.close();
    }
}