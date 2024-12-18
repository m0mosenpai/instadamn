package X;

/* renamed from: X.TOw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64665TOw implements Runnable {
    public final /* synthetic */ C64446TEg A00;
    public final /* synthetic */ SO9 A01;

    public RunnableC64665TOw(C64446TEg c64446TEg, SO9 so9) {
        this.A00 = c64446TEg;
        this.A01 = so9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64446TEg c64446TEg = this.A00;
        if (!c64446TEg.A00) {
            c64446TEg.A00 = true;
            this.A01.A00();
        }
    }
}
