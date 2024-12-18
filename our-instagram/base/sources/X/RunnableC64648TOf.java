package X;

import java.util.concurrent.Executor;

/* renamed from: X.TOf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64648TOf implements Runnable {
    public final /* synthetic */ C64264T6n A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC64648TOf(C64264T6n c64264T6n, C5KS c5ks) {
        this.A00 = c64264T6n;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C64264T6n c64264T6n = this.A00;
            C5KS c5ks = (C5KS) c64264T6n.A00.Eq5(this.A01);
            if (c5ks == null) {
                c64264T6n.onFailure(AbstractC166987dD.A15("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC58437PvG.A01;
            c5ks.A04(c64264T6n, executor);
            c5ks.A0B(c64264T6n, executor);
            c5ks.A08(c64264T6n, executor);
        } catch (TXJ e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            C5KS c5ks2 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            c5ks2.A0C(e);
        } catch (Exception e2) {
            this.A00.A01.A0C(e2);
        }
    }
}
