package X;

import android.os.Handler;

/* renamed from: X.9Gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC207529Gf implements Runnable, InterfaceC41801wU {
    public final Handler A00;
    public final Runnable A01;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.run();
        } catch (Throwable th) {
            AbstractC142886co.A02(th);
        }
    }

    public RunnableC207529Gf(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }
}
