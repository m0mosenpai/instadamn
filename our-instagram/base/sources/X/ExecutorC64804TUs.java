package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.TUs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64804TUs implements Executor {
    public final int A00;
    public final Object A01;

    public ExecutorC64804TUs(Handler handler, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = handler;
        } else {
            this.A01 = handler;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.A00) {
            case 0:
            case 2:
                handler = (Handler) this.A01;
                handler.post(runnable);
                return;
            case 1:
                if (C63255SgD.A02()) {
                    runnable.run();
                    return;
                } else {
                    C63255SgD.A01(runnable);
                    return;
                }
            default:
                handler = AbstractC167007dF.A0J();
                handler.post(runnable);
                return;
        }
    }

    public ExecutorC64804TUs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
