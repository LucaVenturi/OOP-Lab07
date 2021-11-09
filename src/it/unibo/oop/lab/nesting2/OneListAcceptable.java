package it.unibo.oop.lab.nesting2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final Set<T> acceptableValues;
	private final Set<T> values;

	public OneListAcceptable(List<T> acceptableValues) {
		super();
		this.acceptableValues = new HashSet<T>();
		this.acceptableValues.addAll(acceptableValues);
		this.values = new HashSet<T>();
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(acceptableValues.contains(newElement)) {
					values.add(newElement);
				}
				else {
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if( values.size() < acceptableValues.size() ) {
					throw new EndNotAcceptedException();
				}
			}
		};
	}
}
