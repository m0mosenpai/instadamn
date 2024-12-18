package X;

import android.os.Looper;

/* renamed from: X.LzX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49826LzX implements Runnable {
    public final /* synthetic */ Runnable A00;

    public RunnableC49826LzX(Runnable runnable) {
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
