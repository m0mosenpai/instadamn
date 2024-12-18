package X;

import android.os.StrictMode;

/* loaded from: classes10.dex */
public final class TN2 implements Runnable {
    public final /* synthetic */ TVE A00;
    public final /* synthetic */ Runnable A01;

    public TN2(TVE tve, Runnable runnable) {
        this.A00 = tve;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A01) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.A01.run();
        } catch (Throwable th) {
            if (android.util.Log.isLoggable("GlideExecutor", 6)) {
                android.util.Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
