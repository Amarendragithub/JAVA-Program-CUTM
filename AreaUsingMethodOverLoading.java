public class AreaUsingMethodOverLoading {
    double area(double a){
        return 3.14*a*a;
    }
    int area(int b, int c){
        return b*c;
    }
    double area(double d,double e){
        return 0.5*d*e;
    }
    public static void main(String args[]){
        AreaUsingMethodOverLoading obj=new AreaUsingMethodOverLoading();
        System.out.println(obj.area(45));
        System.out.println(obj.area(45,26));
        System.out.println(obj.area(45.5,26.6));
    }
}