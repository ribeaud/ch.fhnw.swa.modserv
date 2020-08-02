module service.impl1 {
	requires service.framework;

	provides service.framework.Service with service.impl1.ServiceImpl;
}
