package osgi.sample.echo.consumer;

import osgi.sample.echo.api.Echo;
import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

@Component
public class EchoConsumer {

	private Echo echo;
	
	@Activate
	void start() {
		echo.echo("Hello OSGi World!");
	}

	@Reference
	public void setEcho(Echo echo) {
		this.echo = echo;
	}
	
}
