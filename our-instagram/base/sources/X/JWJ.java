package X;

import android.os.Looper;

/* loaded from: classes8.dex */
public final class JWJ implements Runnable {
    public final /* synthetic */ Runnable A00;

    public JWJ(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.A00;
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            AbstractC47142Ksb.A00.post(runnable);
        }
    }
}
