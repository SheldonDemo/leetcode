package reverse;

public class Solution {
	public int reverse(int x) {  //�����̲�ס���˽��,�Լ���˼·���ַ��������룬��Ŀû��ϸ������û�뵽���ַ�ʽ����jdk�Դ���reverse����
	    
	    String str = new StringBuilder(x+"").reverse().toString();      //reverse ������һ�� Array �����е�Ԫ��λ�ý��з�ת
	        if(!Character.isDigit(str.charAt(str.length()-1))){      //Character.isDigit�����ж�ָ���ַ��Ƿ���һ������
	        	str = str.charAt(str.length()-1)+str.substring(0, str.length()-1);
	        }
	        long num = Long.parseLong(str);                            //����������0�������ע�����Integer.MAX_VALUE��Integer.MIN_VALUE��ֵ�ķ�Χ
	        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)  
	        	return 0;
	        return Integer.parseInt(str);
	    }
}
