package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.singleton.Chairman;

public class SingletonClient {

	public static void main(String[] args) {	
		System.out.println(Chairman.getInstance("ë��").toString());
		System.out.println(Chairman.getInstance("��Сƽ").toString());
		System.out.println(Chairman.getInstance("������").toString());
		System.out.println(Chairman.getInstance("������").toString());
		System.out.println(Chairman.getInstance("ϰ��ƽ").toString());
	}

}
