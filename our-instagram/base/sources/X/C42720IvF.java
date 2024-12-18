package X;

/* renamed from: X.IvF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42720IvF implements JHB {
    public final /* synthetic */ C1EN A00;
    public final /* synthetic */ C3FZ A01;
    public final /* synthetic */ C3K4 A02;
    public final /* synthetic */ boolean A03;

    public C42720IvF(C1EN c1en, C3FZ c3fz, C3K4 c3k4, boolean z) {
        this.A02 = c3k4;
        this.A01 = c3fz;
        this.A00 = c1en;
        this.A03 = z;
    }

    @Override // X.JHB
    public final void Dpy(HA1 ha1) {
        if (ha1.A00) {
            C3K4 c3k4 = this.A02;
            boolean A04 = C3K4.A04(this.A00, this.A01, c3k4);
            if (!this.A03) {
                c3k4.A0A.A06(A04);
            }
        }
    }

    @Override // X.JHB
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (!this.A03) {
            this.A02.A0A.A06(false);
        }
    }
}
