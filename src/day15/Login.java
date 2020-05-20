package day15;
//셋터 켓터가 스레드를 상속 받으니 메소드의 이름이 중복 되는 것들이 있어 에러가 발생한다.
//오버라이딩이 되는데 리턴 타입이 다르다고 해서 에러 발생
//그래서 이름을 getId1 뒤에 숫자 1을 붙여서 변경 했다.

class Login extends Win7Quiz{
    private String userId=null,userPw=null;
    public Login(String c,String m,String cPath,String mPath){
    	super(c,m,cPath,mPath);
    }
    public int compare(String id,String pw){
        if(getUserId() != null  && getUserPw() != null)
            if(getUserId().equals(id) && getUserPw().equals(pw)) return 0;
            else return 1;
        return 1;
    }
    public void saveId_Pw(String id,String pw){ setUserId(id); setUserPw(pw); }
    public boolean out(){	return false;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String id) {	this.userId = id;	}
	public String getUserPw() {	return userPw;	}
	public void setUserPw(String pw) {	this.userPw = pw; }
}