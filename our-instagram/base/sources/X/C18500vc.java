package X;

import android.os.Handler;

/* renamed from: X.0vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18500vc extends C13400mQ {
    @Override // X.C13400mQ
    public final boolean A01(Object obj) {
        Handler handler = this.A05;
        Runnable runnable = this.A07;
        handler.removeCallbacks(runnable);
        this.A01 = obj;
        long j = this.A04;
        if (j == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
        this.A02 = true;
        return true;
    }
}
