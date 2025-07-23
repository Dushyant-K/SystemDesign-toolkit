package BuilderDesign;

public class URLBuilder {
	public static class Builder{
		private String protocol;
		private String hostname;
		private String path;
		private String pathParam;
		private String queryParam;
		
		public Builder protocol(String protocol) {
			this.protocol=protocol;
			return this;
		}
		
		public Builder hostname(String hostname) {
			this.hostname=hostname;
			return this;
		}
		
		public Builder path(String path) {
			this.path=path;
			return this;
		}
		
		public Builder pathParam(String pathParam) {
			this.pathParam=pathParam;
			return this;
		}
		
		public Builder queryParam(String queryParam) {
			this.queryParam=queryParam;
			return this;
		}
		
		public URLBuilder build() {
			return new URLBuilder(this);
		}
	}
	public final String protocol;
	public final String hostname;
	public final String path;
	public final String pathParam;
	public final String queryParam;
	
	private URLBuilder(Builder builder) {
		this.protocol=builder.protocol;
		this.hostname=builder.hostname;
		this.path=builder.path;
		this.pathParam=builder.pathParam;
		this.queryParam=builder.queryParam;
	}
}
