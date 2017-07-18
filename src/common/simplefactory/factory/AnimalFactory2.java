package common.simplefactory.factory;

import common.simplefactory.Animal;
import common.simplefactory.Impl.Cat;
import common.simplefactory.Impl.Dog;

/**
 * 动物工厂方法2
 * 多个工厂方法模式
 * @author Achan
 *
 */
public class AnimalFactory2 {

	public Animal intanceDog() {
		return new Dog();
	}

	public Animal intanceCat() {
		return new Cat();
	}
}
