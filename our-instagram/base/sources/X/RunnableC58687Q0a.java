package X;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.Q0a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58687Q0a implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ SystemForegroundService A02;

    public RunnableC58687Q0a(final Notification this$0, final SystemForegroundService val$notificationId, final int val$notification) {
        this.A02 = val$notificationId;
        this.A00 = val$notification;
        this.A01 = this$0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A00.notify(this.A00, this.A01);
    }
}
