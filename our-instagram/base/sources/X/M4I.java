package X;

import android.content.IntentFilter;

/* loaded from: classes8.dex */
public final class M4I implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26141Ov A01;

    public M4I(C26141Ov c26141Ov, long j) {
        this.A01 = c26141Ov;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26141Ov c26141Ov = this.A01;
        long j = this.A00;
        IntentFilter intentFilter = C26141Ov.A0W;
        c26141Ov.A0G.decrementAndGet();
        C26141Ov.A07(c26141Ov, "onMutationSent", j);
    }
}
