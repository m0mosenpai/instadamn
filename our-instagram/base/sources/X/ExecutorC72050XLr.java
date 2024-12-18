package X;

import java.util.concurrent.Executor;

/* renamed from: X.XLr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC72050XLr implements Executor {
    public final int A00;

    public ExecutorC72050XLr(int i) {
        this.A00 = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A00) {
            case 0:
                C72051XLs.A00().A02(runnable);
                return;
            case 1:
                C72051XLs.A00().A01(runnable);
                return;
            case 2:
                C63375Sim.A02().post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
