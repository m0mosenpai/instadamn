package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* loaded from: classes9.dex */
public final class OId {
    public Long A00;
    public String A01;
    public final UserFlowLoggerImpl A02 = new UserFlowLoggerImpl(C006802i.A0p);

    public final void A00(boolean z, boolean z2, boolean z3) {
        Long l = this.A00;
        if (l != null) {
            this.A02.flowDrop(l.longValue());
            this.A00 = null;
            this.A01 = null;
        }
        UserFlowLoggerImpl userFlowLoggerImpl = this.A02;
        long flowStartForMarker = userFlowLoggerImpl.flowStartForMarker(29233791, "IG_RTC_CALL_STARTUP", false);
        userFlowLoggerImpl.flowAnnotate(flowStartForMarker, "is_initiate", z);
        userFlowLoggerImpl.flowAnnotate(flowStartForMarker, "with_video", z2);
        userFlowLoggerImpl.flowAnnotate(flowStartForMarker, "is_first_call", AbstractC53600Nn7.A00);
        userFlowLoggerImpl.flowAnnotate(flowStartForMarker, "native_libs_loaded", z3);
        userFlowLoggerImpl.flowMarkPoint(flowStartForMarker, "call_start");
        this.A00 = Long.valueOf(flowStartForMarker);
        AbstractC53600Nn7.A00 = false;
    }
}
