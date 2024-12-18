package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class L81 {
    public final /* synthetic */ LGS A00;
    public final /* synthetic */ C47218Ktr A01;
    public final /* synthetic */ C47940LFq A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void A00(Throwable th) {
        C14360o3.A0B(th, 0);
        LGS lgs = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lgs.A01;
        int i = lgs.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "init_register_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "init_register_network_call_error", message, 1021652080, i);
        C47940LFq.A00(this.A02, C05F.A0Y, null, th);
    }

    public L81(LGS lgs, C47218Ktr c47218Ktr, C47940LFq c47940LFq, Integer num, String str, String str2, String str3, String str4) {
        this.A00 = lgs;
        this.A02 = c47940LFq;
        this.A01 = c47218Ktr;
        this.A03 = num;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }
}
