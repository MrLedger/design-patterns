/**
 * @class Animal
 * @package priv.mrledger.study.designpatterns._01_StrategyPattern
 * @date 2020/8/14 7:59
 * Copyright (c) 2020 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * 本代码仅限于浙江长龙航空有限公司内部使用，禁止外泄，禁止用于其他任何商业目的。
 */
package priv.mrledger.study.designpatterns._01_Strategy;

import lombok.Data;

/**
 *
 *
 * @author 李俊呈
 * @date 2020/8/14 7:59
 * @version V1.0
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Data
public class Animal {

	Integer gender;
	Integer age;

	IMoveBehavior moveBehavior;

	public void move() {
		moveBehavior.move();
	}
}
