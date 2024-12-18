package X;

import android.os.SystemClock;

/* renamed from: X.1EL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EL implements C0JO {
    @Override // X.C0JO
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X.C0JO
    public final long nowNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
