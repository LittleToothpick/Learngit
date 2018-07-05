package cn.edu.scau.cmi.zhouxudong.composite.uniformity;

public class Individual extends BiggerOrganization {

	private String string = "����";

	public Individual() {

	}

	public Individual(String string) {
		this.string = string;
	}

	@Override
	public String say() {
		return string;
	}

	// add������Ч
	@Override
	public void add(BiggerOrganization individual) {
		// TODO Auto-generated method stub
		System.out.println("���岻֧��add����");

	}

	@Override
	public void remove(BiggerOrganization individual) {
		// TODO Auto-generated method stub
		System.out.println("���岻֧��remove����");
	}

}
