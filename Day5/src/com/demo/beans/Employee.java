package com.demo.beans;

public class Employee {
	private
		int empId;
	    String empName;
	    String empRole;
	    public Employee() {
	    	super();
	    }
		public Employee(int empId, String empName, String empRole) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empRole = empRole;
		}
		
		public Employee(int empId, String empName) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empRole="Staff";
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpRole() {
			return empRole;
		}
		public void setEmpRole(String empRole) {
			this.empRole = empRole;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
		}

}
