package X;

import android.content.IntentFilter;

/* loaded from: classes8.dex */
public final class JUF implements Runnable {
    public final /* synthetic */ C26141Ov A00;

    public JUF(C26141Ov c26141Ov) {
        this.A00 = c26141Ov;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26141Ov c26141Ov = this.A00;
        IntentFilter intentFilter = C26141Ov.A0W;
        c26141Ov.A0G.decrementAndGet();
        C26141Ov.A07(c26141Ov, "onMutationSent", 0L);
    }
}
