package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageBooking {
	
	public static final Target TXT_ARRIVAL = Target.the("field of arrival").locatedBy("//input[@id = 'ss']");
	public static final Target BTN_SEARCH = Target.the("field of arrival").locatedBy("//button[@data-sb-id= 'main']");
	public static final Target BTN_DATE = Target.the("field of arrival").locatedBy("//div[@class = 'xp__dates-inner']");
	public static final Target BTN_NEXT = Target.the("field of arrival").locatedBy("//div[@data-bui-ref = 'calendar-next']");
	public static final Target LBL_MONTH = Target.the("field of arrival").locatedBy("(//div[@class = 'bui-calendar__wrapper'])[1]//div[@class = 'bui-calendar__month']");
	public static final Target LBL_DAY = Target.the("field of arrival").locatedBy("(//div[@class = 'bui-calendar__wrapper'])[1]//ancestor-or-self::div[@class = 'bui-calendar__wrapper']//td[@class = 'bui-calendar__date']//span[text() = '{0}']");
	public static final Target BTN_GUEST_COUNT = Target.the("field of arrival").locatedBy("//span[@class = 'xp__guests__count']");
	public static final Target BTN_ADD_ADULTS = Target.the("field of arrival").locatedBy("//div[@class = 'sb-group__field sb-group__field-adults']//button[@data-bui-ref = 'input-stepper-add-button']");
	public static final Target BTN_ADD_CHILD = Target.the("field of arrival").locatedBy("//div[@class = 'sb-group__field sb-group-children ']//button[@data-bui-ref = 'input-stepper-add-button']");
	public static final Target BTN_ADD_ROOM = Target.the("field of arrival").locatedBy("//div[@class = 'sb-group__field sb-group__field-rooms']//button[@data-bui-ref = 'input-stepper-add-button']");
	

}
