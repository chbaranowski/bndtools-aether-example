package osgi.sample.echo.api;

import com.google.common.base.Optional;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface Echo {

	void echo(Optional<String> msg);
	
}
