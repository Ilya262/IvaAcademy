package DIPgoodCode;

public class MobileClient {
	DataAccessible dataAccessible =new WebDataAccess();
	
	void fetchData() {
		dataAccessible.executeAccess();
		System.out.println("Data is Fetched");
		
	}
}
