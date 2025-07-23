package BuilderDesign;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = new URL();
		url.setProtocol("http://");
		url.setHostname("myWebsite");
		url.setPath(":8080/");
		url.setpathParam("homepage");
		url.setQueryParam("random");
		
		System.out.print(url.getProtocol());
		System.out.print(url.getHostname());
		System.out.print(url.getPath());
		System.out.print(url.getpathParam());
		System.out.println(url.getQueryParam());
		
		//Craeting objects with different Combinations
		URLBuilder.Builder builder=new URLBuilder.Builder() ;
		builder.protocol("http://").hostname("myWebsite").path(":8080/");
		URLBuilder urlBuilder=builder.build();

		System.out.print(urlBuilder.protocol);
		System.out.print(urlBuilder.hostname);
		System.out.println(urlBuilder.path);
		
		
		URLBuilder.Builder builder2=new URLBuilder.Builder() ;
		builder2.protocol("http://").hostname("myWebsite").pathParam("homepage");
		URLBuilder urlBuilder2=builder2.build();
		
		System.out.print(urlBuilder2.protocol);
		System.out.print(urlBuilder2.hostname);
		System.out.print(urlBuilder2.pathParam);
	}

}
