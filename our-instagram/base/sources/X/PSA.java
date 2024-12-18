package X;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public final class PSA implements Runnable {
    public final /* synthetic */ C26076Bg5 A00;
    public final /* synthetic */ C8NS A01;
    public final /* synthetic */ C55070OaQ A02;

    public PSA(C26076Bg5 c26076Bg5, C8NS c8ns, C55070OaQ c55070OaQ) {
        this.A02 = c55070OaQ;
        this.A00 = c26076Bg5;
        this.A01 = c8ns;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object A1D;
        C8NS c8ns = this.A01;
        C26076Bg5 c26076Bg5 = this.A00;
        try {
            c8ns.AWx(c26076Bg5);
            A1D = C0eB.A00;
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        C55070OaQ c55070OaQ = this.A02;
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            c55070OaQ.A03.A01(C05F.A0j, null, null, null, null, "Effect burning failed for Feed photo", A00, null, null);
        }
        C55070OaQ.A00((Bitmap) c26076Bg5.A01, c55070OaQ, C05F.A0C, AbstractC25233BEq.A0p("snapshot_type", "image", AbstractC166987dD.A1L("capture_latency_ms", String.valueOf(0L))), 0L);
    }
}
