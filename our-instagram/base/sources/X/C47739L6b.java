package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.L6b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47739L6b {
    public final /* synthetic */ LGS A00;
    public final /* synthetic */ C47940LFq A01;

    public final void A00(Throwable th) {
        C14360o3.A0B(th, 0);
        LGS lgs = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lgs.A01;
        int i = lgs.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "finish_register_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "finish_register_network_call_error", message, 1021652080, i);
        C47940LFq.A00(this.A01, C05F.A0Y, null, th);
    }

    public C47739L6b(LGS lgs, C47940LFq c47940LFq) {
        this.A00 = lgs;
        this.A01 = c47940LFq;
    }
}
