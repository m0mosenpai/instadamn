package com.facebook.common.time;

import X.C0JO;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements C0JO {
    public static final RealtimeSinceBootClock A00 = new Object();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    @Override // X.C0JO
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    @Override // X.C0JO
    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
