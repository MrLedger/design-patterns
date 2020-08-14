/**
 * @class ControlCenter
 * @package priv.mrledger.study.designpatterns._02_Observer
 * @date 2020/8/14 8:14
 * Copyright (c) 2020 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * 本代码仅限于浙江长龙航空有限公司内部使用，禁止外泄，禁止用于其他任何商业目的。
 */
package priv.mrledger.study.designpatterns._02_Observer;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Observable;

/**
 *
 *
 * @author 李俊呈
 * @date 2020/8/14 8:14
 * @version V1.0
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ControlCenter extends Observable {

	private Float temperature;
	private Float humidity;
	private Float pressure;

	public void pushInformation() {
		setChanged();
		notifyObservers();
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		pushInformation();
	}

}
