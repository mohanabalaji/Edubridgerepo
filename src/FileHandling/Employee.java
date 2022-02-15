package FileHandling;

import java.io.Serializable;

public class Employee
{
	

		private transient int id; //private int id
		
		public int getId() {
			                  return id;
		                   }
		
		public String getName() {
			                       return name;
		                        }
		
		private String name;
		
		public Employee(int id, String name) {
			                                     this.id = id;
			                                     this.name = name;
		                                      }
		

	

}
