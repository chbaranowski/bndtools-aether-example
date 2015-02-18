package osgi.sample.echo.provider;

import com.google.common.base.Optional;

import osgi.sample.echo.api.Echo;
import aQute.bnd.annotation.component.Component;

@Component
public class EchoComponent implements Echo {

	@Override
	public void echo(Optional<String> msg) {
		System.out.println(msg.get());
	}

}
