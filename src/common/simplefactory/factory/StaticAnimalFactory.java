package common.simplefactory.factory;

import common.simplefactory.Animal;
import common.simplefactory.Impl.Cat;
import common.simplefactory.Impl.Dog;

/**
 * 动物工厂方法
 * 静态工厂方法模式
 * @author Achan
 *
 */
public class StaticAnimalFactory {

	public static Animal intanceDog() {
		return new Dog();
	}

	public static Animal intanceCat() {
		return new Cat();
	}
}
