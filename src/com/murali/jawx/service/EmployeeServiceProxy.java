package com.murali.jawx.service;

public class EmployeeServiceProxy implements com.murali.jawx.service.EmployeeService {
  private String _endpoint = null;
  private com.murali.jawx.service.EmployeeService employeeService = null;
  
  public EmployeeServiceProxy() {
    _initEmployeeServiceProxy();
  }
  
  public EmployeeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeServiceProxy();
  }
  
  private void _initEmployeeServiceProxy() {
    try {
      employeeService = (new com.murali.jawx.service.EmployeeServiceImplServiceLocator()).getEmployeeServiceImplPort();
      if (employeeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeService != null)
      ((javax.xml.rpc.Stub)employeeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.murali.jawx.service.EmployeeService getEmployeeService() {
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService;
  }
  
  public boolean addEmployee(com.murali.jawx.service.Employee arg0) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.addEmployee(arg0);
  }
  
  public boolean deleteEmployee(int arg0) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.deleteEmployee(arg0);
  }
  
  public com.murali.jawx.service.Employee getEmployee(int arg0) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.getEmployee(arg0);
  }
  
  
}