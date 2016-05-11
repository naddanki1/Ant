public class Final  {
final int i;

Final(){
i = 100;
System.out.println("Final value is changed to"+ i);
}
public static void main(String args[]){

Final f = new Final();
System.out.println(f.i);
}
}

