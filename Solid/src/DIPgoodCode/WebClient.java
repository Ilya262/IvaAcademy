package DIPgoodCode;

public class WebClient {

	DataAccessible dataAccessible =new WebDataAccess();
	
	void fetchData() {
		dataAccessible.executeAccess();
		System.out.println("Data is Fetched");
		
	}
	
	
}
