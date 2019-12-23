import java.util.*;
import java.util.Scanner;
public class Box{
   
double w,h,d; 
    

Box(double width,double height,double depth){


w=width;    
h=height;
      
d=depth;   
  
  }
      
double volume(){
double v;
          
 v=w*h*d
 ;
return v;
     }
     
public static void main(String []args){
         
Box bc=new Box(4,4,4);
    
System.out.println(bc.volume());
     

}

}