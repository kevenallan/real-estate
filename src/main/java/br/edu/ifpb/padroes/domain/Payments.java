package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.payment.PaymentService;

public class Payments {

	PaymentService payService = new PaymentService();
	
	Property[] props;
	
	public Property[] getProps() {
		return props;
	}

	public void setProps(Property[] props) {
		this.props = props;
	}

	public Payments(Property...p) {
		props=p;
	}
	
	public void pay() {
		for (Property p:props) {
			payService.pay(p);
		}
	};
	
}
