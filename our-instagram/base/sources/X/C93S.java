package X;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.93S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93S {
    public static final C25051Kj A02 = new C25051Kj(C93S.class);
    public C127485pR A00;
    public boolean A01;

    public final void A01() {
        synchronized (this) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            C127485pR c127485pR = this.A00;
            C127485pR c127485pR2 = null;
            this.A00 = null;
            while (c127485pR != null) {
                C127485pR c127485pR3 = c127485pR.A00;
                c127485pR.A00 = c127485pR2;
                c127485pR2 = c127485pR;
                c127485pR = c127485pR3;
            }
            while (c127485pR2 != null) {
                A00(c127485pR2.A01, c127485pR2.A02);
                c127485pR2 = c127485pR2.A00;
            }
        }
    }

    public final void A02(Runnable runnable, Executor executor) {
        C18C.A07(runnable, "Runnable was null.");
        C18C.A07(executor, "Executor was null.");
        synchronized (this) {
            if (!this.A01) {
                this.A00 = new C127485pR(this.A00, runnable, executor);
            } else {
                A00(runnable, executor);
            }
        }
    }

    public static void A00(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger A00 = A02.A00();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC111324zv.A00(3738));
            sb.append(runnable);
            sb.append(AbstractC111324zv.A00(3342));
            sb.append(executor);
            A00.log(level, sb.toString(), (Throwable) e);
        }
    }
}
