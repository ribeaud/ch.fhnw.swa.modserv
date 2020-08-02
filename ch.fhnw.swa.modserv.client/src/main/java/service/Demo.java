package service;

import service.framework.Repository;
import service.framework.Service;

import java.util.List;

/*
 * Created on 27.04.2018
 */
/**
 * @author Wolfgang Weck
 */
public class Demo {
	public static void main(String[] args) {
		List<Service> list = new Repository().getAvailable();
		for (Service s : list) {
			s.serv("Hello World!");
		}
	}
}
