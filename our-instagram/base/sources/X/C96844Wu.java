package X;

import android.os.SystemClock;

/* renamed from: X.4Wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96844Wu {
    public final /* synthetic */ C95794Sn A00;

    public final void A00(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C95794Sn c95794Sn = this.A00;
        C95794Sn.A07(c95794Sn.A0G.obtainMessage(9, new Object[]{Integer.valueOf(z ? 1 : 0), Integer.valueOf(i), Long.valueOf(elapsedRealtime), false}), c95794Sn);
    }

    public C96844Wu(C95794Sn c95794Sn) {
        this.A00 = c95794Sn;
    }
}
