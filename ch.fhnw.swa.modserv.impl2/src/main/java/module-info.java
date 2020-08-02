module service.impl2 {
	requires service.framework;

	provides service.framework.Service with service.impl2.ServiceImpl;
}