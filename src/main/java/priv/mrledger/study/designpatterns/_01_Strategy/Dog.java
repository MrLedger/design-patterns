/**
 * @class Dog
 * @package priv.mrledger.study.designpatterns._01_StrategyPattern
 * @date 2020/8/14 8:05
 * Copyright (c) 2020 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * 本代码仅限于浙江长龙航空有限公司内部使用，禁止外泄，禁止用于其他任何商业目的。
 */
package priv.mrledger.study.designpatterns._01_Strategy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 *
 * @author 李俊呈
 * @date 2020/8/14 8:05
 * @version V1.0
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Dog extends Animal {

	public Dog(int gender, int age, IMoveBehavior moveBehavior) {
		this.gender = gender;
		this.age = age;
		this.moveBehavior = moveBehavior;
	}

	public void show() {
		super.age = 0;
		System.out.println(super.toString());
		System.out.println(this.toString());

		System.out.println("----------");

		this.age = 1000;
		System.out.println(super.toString());
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Dog{" +
				"gender=" + gender +
				", age=" + age +
				", moveBehavior=" + moveBehavior +
				'}';
	}

}
