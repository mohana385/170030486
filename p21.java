public class p21{
public static void main(String args[]){
if(args.length==0){
System.out.println("Expected : An integer number as argument is expected");
}
else{
int x=Integer.parseInt(args[0]);
if(x>0){
System.out.println(args[0]+ " is positive");
}
else if(x==0){
System.out.println(args[0]+ " is neither negative or positive");
}
else{
System.out.println(args[0]+ " is neither negative");
}
}
}
} 