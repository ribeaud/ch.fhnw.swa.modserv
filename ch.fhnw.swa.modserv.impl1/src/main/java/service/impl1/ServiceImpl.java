/*
 * Created on 27.04.2018
 */
package service.impl1;

import service.framework.Service;

public final class ServiceImpl implements Service {
	@Override
	public void serv(String s) {
		System.out.println("This is service implementation 1. I got called with: \"" + s + "\"");
	}
}
