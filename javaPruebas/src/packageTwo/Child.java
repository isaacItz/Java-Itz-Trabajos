package packageTwo;

import packageOne.Parent;

class Child extends Parent {
	
	public void testMethod() {
		System.out.println("name is " + name);
	}

	public static void main(String args[]) {
		Child n = new Child();
		n.testMethod();
	}
	
}