
public class Gugu_07 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		
		intNum += 1; // intNum �� ����  1
		System.out.println(intNum);
		
		System.out.println(intNum); // 1���
		intNum += 1; // 13��° �� ǥ�ÿ� ������ ��ģ��.
		
		System.out.println(intNum); // 2���
		
		intNum = 0;
		// ++�� ���� �ڿ� ������
		// �ٸ� ��ɹ� ���� ������ �Ǵ� ����
		// �ٸ� ��ɹ��� ��� ����� �� ���� ���� 1 ���� ��Ų��.
		// ���� ���� ����Ǵ� ��ɹ����� �ƹ��� ������ ��ġ�� �ʴ´�. 
		System.out.println(intNum++); // 0���
		
		// 21�� ��ɹ��� �����鼭  intNum�� 1���� ��Ų��������
		// 1�� ��µȴ�.
		System.out.println(intNum);
		
		// ++ �� �ܵ�(�ܵ���ɹ�)���� ����ɶ���
		// �տ������� �ڿ������� ����.
		intNum++;
		++intNum;
		
		//�ٸ� ��ɹ��� �Բ� ���ϋ��� ��ġ�� ���� ���� �޶�����.
		System.out.println(++intNum);
		
		
		
	}

}
