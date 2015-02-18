package osgi.sample.echo.api;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface Echo {

	void echo(String msg);
	
}
