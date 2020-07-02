package BKCalculater;

import java.util.Map;

import org.json.JSONObject;

import com.bunker.bkframework.server.framework_api.WorkTrace;
import com.bunker.bkframework.server.working.BKWork;
import com.bunker.bkframework.server.working.Jsonparam;
import com.bunker.bkframework.server.working.WorkConstants;
import com.bunker.bkframework.server.working.Working;
import com.bunker.bkframework.server.working.WorkingResult;

@BKWork(key="login", isPublic = false)
public class Login implements Working {
	String privateKey;
	
	@Jsonparam public void jsonInjection(JSONObject json) {
		privateKey = json.getString("private_key");
	}
	
	@Override
	public WorkingResult doWork(JSONObject object, Map<String, Object> enviroment, WorkTrace trace) {
		WorkingResult result = new WorkingResult();
		System.out.println("프라이빗키:" + privateKey);
		result.putPrivateParam("user_id_private_field", "영수");
		result.putReplyParam(WorkConstants.WORKING_RESULT, true);
		return result;
	}
	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}
}