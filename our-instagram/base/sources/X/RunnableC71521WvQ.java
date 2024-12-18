package X;

import android.os.PerformanceHintManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WvQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71521WvQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public RunnableC71521WvQ(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PerformanceHintManager A00 = WDB.A00();
        if (A00 != null) {
            int i = this.A00;
            A00.createHintSession(new int[]{this.A01}, TimeUnit.MINUTES.toNanos(i));
        }
    }
}
