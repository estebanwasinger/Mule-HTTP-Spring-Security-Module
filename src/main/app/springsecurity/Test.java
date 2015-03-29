package springsecurity;

import java.util.HashMap;
import java.util.Map;

import org.jetel.util.crypto.Base64;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class Test implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String authorization = eventContext.getMessage().getProperty("authorization", PropertyScope.INBOUND);
		Map<String,Object> map = new HashMap<String,Object>();
		authorization = new String(Base64.decode(authorization.substring(6)));
		map.put("auth", authorization);
		eventContext.getMessage().addProperties(map, PropertyScope.INVOCATION);
		return eventContext.getMessage().getPayload();
	}

}
