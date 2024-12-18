package X;

import java.util.List;

/* renamed from: X.M6u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50031M6u implements Runnable {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C7FG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public RunnableC50031M6u(C26086BgF c26086BgF, C7FG c7fg, Long l, List list, boolean z, boolean z2) {
        this.A01 = c7fg;
        this.A03 = list;
        this.A04 = z;
        this.A00 = c26086BgF;
        this.A02 = l;
        this.A05 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7FG.A02(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }
}
