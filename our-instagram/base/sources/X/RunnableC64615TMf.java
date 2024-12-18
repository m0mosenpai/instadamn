package X;

import androidx.work.Worker;

/* renamed from: X.TMf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64615TMf implements Runnable {
    public final /* synthetic */ Worker A00;
    public final /* synthetic */ C49182Nr A01;

    public RunnableC64615TMf(final Worker this$0, final C49182Nr val$future) {
        this.A00 = this$0;
        this.A01 = val$future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.getForegroundInfo();
            throw C00O.createAndThrow();
        } catch (Throwable th) {
            this.A01.A08(th);
        }
    }
}
