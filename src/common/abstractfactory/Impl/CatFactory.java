package common.abstractfactory.Impl;

import common.abstractfactory.AbstractFactory;
import common.base.Animal;
import common.base.Impl.Cat;

public class CatFactory implements AbstractFactory {

	@Override
	public Animal instance() {
		// TODO Auto-generated method stub
		 return new Cat();
	}

}
