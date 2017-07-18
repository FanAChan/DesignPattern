package common.test;

import common.abstractfactory.AbstractFactory;
import common.abstractfactory.Impl.CatFactory;
import common.base.Animal;

/**
 * @author Achan
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory factory = new CatFactory();
		Animal cat = factory.instance();
		cat.hue();
		
	}

}
