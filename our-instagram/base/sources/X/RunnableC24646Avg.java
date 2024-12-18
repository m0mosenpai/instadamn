package X;

/* renamed from: X.Avg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24646Avg implements Runnable {
    public final /* synthetic */ C189838b2 A00;
    public final /* synthetic */ C189788ax A01;

    public RunnableC24646Avg(C189838b2 c189838b2, C189788ax c189788ax) {
        this.A01 = c189788ax;
        this.A00 = c189838b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189788ax c189788ax = this.A01;
        if (C189788ax.A0F(c189788ax)) {
            C189788ax.A0A(c189788ax, c189788ax.A02);
        }
        c189788ax.A0C.A00().A07(this.A00);
    }
}
