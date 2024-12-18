package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.1Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24821Ja extends AbstractC208410g {
    public static final UserFlowConfig.UserFlowConfigBuilder A01;
    public UserFlowLogger A00;

    @Override // X.C0Xc
    public final String getName() {
        return "ar_sys_resource";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerAnnotate(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            boolean equals = c0xx.BLJ().equals("cp_low_on_memory");
            long generateFlowId = userFlowLogger.generateFlowId(16323880, c0xx.BIb());
            String BLJ = c0xx.BLJ();
            String BLK = c0xx.BLK();
            if (equals) {
                if (BLK != null) {
                    userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, BLJ, BLK);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (BLK != null) {
                userFlowLogger.flowAnnotate(generateFlowId, BLJ, BLK);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerDrop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        onMarkerStop(c0xx);
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowStart(userFlowLogger.generateFlowId(16323880, c0xx.BIb()), A01.build());
            userFlowLogger.flowAnnotateWithCrucialData(userFlowLogger.generateFlowId(16323880, c0xx.BIb()), "ann_zero", "true");
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            long generateFlowId = userFlowLogger.generateFlowId(16323880, c0xx.BIb());
            short BLD = c0xx.BLD();
            if (BLD != 2 && BLD != 10294) {
                if (BLD == 3) {
                    String Ac1 = c0xx.Ac1(TraceFieldType.Error);
                    if (Ac1 == null) {
                        Ac1 = "AR_SESSION Failed";
                    }
                    userFlowLogger.flowEndFail(generateFlowId, Ac1, null);
                    return;
                }
                if (BLD != 4 && BLD != 4340 && BLD != 630) {
                    return;
                }
                String Ac12 = c0xx.Ac1("cancel_reason");
                if (Ac12 == null) {
                    Ac12 = "AR_SESSION Cancelled";
                }
                userFlowLogger.flowEndCancel(generateFlowId, Ac12);
                return;
            }
            userFlowLogger.flowEndSuccess(generateFlowId);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        C14360o3.A0B(quickPerformanceLogger, 0);
        this.A00 = new UserFlowLoggerImpl(quickPerformanceLogger, true);
    }

    static {
        UserFlowConfig.UserFlowConfigBuilder userFlowConfigBuilder = new UserFlowConfig.UserFlowConfigBuilder("arfx", false);
        userFlowConfigBuilder.mTtlMs = 3600000L;
        A01 = userFlowConfigBuilder;
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        if (this.A00 == null) {
            return C06650Xb.A03;
        }
        return new C06650Xb(new int[]{16321564}, null);
    }
}
