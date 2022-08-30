package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultFlightPage {
	
	public static final Target LBL_TITLE_RESULT = Target.the("").locatedBy("//h1[contains(text(), 'alojamientos encontrados')]");
	public static final Target CHECK_FANTASTYC = Target.the("").locatedBy("//div[@class = 'ffa9856b86 c9c3c66a7d f7d4209a37']//div[text() = 'Fantástico: 9 o más']");
	public static final Target BTN_CURRENCY = Target.the("").locatedBy("//button[@data-tooltip-text = 'Elegir tu moneda']");
	public static final Target CURRENCY = Target.the("").locatedBy("//div[@class = 'bui-overlay bui-overlay--active']//li//a[@data-modal-header-async-url-param = 'changed_currency=1&selected_currency={0}']");
	public static final Target LIST_PRICES = Target.the("").locatedBy("(//span[contains(text(),' 50 m') or contains(text(),'100 m')or contains(text(),'150 m')or contains(text(),'200 m')or contains(text(),'250 m')or contains(text(),'300 m')or contains(text(),'350 m')or contains(text(),'400 m')or contains(text(),'450 m')or contains(text(),'500 m')])/ancestor-or-self::div[@class='d20f4628d0']//span[@class = 'fcab3ed991 bd73d13072']");
	

}
