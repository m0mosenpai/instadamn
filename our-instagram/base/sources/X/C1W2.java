package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1W2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W2 extends C1W3 {
    public static C1W2 A00;

    public static C1W2 A00() {
        C1W2 c1w2 = A00;
        if (c1w2 == null) {
            C1W2 c1w22 = new C1W2();
            A00 = c1w22;
            return c1w22;
        }
        return c1w2;
    }

    public C1W2() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override // X.C1W3, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.A00.getLooper().getThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
