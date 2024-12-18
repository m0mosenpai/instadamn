package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XqK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72885XqK {
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.facebook.rsys.log.gen.CallSummaryInfo$Builder] */
    public static final CallSummaryInfo.Builder A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ?? obj = new Object();
        obj.localCallId = jSONObject.getString("localCallId");
        obj.sharedCallId = (String) A01("sharedCallId", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.systemTime = jSONObject.getLong("systemTime");
        obj.steadyTime = jSONObject.getLong("steadyTime");
        obj.callCreatedTime = jSONObject.getLong("callCreatedTime");
        Class cls = Long.TYPE;
        obj.engineCreatedTime = (Long) A01("engineCreatedTime", AbstractC25225BEi.A1D(cls), jSONObject);
        obj.callAnsweredTime = jSONObject.getLong("callAnsweredTime");
        obj.callConnectedTime = jSONObject.getLong("callConnectedTime");
        obj.callEndedTime = jSONObject.getLong("callEndedTime");
        obj.joinableCompleteTime = (Long) A01("joinableCompleteTime", AbstractC25225BEi.A1D(cls), jSONObject);
        obj.lastUpdatedTime = jSONObject.getLong("lastUpdatedTime");
        obj.callTrigger = jSONObject.getString("callTrigger");
        obj.isCaller = jSONObject.getBoolean("isCaller");
        obj.peerId = (String) A01("peerId", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.endCallReason = (String) A01("endCallReason", AbstractC25225BEi.A1D(String.class), jSONObject);
        Class cls2 = Boolean.TYPE;
        obj.remoteEnded = (Boolean) A01("remoteEnded", AbstractC25225BEi.A1D(cls2), jSONObject);
        obj.inviteRequestedVideo = (Boolean) A01("inviteRequestedVideo", AbstractC25225BEi.A1D(cls2), jSONObject);
        Class cls3 = Long.TYPE;
        obj.mediaGateBlockedFrameCount = (Long) A01("mediaGateBlockedFrameCount", AbstractC25225BEi.A1D(cls3), jSONObject);
        obj.videoEscalationStatus = (String) A01("videoEscalationStatus", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.localVideoDuration = (Long) A01("localVideoDuration", AbstractC25225BEi.A1D(cls3), jSONObject);
        obj.remoteVideoDuration = (Long) A01("remoteVideoDuration", AbstractC25225BEi.A1D(cls3), jSONObject);
        obj.batteryStartLevel = (Long) A01("batteryStartLevel", AbstractC25225BEi.A1D(cls3), jSONObject);
        obj.batteryEndLevel = (Long) A01("batteryEndLevel", AbstractC25225BEi.A1D(cls3), jSONObject);
        Class cls4 = Boolean.TYPE;
        obj.wasDeviceCharged = (Boolean) A01("wasDeviceCharged", AbstractC25225BEi.A1D(cls4), jSONObject);
        obj.joiningContext = (String) A01("joiningContext", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.webDeviceId = (String) A01("webDeviceId", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.endCallSubreason = (String) A01("endCallSubreason", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.coldStartReason = (String) A01("coldStartReason", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.isConnectedEnd = (Boolean) A01("isConnectedEnd", AbstractC25225BEi.A1D(cls4), jSONObject);
        Class cls5 = Long.TYPE;
        obj.deviceShutdownTime = (Long) A01("deviceShutdownTime", AbstractC25225BEi.A1D(cls5), jSONObject);
        obj.maxConcurrentConnectedParticipant = (Long) A01("maxConcurrentConnectedParticipant", AbstractC25225BEi.A1D(cls5), jSONObject);
        obj.rtcActorId = (Long) A01("rtcActorId", AbstractC25225BEi.A1D(cls5), jSONObject);
        obj.autoRejoinCount = (Long) A01("autoRejoinCount", AbstractC25225BEi.A1D(cls5), jSONObject);
        obj.joinMode = (String) A01("joinMode", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.autoRejoinSuccessfulCount = (Long) A01("autoRejoinSuccessfulCount", AbstractC25225BEi.A1D(cls5), jSONObject);
        obj.webrtcVersion = (String) A01("webrtcVersion", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.clientSessionId = (String) A01("clientSessionId", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.endCallAppState = (String) A01("endCallAppState", AbstractC25225BEi.A1D(String.class), jSONObject);
        obj.isAutomation = (Boolean) A01("isAutomation", AbstractC25225BEi.A1D(Boolean.TYPE), jSONObject);
        return obj;
    }

    public static final Object A01(String str, InterfaceC16510rw interfaceC16510rw, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            if (interfaceC16510rw.equals(AbstractC25225BEi.A1D(Long.TYPE))) {
                return Long.valueOf(jSONObject.getLong(str));
            }
            if (interfaceC16510rw.equals(AbstractC25225BEi.A1D(ArrayList.class))) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                ArrayList A1E = AbstractC166987dD.A1E();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    A1E.add(jSONArray.getString(i));
                }
                return A1E;
            }
            return jSONObject.get(str);
        }
        return null;
    }
}
