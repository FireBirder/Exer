public class Hello{
	public static final String COMPANY_NAME="yootk";
	public static void print(){
		Sytem.out.println("test conflict");
	}
    public static void main(String[] args){
        System.out.println("Happy New Year");
        System.out.println("Happy Myself");
		print();
    }
}
