package X;

import android.app.Activity;

/* renamed from: X.Awc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24696Awc implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C5SW A01;

    public RunnableC24696Awc(Activity activity, C5SW c5sw) {
        this.A00 = activity;
        this.A01 = c5sw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A06();
        }
    }
}
