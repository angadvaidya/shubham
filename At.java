package pack;
class A{
protected static String S="java";
}
class B extends A{
}
class C extends B{
static void methodOx(){
System.out.println(S);
}
}
 class mainClass{
public static void main(String args[]){
C.methodOx();
}
}




