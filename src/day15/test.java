package day15;

import java.util.Scanner;

public class test{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //MyJframe mf=null;
    MyJframe2 mf2 = null;
    int num=0,result=0; String inputId=null,inputPw=null;
    Login lo = new Login("����","�޸���","calc.exe","notepad.exe"); boolean flag=true;
    lo.time();
    while(flag){
        System.out.print("1.�α���  2.�� ��  3.�α׾ƿ� \n>>>"); num = input.nextInt();
        switch(num){
            case 1:System.out.print("���̵� �Է� : ");inputId = input.next();
            System.out.print("��й�ȣ �Է� : "); inputPw = input.next();
            result = lo.compare(inputId,inputPw);
            if(result == 0){
            	System.out.println("���� ���");
            	mf2 = new MyJframe2();
            	mf2.setDaemon(true);
            	mf2.start();
            	//mf = new MyJframe();
            	//mf.setDaemon(true);
            	//mf.start();
            	lo.display();
            	System.out.println("���α׷� ����");
            	//mf2 = new MyJframe2();
            	//mf2.setDaemon(true);
            	//mf2.start();
            	return ;
            }
            else  System.out.println("���� ����");
            break;
            case 2: System.out.print("���� id : "); inputId = input.next();
            System.out.print("���� pw : "); inputPw = input.next();
            lo.saveId_Pw(inputId,inputPw); System.out.println("���� �Ϸ�");
            break;
            case 3:flag=lo.out();System.out.println("���� �մϴ�");
        }
    }
}

}