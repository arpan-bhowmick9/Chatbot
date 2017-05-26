import java.io.*;
class Number_Game extends Name_Memory{
    static int i=0,j=0,t=0,total=0,sub_t=0,n=0,p=0,c=0,s=0,toss2=0,pw=0,cw=0;
    static double toss=0;
    static int a[]={3,1,5,2,4};
    private static void toss()throws IOException{
        int c=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\u000C");
        System.out.println(" Enter The Number Of Players : ");
        System.out.println();
        int n=Integer.parseInt(br.readLine());
        System.out.println("\u000C");
        String arr[]=new String[n];
        System.out.println(" Enter The First Name of The Players : ");
        System.out.println();
        for(int i=0;i<n;i++)
            arr[i]=br.readLine();
        do{
            System.out.println("\u000C");
            System.out.println(" The Two Players are : ");
            System.out.println();
            int a=0;
            int b=0;
            do{
                a=(int)(Math.random()*10);
                b=(int)(Math.random()*10);
            }while((a==b)||((a>(n-1))||(b>(n-1))));
            System.out.println(" 1. "+arr[a]);
            System.out.println(" 2. "+arr[b]);
            System.out.println();
            System.out.println(" 1. Continue ");
            System.out.println(" 2. Exit ");
            System.out.println();
            c=Integer.parseInt(br.readLine());
        }while(c==1);
    }
    protected static void game(String player_name)throws IOException{
        total=0;
        sub_t=0;
        p=0;
        i=0;
        j=0;
        t=0;
        n=0;
        c=0;
        s=0;
        a[0]=3;
        a[1]=1;
        a[2]=5;
        a[3]=2;
        a[4]=4;
        toss=0;
        toss2=0;
        pw=0;
        cw=0;
        int flag=0;
        System.out.println("\u000C");
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        try{
            System.out.println("Enter Target Number ");
            System.out.println();
            t=Integer.parseInt (in.readLine());
        }
        catch (IOException e1){
            System.out.println("I/O Error! You have been disqualified!");
            flag=1;
        }
        catch (NumberFormatException e2){
            System.out.println("Invalid Input! You have been disqualified!");
            flag=1;
        }
        if(flag==0){
            System.out.println("\u000C");
            sub_t=t%6;
            toss=((Math.random())*10);
            toss2=(int)(toss);
            if((toss2>=0)&&(toss2<5)){
                System.out.println(player_name+" to play first..................");
                System.out.println();
                s=1;
            }
            else if((toss2>=5)&&(toss2<=10)){
                System.out.println("Alice to play first..................");
                System.out.println();
                s=2;
            }
            while (total<t){
                if(s==1){
                    user (player_name);
                    if(pw==0)
                    comp ();
                }
                else{
                    comp ();
                    if(cw==0)
                    user (player_name);
                }
            }
        }
    }
    private static void user(String player_name)throws IOException{
        int flag=0;
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        try{
            System.out.println(player_name+" Enters.................. ");
            System.out.println();
            System.out.println("Enter Number ");
            System.out.println();
            n=Integer.parseInt(br.readLine());
            System.out.println();
        }
        catch (IOException e3){
            System.out.println("I/O Error! You have been disqualified!");
            flag=1;
            pw=1;
            cw=1;
            total=t;
        }
        catch (NumberFormatException e4){
            System.out.println("Invalid Input! You have been disqualified!");
            flag=1;
            pw=1;
            cw=1;
            total=t;
        }
        if((n>5)||(n<=0)){
            System.out.println("Number not acceptable! You have been disqualified!");
            flag=1;
            pw=1;
            cw=1;
            total=t;
        }
        if(flag==0){
            total+=n;
            if(total>=t){
                System.out.println();
                System.out.println(player_name+" Wins!");
                System.out.println();
                System.out.println(" Alice : Well Done "+player_name+"!");
                System.out.println();
                pw=1;
            }
        }
    }
    private static void comp(){
        int flag=0;
        if(total>=sub_t)
        sub_t+=6;
        if((sub_t-total==0)||(sub_t-total==6)){
            c=a[p];
            p++;
        }
        else{
            c=sub_t-total;
        }
        if(p>4)
        p=0;
        System.out.println("Alice Enters.................." + c);
        System.out.println();
        total+=c;
        System.out.println("Present Total is = " + total);
        System.out.println();
        if(total>=t){
            System.out.println();
            System.out.println("Alice Wins!");
            cw=1;
        }
    }
}