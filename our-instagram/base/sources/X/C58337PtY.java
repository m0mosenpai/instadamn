package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.PtY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58337PtY extends AbstractC002400o {
    public final Object A00 = AbstractC58318PtA.A0b();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new ThreadFactoryC58338PtZ(this));
    public volatile Handler A02;

    @Override // X.AbstractC002400o
    public final void A01(Runnable runnable) {
        this.A01.execute(runnable);
    }

    @Override // X.AbstractC002400o
    public final void A02(Runnable runnable) {
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    this.A02 = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        this.A02.post(runnable);
    }

    @Override // X.AbstractC002400o
    public final boolean A03() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return false;
        }
        return true;
    }
}
