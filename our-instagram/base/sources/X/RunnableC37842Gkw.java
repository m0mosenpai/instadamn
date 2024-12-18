package X;

/* renamed from: X.Gkw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37842Gkw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C37546Gg2 A01;
    public final /* synthetic */ C62a A02;

    public RunnableC37842Gkw(C37546Gg2 c37546Gg2, C62a c62a, int i) {
        this.A01 = c37546Gg2;
        this.A02 = c62a;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37546Gg2 c37546Gg2 = this.A01;
        c37546Gg2.A07.A07(c37546Gg2.A08, this.A02, this.A00);
    }
}
