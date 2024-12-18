package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.TNp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64633TNp implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ boolean A01;

    public RunnableC64633TNp(Activity activity, boolean z) {
        this.A00 = activity;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.A00.getWindow();
        if (window != null) {
            AbstractC62175S0w.A00(window, this.A01);
        }
    }
}
