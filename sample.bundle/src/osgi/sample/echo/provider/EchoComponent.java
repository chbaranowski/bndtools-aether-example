package osgi.sample.echo.provider;

import osgi.sample.echo.api.Echo;
import aQute.bnd.annotation.component.Component;

@Component
public class EchoComponent implements Echo {

	@Override
	public void echo(String msg) {
		System.out.println(msg);
	}

}
