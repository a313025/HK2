
public class test_p49 {
	public static void main(String[]args)
	{
		int[][]test;
		test=new int[2][5];
		
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=70;
		test[0][3]=50;
		test[0][4]=20;
		test[1][0]=90;
		test[1][1]=75;
		test[1][2]=60;
		test[1][3]=20;
		test[1][4]=10;
		
		for(int i=0;i<test[1].length;i++)
		{
			System.out.println("第"+(i+1)+"個人的國文分數是"+test[0][i]+"分");
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
		}
		
		
		
	}

}
