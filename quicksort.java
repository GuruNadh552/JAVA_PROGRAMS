import java.util.Scanner;
class alog{
    int start,end,loc,p,k;
    alog(int u){
        int n=u+1;
        k=n;
    }
    int[] qc(int []a,int l,int u){
        if(l<u){
        loc= partion(a,l,u);
        qc(a,l,loc-1);
        qc(a,loc+1,u);
                }
        return a;
    }
    int partion(int []a,int l,int u){
        p=a[l];
        show(a);
        System.out.println("\nhere pivot is "+p);
        start=l;end=u;
        while(start<end){
            while((a[start]<=p)&&(start<end)){
                System.out.println("and i is at "+start+" position and a[i]<=p "+a[start]+"<="+p);
                start=start+1;
            }
            System.out.println("a[i]="+a[start]+" a[i]>p so stop i++ go for decrementing j. j is at"+end);
            while(a[end]>p){
                System.out.println(" and j is at "+end+" position and a[i]<=p"+a[end]+">"+p);
                end=end-1;
            }
            System.out.println("a[j]="+a[end]+" a[j]<p so stop j--");
            if(start<end){
                System.out.println("i<j "+start+"< "+end+" so swap a[i] and a[j]");
                int t=a[start];
                a[start]=a[end];
                a[end]=t;
                show(a);
            }
        } 
        System.out.println("i>j "+start+">"+end+ "so swap a[j] and p");   
        a[l]=a[end];
        a[end]=p;
        return end;
    }
    void show(int[]a){
        for(int i=0;i<=k-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}


 class quicksort {
    public static void main(String[]ar){
        Scanner ip=new Scanner(System.in);
        System.out.print("enter the no of elements :");
        int n=ip.nextInt(),i,l,u;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        l=0;u=n-1;
        alog h=new alog(u);
     int[]h1=h.qc(a,l,u);
     System.out.println("\n");
     System.out.println("finally the sorted array is : ");
     for(i=0;i<n;i++){
            System.out.print(h1[i]+" ");
        }
    }
    
}
