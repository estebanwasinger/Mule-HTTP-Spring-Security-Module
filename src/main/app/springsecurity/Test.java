package springsecurity;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Test implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return eventContext.getMessage().getPayload();
	}

}
