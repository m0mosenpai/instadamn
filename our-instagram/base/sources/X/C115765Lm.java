package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115765Lm {
    public static C115765Lm A03;
    public Runnable A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public final void A00() {
        Runnable runnable;
        if (this.A01 && (runnable = this.A00) != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = false;
        }
    }
}
