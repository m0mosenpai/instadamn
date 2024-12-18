package X;

import java.util.concurrent.Executor;

/* renamed from: X.1D5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D5 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        C14120nc.A00().ATO(new AbstractRunnableC18200v5() { // from class: X.1Sh
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(11, 3, true, true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }
}
