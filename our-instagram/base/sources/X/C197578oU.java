package X;

import android.os.SystemClock;

/* renamed from: X.8oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197578oU implements InterfaceC197758om {
    public static final C197578oU A01 = new Object();
    public long A00;

    @Override // X.InterfaceC197758om
    public final synchronized long ANc() {
        long elapsedRealtimeNanos;
        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A00 = elapsedRealtimeNanos;
        return elapsedRealtimeNanos;
    }
}
