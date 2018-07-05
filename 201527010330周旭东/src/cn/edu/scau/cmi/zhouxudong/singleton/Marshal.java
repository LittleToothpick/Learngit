package cn.edu.scau.cmi.zhouxudong.singleton;

import java.util.Random;
public class Marshal {
    private String marshalName = null;
	
	private Marshal(String name){marshalName = name;}
	
	private Marshal(){}
	
	private static Marshal[] array ={
			 new Marshal("���"),new Marshal("��»�"),new Marshal("�ֱ�"),new Marshal("���ٻ�"),new Marshal("Ҷ��Ӣ"),
			 new Marshal("������"),new Marshal("����"),new Marshal("����"),new Marshal("����ǰ"),new Marshal("������")
					
			};
	public static Marshal getInstance(){
		return array[random()];
	}
	
	
	public static int random(){
		 Random random = new Random();
		 int value = Math.abs(random.nextInt());
		 value =value%10;
		 return value;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����"+marshalName+"Ԫ˧";
	}
	
	
}
