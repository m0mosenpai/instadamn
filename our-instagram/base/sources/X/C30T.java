package X;

import android.os.SystemClock;

/* renamed from: X.30T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30T {
    public long A00;

    public final void A00(InterfaceC16820sZ interfaceC16820sZ, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > j) {
            this.A00 = elapsedRealtime;
            interfaceC16820sZ.invoke();
        }
    }
}
