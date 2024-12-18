package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class L8A {
    public final /* synthetic */ LGS A00;
    public final /* synthetic */ C47218Ktr A01;
    public final /* synthetic */ C47940LFq A02;
    public final /* synthetic */ C47504KyX A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public final void A00(Throwable th) {
        C14360o3.A0B(th, 0);
        LGS lgs = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lgs.A01;
        int i = lgs.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "begin_register_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "begin_register_network_call_error", message, 1021652080, i);
        C47940LFq.A00(this.A02, C05F.A0Y, null, th);
    }

    public L8A(LGS lgs, C47218Ktr c47218Ktr, C47940LFq c47940LFq, C47504KyX c47504KyX, Integer num, String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        this.A00 = lgs;
        this.A01 = c47218Ktr;
        this.A04 = num;
        this.A07 = str;
        this.A05 = str2;
        this.A03 = c47504KyX;
        this.A09 = bArr;
        this.A08 = bArr2;
        this.A06 = str3;
        this.A02 = c47940LFq;
    }
}
