package visitor;

public class ConcreteAcceptor1 implements Acceptor{
	private ConcreteAcceptor2 child = null;

	public void setChild(ConcreteAcceptor2 cld){ this.child = cld; }
	public ConcreteAcceptor2 getChild(){ return this.child; }

	public String message()
	{
		return "hauhau!";
	}

	public void accept(Visitor v){
		v.visit(this);
	}
}
