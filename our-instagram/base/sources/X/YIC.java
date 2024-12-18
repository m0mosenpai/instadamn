package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class YIC implements Runnable {
    public final /* synthetic */ SW0 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public YIC(SW0 sw0, Object obj, String str) {
        this.A00 = sw0;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00 = AbstractC58317Pt9.A00(458);
        SW0 sw0 = this.A00;
        Object obj = this.A01;
        if (obj instanceof CallSummaryInfo) {
            String A002 = AbstractC58317Pt9.A00(237);
            try {
                File A003 = SW0.A00(sw0, this.A02);
                if (A003 != null) {
                    CallSummaryInfo callSummaryInfo = (CallSummaryInfo) obj;
                    C14360o3.A0B(callSummaryInfo, 0);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("localCallId", callSummaryInfo.localCallId);
                    jSONObject.put("sharedCallId", callSummaryInfo.sharedCallId);
                    jSONObject.put("systemTime", callSummaryInfo.systemTime);
                    jSONObject.put("steadyTime", callSummaryInfo.steadyTime);
                    jSONObject.put("callCreatedTime", callSummaryInfo.callCreatedTime);
                    jSONObject.put("engineCreatedTime", callSummaryInfo.engineCreatedTime);
                    jSONObject.put("callAnsweredTime", callSummaryInfo.callAnsweredTime);
                    jSONObject.put("callConnectedTime", callSummaryInfo.callConnectedTime);
                    jSONObject.put("callEndedTime", callSummaryInfo.callEndedTime);
                    jSONObject.put("joinableCompleteTime", callSummaryInfo.joinableCompleteTime);
                    jSONObject.put("lastUpdatedTime", callSummaryInfo.lastUpdatedTime);
                    jSONObject.put("callTrigger", callSummaryInfo.callTrigger);
                    jSONObject.put("isCaller", callSummaryInfo.isCaller);
                    jSONObject.put("peerId", callSummaryInfo.peerId);
                    jSONObject.put("endCallReason", callSummaryInfo.endCallReason);
                    jSONObject.put("remoteEnded", callSummaryInfo.remoteEnded);
                    jSONObject.put("inviteRequestedVideo", callSummaryInfo.inviteRequestedVideo);
                    jSONObject.put("mediaGateBlockedFrameCount", callSummaryInfo.mediaGateBlockedFrameCount);
                    jSONObject.put("videoEscalationStatus", callSummaryInfo.videoEscalationStatus);
                    jSONObject.put("localVideoDuration", callSummaryInfo.localVideoDuration);
                    jSONObject.put("remoteVideoDuration", callSummaryInfo.remoteVideoDuration);
                    jSONObject.put("batteryStartLevel", callSummaryInfo.batteryStartLevel);
                    jSONObject.put("batteryEndLevel", callSummaryInfo.batteryEndLevel);
                    jSONObject.put("wasDeviceCharged", callSummaryInfo.wasDeviceCharged);
                    jSONObject.put("joiningContext", callSummaryInfo.joiningContext);
                    jSONObject.put("webDeviceId", callSummaryInfo.webDeviceId);
                    jSONObject.put("endCallSubreason", callSummaryInfo.endCallSubreason);
                    jSONObject.put("coldStartReason", callSummaryInfo.coldStartReason);
                    jSONObject.put("isConnectedEnd", callSummaryInfo.isConnectedEnd);
                    jSONObject.put("deviceShutdownTime", callSummaryInfo.deviceShutdownTime);
                    jSONObject.put("maxConcurrentConnectedParticipant", callSummaryInfo.maxConcurrentConnectedParticipant);
                    jSONObject.put("rtcActorId", callSummaryInfo.rtcActorId);
                    jSONObject.put("autoRejoinCount", callSummaryInfo.autoRejoinCount);
                    jSONObject.put("joinMode", callSummaryInfo.joinMode);
                    jSONObject.put("autoRejoinSuccessfulCount", callSummaryInfo.autoRejoinSuccessfulCount);
                    jSONObject.put("webrtcVersion", callSummaryInfo.webrtcVersion);
                    jSONObject.put("clientSessionId", callSummaryInfo.clientSessionId);
                    jSONObject.put("endCallAppState", callSummaryInfo.endCallAppState);
                    jSONObject.put("isAutomation", callSummaryInfo.isAutomation);
                    String obj2 = jSONObject.toString();
                    C14360o3.A07(obj2);
                    AbstractC57194Pae.A07(A003, obj2, C15W.A05);
                    return;
                }
                return;
            } catch (Exception e) {
                C0K8.A0C(A00, AnonymousClass001.A0i("Error persisting ", A002, e.getMessage(), '\n'));
                return;
            }
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(1672));
    }
}
