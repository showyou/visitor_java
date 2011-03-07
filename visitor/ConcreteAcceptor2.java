package visitor;

public class ConcreteAcceptor2 implements Acceptor{
	public void accept(Visitor v){
		v.visit(this);
	}

	public String buffer(){
		return "にゃーん";
	}
}
