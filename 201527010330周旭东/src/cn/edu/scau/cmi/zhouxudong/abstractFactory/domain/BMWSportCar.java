package cn.edu.scau.cmi.zhouxudong.abstractFactory.domain;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainInterface.BMW;

public class BMWSportCar extends SportCar implements BMW {
	 @Override
	  public void show() {
			//System.out.println("���Ǳ����ճ�");

			System.out.println(BMW.CarCompany+super.name);
			
		}
}
