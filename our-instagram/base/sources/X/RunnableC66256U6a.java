package X;

/* renamed from: X.U6a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66256U6a implements Runnable {
    public final /* synthetic */ C135266Ab A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ AnonymousClass630 A02;
    public final /* synthetic */ C1339162z A03;
    public final /* synthetic */ C140076Vl A04;
    public final /* synthetic */ boolean A05;

    public RunnableC66256U6a(C135266Ab c135266Ab, C6FG c6fg, AnonymousClass630 anonymousClass630, C1339162z c1339162z, C140076Vl c140076Vl, boolean z) {
        this.A05 = z;
        this.A03 = c1339162z;
        this.A02 = anonymousClass630;
        this.A04 = c140076Vl;
        this.A01 = c6fg;
        this.A00 = c135266Ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A05;
        if (z) {
            C1LN.A01("WarmupSignals:mount");
        }
        try {
            try {
                this.A02.A0H(this.A04, -1);
                C131555wr c131555wr = new C131555wr(this.A01.A00);
                c131555wr.setRenderTree(this.A00.A01);
                c131555wr.A0P(true, 0, 0, 100, 100);
            } catch (Exception e) {
                AbstractC25241Le.A00(this.A01, AbstractC111324zv.A00(1863), "Failed to warmup signals mount", e);
            }
        } finally {
            if (z) {
                C1LN.A00();
            }
        }
    }
}
