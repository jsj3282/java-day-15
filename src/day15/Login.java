package day15;
//���� ���Ͱ� �����带 ��� ������ �޼ҵ��� �̸��� �ߺ� �Ǵ� �͵��� �־� ������ �߻��Ѵ�.
//�������̵��� �Ǵµ� ���� Ÿ���� �ٸ��ٰ� �ؼ� ���� �߻�
//�׷��� �̸��� getId1 �ڿ� ���� 1�� �ٿ��� ���� �ߴ�.

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