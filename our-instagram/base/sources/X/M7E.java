package X;

/* loaded from: classes8.dex */
public final class M7E implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ C7FG A02;
    public final /* synthetic */ C211689Zc A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ boolean A07;

    public M7E(C26086BgF c26086BgF, C7FG c7fg, C211689Zc c211689Zc, C47Z c47z, C183978Ee c183978Ee, Long l, int i, boolean z) {
        this.A02 = c7fg;
        this.A05 = c183978Ee;
        this.A00 = i;
        this.A07 = z;
        this.A04 = c47z;
        this.A03 = c211689Zc;
        this.A01 = c26086BgF;
        this.A06 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7FA c7fa = this.A02.A03;
        C183978Ee c183978Ee = this.A05;
        int i = this.A00;
        boolean z = this.A07;
        C47Z c47z = this.A04;
        c7fa.DYV(this.A01, this.A03, c47z, c183978Ee, this.A06, i, z);
    }
}
