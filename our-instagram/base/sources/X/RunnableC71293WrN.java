package X;

import android.os.Handler;

/* renamed from: X.WrN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71293WrN implements Runnable {
    public final /* synthetic */ C4XU A00;

    public RunnableC71293WrN(C4XU c4xu) {
        this.A00 = c4xu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4XU c4xu = this.A00;
        C4XU c4xu2 = C4XU.$redex_init_class;
        Handler handler = c4xu.A08;
        if (handler != null) {
            handler.removeCallbacks(c4xu.A0Q);
        }
    }
}
