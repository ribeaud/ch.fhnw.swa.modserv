module service.impl1 {
    requires service.framework;
    // A provides…with module directive specifies that a module provides
    // a service implementation—making the module a service provider.
    provides service.framework.Service with service.impl1.ServiceImpl;
}
