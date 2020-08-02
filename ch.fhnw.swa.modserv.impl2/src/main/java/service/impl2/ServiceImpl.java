/*
 * Created on 27.04.2018
 */
package service.impl2;

import service.framework.Service;

/**
 * @author Wolfgang Weck
 */
public final class ServiceImpl implements Service {
	@Override
	public void serv(String s) {
		System.out.println("This is service implementation 2. I got called with: \"" + s + "\"");
	}
}
