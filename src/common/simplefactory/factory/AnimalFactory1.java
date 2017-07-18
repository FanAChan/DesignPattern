package common.simplefactory.factory;

import common.simplefactory.Animal;
import common.simplefactory.Impl.Cat;
import common.simplefactory.Impl.Dog;

/**
 * 动物工厂方法
 * 普通工厂模式
 * @author Achan
 *
 */
public class AnimalFactory1 {

	public Animal intanceAnimal(String type){
		if("狗".equals(type)){
			return new Dog();
		}else if("猫".equals(type)){
			return new Cat();
		}else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}
}
