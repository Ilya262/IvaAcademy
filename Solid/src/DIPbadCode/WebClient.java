package DIPbadCode;

public class WebClient {

	DataAccess dataAccess =new DataAccess();
	
	void fetchData() {
		dataAccess.executeAccess();
		System.out.println("Data is fetched");
	}
	
	
}
