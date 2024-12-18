package X;

import java.util.concurrent.Executor;

/* renamed from: X.Aui, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24587Aui implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ Executor A01;

    public RunnableC24587Aui(Runnable runnable, Executor executor) {
        this.A01 = executor;
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.execute(this.A00);
    }
}
