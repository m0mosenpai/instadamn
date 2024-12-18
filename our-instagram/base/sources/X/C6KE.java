package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.6KE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6KE {
    public static C6KE A01;
    public long A00 = 0;

    public void A01() {
        C6KF c6kf = (C6KF) this;
        c6kf.A00.flowEndSuccess(((C6KE) c6kf).A00);
        ((C6KE) c6kf).A00 = 0L;
    }

    public void A02() {
        C6KF c6kf = (C6KF) this;
        if (((C6KE) c6kf).A00 == 0) {
            UserFlowLogger userFlowLogger = c6kf.A00;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(132191320);
            ((C6KE) c6kf).A00 = generateNewFlowId;
            userFlowLogger.flowStartIfNotOngoing(generateNewFlowId, new UserFlowConfig("msys_bootstrap_pre_logger", false));
        }
    }

    public void A03(String str) {
        C6KF c6kf = (C6KF) this;
        c6kf.A00.flowEndFail(((C6KE) c6kf).A00, str, null);
        ((C6KE) c6kf).A00 = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6KF, X.6KE] */
    public static synchronized C6KE A00(UserFlowLogger userFlowLogger) {
        C6KE c6ke;
        C6KE c6ke2;
        synchronized (C6KE.class) {
            C6KE c6ke3 = A01;
            c6ke = c6ke3;
            if (c6ke3 == null) {
                if (userFlowLogger == null) {
                    c6ke2 = new C6KE();
                } else {
                    ?? c6ke4 = new C6KE();
                    c6ke4.A00 = userFlowLogger;
                    c6ke2 = c6ke4;
                }
                A01 = c6ke2;
                c6ke = c6ke2;
            }
        }
        return c6ke;
    }
}
