package X;

/* renamed from: X.LVg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48206LVg implements MPT {
    public final /* synthetic */ MPT A00;
    public final /* synthetic */ L2G A01;

    public C48206LVg(MPT mpt, L2G l2g) {
        this.A01 = l2g;
        this.A00 = mpt;
    }

    @Override // X.MPT
    public final void Dpn(C46506Ki5 c46506Ki5) {
        this.A00.Dpn(c46506Ki5);
    }

    @Override // X.MPT
    public final void onFailure(Throwable th) {
        this.A01.A01.A04();
        this.A00.onFailure(th);
    }
}
