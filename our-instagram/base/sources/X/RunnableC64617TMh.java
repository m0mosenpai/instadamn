package X;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.TMh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64617TMh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SystemForegroundService A01;

    public RunnableC64617TMh(final SystemForegroundService this$0, final int val$notificationId) {
        this.A01 = this$0;
        this.A00 = val$notificationId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.cancel(this.A00);
    }
}
