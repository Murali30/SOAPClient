/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.murali.jawx.service;

public interface EmployeeService extends java.rmi.Remote {
    public boolean addEmployee(com.murali.jawx.service.Employee arg0) throws java.rmi.RemoteException;
    public boolean deleteEmployee(int arg0) throws java.rmi.RemoteException;
    public com.murali.jawx.service.Employee getEmployee(int arg0) throws java.rmi.RemoteException;
}
