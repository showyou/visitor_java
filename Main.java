import visitor.*;

public class Main{
	public static void main(String[] args){
		ConcreteAcceptor1 ca1 = new ConcreteAcceptor1();
		ConcreteAcceptor2 ca2 = new ConcreteAcceptor2();

		ca1.setChild(ca2);

		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ca1.accept(v1);
	}
}
