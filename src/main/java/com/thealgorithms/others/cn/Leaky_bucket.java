import java.util.*;

class Leaky
{ 
    
	Scanner s=new Scanner(System.in);
    ArrayList<Integer> al1 = new ArrayList<Integer>();

    ArrayList<Integer> al2 = new ArrayList<Integer>();
    int c=0;
   
    void Input(int limit)
    { 
        int i,element;
        System.out.print("Enter the packet Value:\n");
        for(i=0;i<limit;i++)
        { 
            
            element=s.nextInt();
            al1.add(element);
            
            
        }
        
        System.out.print("\nPackets={ ");
        for(i=0;i<limit;i++)
        { 
            System.out.print(al1.get(i)+" ");
            
        }
        
        System.out.print("}\n\n");
        
        
        
    }
    
    
    void Pocket_Delivery(int limit,int out)
    { 
        
         
        for(int i=0;i<limit;i++)
        { 
            
            int element=al1.get(i);
            
            if(element>=out)
            { 
                System.out.println(element+" is greater than Outlet,Packet lose");
                al2.add(element);
                c=c+1;
            }
            
            
        }
        int size=al1.size()-c;
        
        System.out.println("\n"+size+" Packets sucessfully send");
        
        
        
    }
    
    void display(int limit)
    { 
        
        if(c==0)
        {
            System.out.println("\nNo Packets in the Bucket ");
            
        }
        else
        {
        System.out.print("\nNot Sending Packets={ ");
        for(int i=0;i<al2.size();i++)
        { 
            System.out.print(al2.get(i)+" ");
            
        }
        
        System.out.print("}\n");
        
        }
        
    }
    
    
    
}


class Leaky_bucket
{
	
	public static void main(String[] args)
	{
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Capacity:");
		int Limit=s.nextInt();
		
		System.out.println("Enter the Size of Outlet:");
		int outlet=s.nextInt();
		
        Leaky l=new Leaky();
        
        l.Input(Limit);
        
        l.Pocket_Delivery(Limit,outlet);
        l.display(Limit);

	}
}
