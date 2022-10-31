import java.util.*;



class check
{ 

    String sn_data="";
    String rn_data="";
    void send(String data)
    { 

        System.out.println("\n");

        int size=32-data.length();
        int i=0;

        for(i=0;i<size;i++)
        { 

            data=data+"0";

        } 

        System.out.println(data);

        String values[]=new String[4];
        int st=0;int en=8;

        for(i=0;i<4;i++)
        { 

            values[i]=data.substring(st, en);
            st=en;
            en=en+8;
        }

        System.out.println("\n");
        for(i=0;i<4;i++)
        { 

            System.out.println((i+1)+" "+values[i]+"\n");
            
            
        }

        int sum;
        String sr;

        int s1=Integer.parseInt(values[0],2);
        int s2=Integer.parseInt(values[1],2);
        
        sum=s1+s2;

        String str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s3=Integer.parseInt(n,2);

            sum=sum+s3;

            sr=Integer.toBinaryString(sum);
           

        }
        

        int s3=Integer.parseInt(values[2],2);

        sum=sum+s3;    

        str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s4=Integer.parseInt(n,2);

            sum=sum+s4;

            sr=Integer.toBinaryString(sum);
           

        }
        

        int s4=Integer.parseInt(values[2],2);

        sum=sum+s4;    

        str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s5=Integer.parseInt(n,2);

            sum=sum+s5;

            sr=Integer.toBinaryString(sum);
           

        }
        System.out.println(sr);

        System.out.println("1s compelemet of sender data:");

       
        
        char a;

        for(i=0;i<8;i++)
        { 

            a=sr.charAt(i);

            String com=""+a;

            if(com.equals("0"))
            { 

                sn_data=sn_data+"1";

            }
            else
            { 

                sn_data=sn_data+"0";


            }


        }
        System.out.println(sn_data);

    }

    void receive(String data)
    { 

        System.out.println("\n");

        int size=32-data.length();
        int i=0;

        for(i=0;i<size;i++)
        { 

            data=data+"0";

        } 

        System.out.println(data);

        String values[]=new String[4];
        int st=0;int en=8;

        for(i=0;i<4;i++)
        { 

            values[i]=data.substring(st, en);
            st=en;
            en=en+8;
        }

        System.out.println("\n");
        for(i=0;i<4;i++)
        { 

            System.out.println((i+1)+" "+values[i]+"\n");
            
            
        }

        int sum;
        String sr;

        int s1=Integer.parseInt(values[0],2);
        int s2=Integer.parseInt(values[1],2);
        
        sum=s1+s2;

        String str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s3=Integer.parseInt(n,2);

            sum=sum+s3;

            sr=Integer.toBinaryString(sum);
           

        }
        

        int s3=Integer.parseInt(values[2],2);

        sum=sum+s3;    

        str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s4=Integer.parseInt(n,2);

            sum=sum+s4;

            sr=Integer.toBinaryString(sum);
           

        }
        

        int s4=Integer.parseInt(values[2],2);

        sum=sum+s4;    

        str=String.valueOf(sum);
        
        if(str.length()==8)
        {
            sr=Integer.toBinaryString(sum);
            
        }
        else
        { 
            
            char a=str.charAt(0);
            String n=""+a;

            int s5=Integer.parseInt(n,2);

            sum=sum+s5;

            sr=Integer.toBinaryString(sum);
           

        }
        System.out.println(sr);

        int r1=Integer.parseInt(sr,2);
        int r2=Integer.parseInt(sn_data,2);

        int tot=r2+r1;

        String result=Integer.toBinaryString(tot);

        System.out.println((result.substring(2)));

        int c=0;

        String cr="";

        for(i=0;i<8;i++)
        { 

            char cn=result.charAt(i);

            cr=cr+cn;

            if(cr.equals("0"))
            { 


                c++;

            }


        }
        if(c==8)
        { 

            System.out.println("no error has occurred,Frame has not accepted");

        }
        else
        { 

            System.out.println("error has occurred,Frame has sucessfully accepted");

        }        
        

    
        

    }







}


class Check_Sum
{ 
 
   public static void main(String[] args) {
    

        System.out.println("Check Sum");

        Scanner s=new Scanner(System.in);

        System.out.println("Enter sender the 32 bit data(0 & 1):");
        String data=s.nextLine();

        check cs=new check();
        cs.send(data);


        System.out.println("Enter recevier the 32 bit data(0 & 1):");
        String rdata=s.nextLine();

        cs.receive(rdata);



   } 




}
