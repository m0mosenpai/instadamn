package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OWM {
    public static boolean A00;
    public static final long A01;
    public static final UserFlowLogger A02;
    public static final OWM A03 = new Object();
    public static final Map A04;
    public static final UserFlowConfig A05;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OWM, java.lang.Object] */
    static {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C006802i.A0p);
        A02 = userFlowLoggerImpl;
        A05 = new UserFlowConfig("CALL_SETUP", false);
        A01 = userFlowLoggerImpl.generateFlowId(29229058, 0);
        A04 = AbstractC166987dD.A1I();
    }

    public final void A00(Integer num, boolean z) {
        String str;
        UserFlowLogger userFlowLogger = A02;
        long j = A01;
        userFlowLogger.flowStart(j, A05);
        A04.clear();
        if (!A00) {
            userFlowLogger.flowAnnotate(j, "is_cold", true);
            A00 = true;
        } else {
            userFlowLogger.flowAnnotate(j, "is_cold", false);
        }
        if (num.intValue() != 0) {
            str = "INCOMING";
        } else {
            str = "OUTGOING";
        }
        userFlowLogger.flowAnnotate(j, "call_direction", str);
        userFlowLogger.flowAnnotate(j, "with_video", z);
    }

    public final void A01(String str) {
        String str2;
        UserFlowLogger userFlowLogger = A02;
        long j = A01;
        Map map = A04;
        Object obj = map.get(str);
        if (obj == null) {
            obj = AbstractC25227BEk.A0p();
        }
        int A0H = AbstractC166987dD.A0H(obj);
        if (A0H != 0) {
            str2 = AnonymousClass001.A0G(str, '-', A0H);
        } else {
            str2 = str;
        }
        AbstractC37301Gc2.A1T(str, map, A0H + 1);
        userFlowLogger.flowMarkPoint(j, str2);
    }
}
