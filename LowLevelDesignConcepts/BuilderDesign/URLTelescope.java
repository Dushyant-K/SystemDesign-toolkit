package BuilderDesign;

public class URLTelescope {
	private String protocol;
	private String hostname;
	private String path;
	private String pathParam;
	private String queryParam;
	
    public URLTelescope() {
    	
	}
	
	public URLTelescope(String protocol) {
		this.protocol=protocol;
	}
	
	public URLTelescope(String protocol, String hostname) {
		this(protocol);
		this.hostname=hostname;
	}
	
	public URLTelescope(String protocol, String hostname, String path) {
	    this(protocol,hostname);
		this.path=path;
	}
	
	public URLTelescope(String protocol, String hostname, String path, String pathParam) {
		this(protocol,hostname,path);
		this.pathParam=pathParam;
	}
	
	public URLTelescope(String protocol, String hostname, String path, String pathParam, String queryParam) {
		this(protocol,hostname,path,pathParam);
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

	public String getPathParam() {
		return pathParam;
	}

	public void setPathParam(String pathParam) {
		this.pathParam = pathParam;
	}

	public String getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}
	
	
}
