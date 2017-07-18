package common.abstractfactory.Impl;

import common.abstractfactory.AbstractFactory;
import common.base.Animal;
import common.base.Impl.Dog;

public class DogFactory implements AbstractFactory {

	@Override
	public Animal instance() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
