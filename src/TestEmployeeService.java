import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.murali.jawx.service.Employee;
import com.murali.jawx.service.EmployeeService;
import com.murali.jawx.service.EmployeeServiceImplServiceLocator;


public class TestEmployeeService {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			EmployeeService	service = new EmployeeServiceImplServiceLocator().getEmployeeServiceImplPort();
			Employee emp = new Employee();
			emp.setEmpid(12347);
			emp.setAge(25);
			emp.setEmpName("Murlai");
			
			System.out.println(service.addEmployee(emp));
			System.out.println(service.getEmployee(12347).getEmpName());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
