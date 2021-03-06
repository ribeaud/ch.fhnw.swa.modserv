package service.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class Repository {
	final private ServiceLoader<Service> s = ServiceLoader.load(Service.class);

	public List<Service> getAvailable() {
		List<Service> l = new ArrayList<>();
		s.forEach(s -> l.add(s));
		return l;
	}
}
