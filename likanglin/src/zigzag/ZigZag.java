package zigzag;
/**
 * @author ALKL
 * @description 
 * 2016/11/22
 * �տ�ʼ���֣�û������Ŀ��������˼��ͨ��discuss�в鿴���˵Ľⷨ�������������е���ѧ��ʽ��������Ϊ��̳��һλ����Ľⷨ
 * 3����ʽ��
 *  1 ֮��������ΪnRows,��ôÿ���ظ�������ǰ�ļ���ַ�ΪzigSpan = nRows*2-2;
 *  2 ��һ�к���βһ�ж��Ǵ��һ���ַ��ģ����Դ洢���ַ�Ϊ���ΪzigSpan���ַ�
 *  3 �м�������Ҫ����洢��һ���ַ��ģ��洢���ַ�λ���ǣ� zigSpan + j - 2*i������iΪ������jΪ���е��ַ�λ�ã�
 * 0123456789
 * 0   4   8
 * 1 3 5 7 9  //ͨ������������ֿ��м��У������������к�β��
 * 2   6
 */
public class ZigZag {
	public String convert(String s,int numRows){
		
		if (numRows <= 1) {
	        return s;  //�տ�ʼ������numRowsС�ڵ���1�������������discuss�����Ľⷨ
	    }
	    int n = s.length();
	    int zigSpan = 2 * numRows - 2;     
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < numRows; i++) {
	        for (int j = i; j < n; j += zigSpan) {
	    //appendΪ�ַ�ƴ�ӷ�������charAtΪ���ص�ǰλ�õ��ַ�
	            sb.append(s.charAt(j));
	            //ע���������к�β�еļ�������м����У���Ҫ����j��ʾ���Ǹ��е��ַ�λ�ã��Ӷ����������м��е���������м��еĴ洢���ַ�λ�ã�zigSpan + j- 2*i����ʱzigspanΪһȷ���ĳ���ֵ
	            if (i != 0 && i != numRows - 1 && j + zigSpan - 2 * i < n) {
	                sb.append(s.charAt(j + zigSpan - 2 * i));  //���к�β����Ϊһ����������м�����Ϊ����һ�����
	            }
	        }
	    }
	    return sb.toString();
		
		
		
	}

}
