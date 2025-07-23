package BuilderDesign;

public class URL {
	private String protocol;
	private String hostname;
	private String path;
	private String pathParam;
	private String queryParam;
	
	public URL() {
		
	}
	
	public URL(String protocol) {
		this.protocol=protocol;
	}
	
	public URL(String protocol, String hostname) {
		this.protocol=protocol;
		this.hostname=hostname;
	}
	
	public URL(String protocol, String hostname, String path) {
		this.protocol=protocol;
		this.hostname=hostname;
		this.path=path;
	}
	
	public URL(String protocol, String hostname, String path, String pathParam) {
		this.protocol=protocol;
		this.hostname=hostname;
		this.path=path;
		this.pathParam=pathParam;
	}
	
	public URL(String protocol, String hostname, String path, String pathParam, String queryParam) {
		this.protocol=protocol;
		this.hostname=hostname;
		this.path=path;
		this.pathParam=pathParam;
		this.queryParam=queryParam;
	}
	
	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getpathParam() {
		return pathParam;
	}

	public void setpathParam(String pathParam) {
		this.pathParam = pathParam;
	}

	public String getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}
}
