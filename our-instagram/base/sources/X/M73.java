package X;

/* loaded from: classes8.dex */
public final class M73 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ C7FG A02;
    public final /* synthetic */ C47Z A03;
    public final /* synthetic */ C183978Ee A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ boolean A06;

    public M73(C26086BgF c26086BgF, C7FG c7fg, C47Z c47z, C183978Ee c183978Ee, Long l, int i, boolean z) {
        this.A02 = c7fg;
        this.A04 = c183978Ee;
        this.A00 = i;
        this.A06 = z;
        this.A03 = c47z;
        this.A01 = c26086BgF;
        this.A05 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7FA c7fa = this.A02.A03;
        C183978Ee c183978Ee = this.A04;
        int i = this.A00;
        boolean z = this.A06;
        c7fa.DYV(this.A01, null, this.A03, c183978Ee, this.A05, i, z);
    }
}
