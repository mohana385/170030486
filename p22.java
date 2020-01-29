public class p22{
public static void main(String args[]){
if(args.length==0){
System.out.println("Expected : Please enter an integer number");
}
else{
int x=Integer.parseInt(args[0]);
int c=0;
if(x==0 || x==1){
System.out.println(" Expected : " +args[0]+ " is neither prime nor composite");
}
else{
for(int i=2;i<x/2;i++){
if(x%i==0){
c++;
}
}
if(c>=1){
System.out.println("Expected : " +args[0]+ " is not a prime number");
}
else{
System.out.println("Expected : " +args[0]+ " is a prime number");
}
}  
}
}
}
