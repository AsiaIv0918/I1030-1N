import java.util.*;
public class Main {

    public static void main(String[] args) {
	int a;
	Scanner in=new Scanner(System.in);
	a = in.nextInt();
	if (a>=0)
	    System.out.printf("%d",a);
		if (a<=0)
			a=a*-1;
			System.out.printf("%d",a);
    }
}
