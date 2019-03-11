
public class Quiz8 {
	public static void main(String[] args)
	{
		int x= 8;
		switch(x)
		{
		case 6:
			x+=5;
		case 7:
			x+=3;
		case 8:
			x+=2;
			break;
		case 9:
			x ++;
		default:
			x+=4;
		}
		System.out.print(x);
	}
}
