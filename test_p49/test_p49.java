
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
			System.out.println("��"+(i+1)+"�ӤH�������ƬO"+test[0][i]+"��");
			System.out.println("��"+(i+1)+"�ӤH���ƾǤ��ƬO"+test[1][i]+"��");
		}
		
		
		
	}

}
