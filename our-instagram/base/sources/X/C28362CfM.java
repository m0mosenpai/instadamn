package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.CfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28362CfM {
    public long A00;
    public final UserFlowLogger A01;
    public final CWR A02;
    public final QuickPerformanceLogger A03;

    public static final void A00(C28362CfM c28362CfM, String str) {
        UserFlowLogger userFlowLogger = c28362CfM.A01;
        if (userFlowLogger != null) {
            userFlowLogger.flowMarkPoint(c28362CfM.A00, str);
        }
    }

    public static final void A01(C28362CfM c28362CfM, String str, String str2) {
        UserFlowLogger userFlowLogger = c28362CfM.A01;
        if (userFlowLogger != null) {
            long j = c28362CfM.A00;
            if (str2 == null) {
                str2 = "unknown";
            }
            userFlowLogger.flowAnnotate(j, str, str2);
        }
    }

    public final void A02(String str) {
        UserFlowLogger userFlowLogger = this.A01;
        if (userFlowLogger != null) {
            userFlowLogger.flowEndCancel(this.A00, str);
        }
        this.A00 = 0L;
    }

    public C28362CfM(CWR cwr) {
        UserFlowLoggerImpl userFlowLoggerImpl;
        this.A02 = cwr;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A03 = qPLInstance;
        if (qPLInstance != null) {
            userFlowLoggerImpl = new UserFlowLoggerImpl(qPLInstance);
        } else {
            userFlowLoggerImpl = null;
        }
        this.A01 = userFlowLoggerImpl;
    }
}
