
public class TestSwitchCase {
	public static void main(String[] args){
		char grade = 'c';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("����");
			break;
		case 'B' :
			break;
		case 'C':
			System.out.println("����");
			break;
		case 'D' :
			System.out.println("����");
			break;
		default:
			System.out.println("λ�õȼ�");
		}
		System.out.println("�ȼ���" + grade);
	}
}
