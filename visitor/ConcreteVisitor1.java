package visitor;

public class ConcreteVisitor1 implements Visitor
{
	public void visit(ConcreteAcceptor1 acceptor)
	{
		System.out.println(acceptor.message());
		acceptor.getChild().accept(this);
	}

	public void visit(ConcreteAcceptor2 acceptor)
	{
		System.out.println(acceptor.buffer());
	}

}
