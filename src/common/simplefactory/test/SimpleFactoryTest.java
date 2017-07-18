package common.simplefactory.test;

import common.simplefactory.Animal;
import common.simplefactory.factory.AnimalFactory1;
import common.simplefactory.factory.AnimalFactory2;
import common.simplefactory.factory.StaticAnimalFactory;

/**
 * @author Achan
 *
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
//		普通工厂模式
//		AnimalFactory1 factory = new AnimalFactory1();
//		Animal animal = factory.intanceAnimal("狗");
//		animal.hue();
		
		
//		多个工厂方法模式
//		AnimalFactory2 factory = new AnimalFactory2();
//		Animal cat = factory.intanceCat();
//		cat.hue();
		
		Animal cat = StaticAnimalFactory.intanceCat();
		cat.hue();
		
	}

}
