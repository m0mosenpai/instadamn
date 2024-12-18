package X;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public final class PTU implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C55070OaQ A03;
    public final /* synthetic */ Integer A04;

    public PTU(Bitmap bitmap, C55070OaQ c55070OaQ, Integer num, long j, long j2) {
        this.A03 = c55070OaQ;
        this.A01 = j;
        this.A02 = bitmap;
        this.A00 = j2;
        this.A04 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55070OaQ c55070OaQ = this.A03;
        long j = this.A01;
        C55070OaQ.A00(this.A02, c55070OaQ, this.A04, AbstractC25233BEq.A0p("snapshot_type", "image", AbstractC166987dD.A1L("capture_latency_ms", String.valueOf(this.A00))), j);
    }
}
