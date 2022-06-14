import java.util.Scanner;
public class bestfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of processes : ");
		int n=sc.nextInt();
		System.out.println("Enter number of blocks : ");
		int m=sc.nextInt();
		int i,j;
          int block[]=new int[m];
          int process[]=new int[n];
          int allocation[]=new int[n];
          for(i=0;i<m;i++)
          {
        	  System.out.println("Enter block size for block "+(i+1)+" : ");
        	  block[i]=sc.nextInt();
          }
          for(i=0;i<n;i++)
          {
        	  System.out.println("Enter process size for process "+(i+1)+" : ");
        	  process[i]=sc.nextInt();
        	  
          }
          for(i=0;i<n;i++)
        	  allocation[i]=-1;
          for(i=0;i<n;i++)
          {
        	  int bestIndex=-1;
        	  for(j=0;j<m;j++)
        	  {
        		  if(block[j]>=process[i])
        		  {
        			  if(bestIndex==-1)
        				  bestIndex=j;
        			  else if(block[bestIndex]>block[j])
        				  bestIndex=j;
        		  }
        	  }
        	  if(bestIndex!=-1) {
        	  allocation[i]=bestIndex;
        	  block[bestIndex]-=process[i];
        	  }
        	  
          }
          System.out.println("Process No "+"\t"+"Process Size "+"\t"+" "+"Block Size "+"\t"+"Block No");
          for(i=0;i<n;i++)
          {
        	  System.out.print((i+1)+"\t\t"+process[i]+"\t\t"+block[i]+"\t\t");
        	  if(allocation[i]!=-1)
        	  {
        		  System.out.println((allocation[i]+1));
        	  }
        	  else
        	  {
        		  System.out.println("Nothing is Allocated");
        	  }
          }
          
	}

}
