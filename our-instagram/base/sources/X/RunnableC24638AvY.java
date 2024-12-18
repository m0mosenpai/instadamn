package X;

/* renamed from: X.AvY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24638AvY implements Runnable {
    public final /* synthetic */ C194488j9 A00;
    public final /* synthetic */ C5SW A01;

    public RunnableC24638AvY(C194488j9 c194488j9, C5SW c5sw) {
        this.A00 = c194488j9;
        this.A01 = c5sw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C194488j9 c194488j9 = this.A00;
        if (!c194488j9.A01) {
            c194488j9.A01 = true;
            this.A01.A06();
        }
    }
}
