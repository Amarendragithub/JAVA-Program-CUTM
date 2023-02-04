public class Diviser {
    public static void main(String args[]){
        if(args.length==2){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=0;
            // System.out.println(a);
            // System.out.println(b);
            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    c=c+1;
                    // System.out.println(i);
                }
            }
            System.out.println(c);
        }
        else{
            System.out.println("Sorry enter 2 element");
        }
        
    }
}