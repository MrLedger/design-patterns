/**
 * @class Mobile
 * @package priv.mrledger.study.designpatterns._02_Observer
 * @date 2020/8/14 8:24
 * Copyright (c) 2020 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * 本代码仅限于浙江长龙航空有限公司内部使用，禁止外泄，禁止用于其他任何商业目的。
 */
package priv.mrledger.study.designpatterns._02_Observer;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author 李俊呈
 * @date 2020/8/14 8:24
 * @version V1.0
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Data
public class Mobile implements Observer {

	private Observable controlCenter;

	private Float temperature;
	private Float humidity;
	private Float pressure;

	public Mobile(Observable controlCenter) {
		this.controlCenter = controlCenter;
		controlCenter.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		ControlCenter controlCenter = (ControlCenter) o;
		this.temperature = controlCenter.getTemperature();
		this.humidity = controlCenter.getHumidity();
		this.pressure = controlCenter.getPressure();
	}

}
