
public class TestSwitchCase {
	public static void main(String[] args){
		char grade = 'c';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("优秀");
			break;
		case 'B' :
			break;
		case 'C':
			System.out.println("良好");
			break;
		case 'D' :
			System.out.println("及格");
			break;
		default:
			System.out.println("位置等级");
		}
		System.out.println("等级是" + grade);
	}
}
