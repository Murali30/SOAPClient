/**
 * EmployeeServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.murali.jawx.service;

public class EmployeeServiceImplServiceLocator extends org.apache.axis.client.Service implements com.murali.jawx.service.EmployeeServiceImplService {

    public EmployeeServiceImplServiceLocator() {
    }


    public EmployeeServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeServiceImplPort
    private java.lang.String EmployeeServiceImplPort_address = "http://localhost:8888/ws/employee";

    public java.lang.String getEmployeeServiceImplPortAddress() {
        return EmployeeServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeServiceImplPortWSDDServiceName = "EmployeeServiceImplPort";

    public java.lang.String getEmployeeServiceImplPortWSDDServiceName() {
        return EmployeeServiceImplPortWSDDServiceName;
    }

    public void setEmployeeServiceImplPortWSDDServiceName(java.lang.String name) {
        EmployeeServiceImplPortWSDDServiceName = name;
    }

    public com.murali.jawx.service.EmployeeService getEmployeeServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeServiceImplPort(endpoint);
    }

    public com.murali.jawx.service.EmployeeService getEmployeeServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.murali.jawx.service.EmployeeServiceImplPortBindingStub _stub = new com.murali.jawx.service.EmployeeServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeServiceImplPortEndpointAddress(java.lang.String address) {
        EmployeeServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.murali.jawx.service.EmployeeService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.murali.jawx.service.EmployeeServiceImplPortBindingStub _stub = new com.murali.jawx.service.EmployeeServiceImplPortBindingStub(new java.net.URL(EmployeeServiceImplPort_address), this);
                _stub.setPortName(getEmployeeServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployeeServiceImplPort".equals(inputPortName)) {
            return getEmployeeServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.jawx.murali.com/", "EmployeeServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.jawx.murali.com/", "EmployeeServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeServiceImplPort".equals(portName)) {
            setEmployeeServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
