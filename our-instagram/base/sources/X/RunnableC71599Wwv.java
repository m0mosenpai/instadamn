package X;

/* renamed from: X.Wwv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71599Wwv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C55176Odf A01;
    public final /* synthetic */ VDT A02;
    public final /* synthetic */ C66286U7h A03;

    public RunnableC71599Wwv(C55176Odf c55176Odf, VDT vdt, C66286U7h c66286U7h, int i) {
        this.A03 = c66286U7h;
        this.A02 = vdt;
        this.A00 = i;
        this.A01 = c55176Odf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A00.Dk7(this.A01, this.A02, this.A00);
    }
}
