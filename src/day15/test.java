package day15;

import java.util.Scanner;

public class test{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //MyJframe mf=null;
    MyJframe2 mf2 = null;
    int num=0,result=0; String inputId=null,inputPw=null;
    Login lo = new Login("계산기","메모장","calc.exe","notepad.exe"); boolean flag=true;
    lo.time();
    while(flag){
        System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>"); num = input.nextInt();
        switch(num){
            case 1:System.out.print("아이디 입력 : ");inputId = input.next();
            System.out.print("비밀번호 입력 : "); inputPw = input.next();
            result = lo.compare(inputId,inputPw);
            if(result == 0){
            	System.out.println("인증 통과");
            	mf2 = new MyJframe2();
            	mf2.setDaemon(true);
            	mf2.start();
            	//mf = new MyJframe();
            	//mf.setDaemon(true);
            	//mf.start();
            	lo.display();
            	System.out.println("프로그램 종료");
            	//mf2 = new MyJframe2();
            	//mf2.setDaemon(true);
            	//mf2.start();
            	return ;
            }
            else  System.out.println("인증 실패");
            break;
            case 2: System.out.print("가입 id : "); inputId = input.next();
            System.out.print("가입 pw : "); inputPw = input.next();
            lo.saveId_Pw(inputId,inputPw); System.out.println("저장 완료");
            break;
            case 3:flag=lo.out();System.out.println("종료 합니다");
        }
    }
}

}