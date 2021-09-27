import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public  QuadraticEquation(){
    }
    public String getter(){
        return "a= "+a+";b= "+b+";c= "+c;
    }
    public double getDiscriminant(){
        return (this.b*2-(4*this.a*this.c));
    }
    public double getRoot1(){
        return ((-this.b+Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a));
    }
    public double getRoot2(){
        return ((-this.b-Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a= scanner.nextDouble();
        System.out.print("Enter b: ");
        double b=scanner.nextDouble();
        System.out.print("Enter c: ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has  two roots"+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }
        if(quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has one roots "+quadraticEquation.getRoot2());
        }
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }
    }
}
