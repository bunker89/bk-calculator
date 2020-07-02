package BKCalculater;

import java.util.Map;

import org.json.JSONObject;

import com.bunker.bkframework.server.framework_api.WorkTrace;
import com.bunker.bkframework.server.working.BKWork;
import com.bunker.bkframework.server.working.WorkConstants;
import com.bunker.bkframework.server.working.Working;
import com.bunker.bkframework.server.working.WorkingResult;

@BKWork(key="plus")
public class Plus implements Working {

	@Override
	public WorkingResult doWork(JSONObject object, Map<String, Object> enviroment, WorkTrace trace) {
		WorkingResult result = new WorkingResult();
		int a = object.getInt("a");
		int b = object.getInt("b");
		result.putReplyParam("result", a + b);
		result.putReplyParam(WorkConstants.WORKING_RESULT, true);
		return result;
	}

	@Override
	public String getName() {
		return "Plus api";
	}

	@Override
	public String getDescription() {
		return "a와 b가 들어오면 합을 반환하는 api";
	}
}