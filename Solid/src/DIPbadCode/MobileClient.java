package DIPbadCode;

public class MobileClient {

	DataAccess dataAccess =new DataAccess();
	
	void fetchData() {
		dataAccess.executeAccess();
		System.out.println("Data is fetched");
	}
	
	
	
}
