package X;

import android.content.Intent;
import java.util.concurrent.Executor;

/* renamed from: X.TRh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64725TRh implements Runnable {
    public final int A00;
    public final Intent A01;
    public final C63650SrG A02;

    public static void A00(Intent intent, C63650SrG c63650SrG, Executor executor, int i) {
        executor.execute(new RunnableC64725TRh(intent, c63650SrG, i));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A02(this.A01, this.A00);
    }

    public RunnableC64725TRh(Intent dispatcher, C63650SrG intent, int startId) {
        this.A02 = intent;
        this.A01 = dispatcher;
        this.A00 = startId;
    }
}
