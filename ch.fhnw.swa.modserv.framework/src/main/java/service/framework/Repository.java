/*
 * Created on 27.04.2018
 */
package service.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author Wolfgang Weck
 */
public final class Repository {
	final private ServiceLoader<Service> s = ServiceLoader.load(Service.class);

	public List<Service> getAvailable() {
		List<Service> l = new ArrayList<>();
		s.forEach(s -> l.add(s));
		return l;
	}
}
