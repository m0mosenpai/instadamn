package com.facebook.common.time;

import X.C0JO;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements C0JO {
    public static final AwakeTimeSinceBootClock INSTANCE = new Object();

    @Override // X.C0JO
    public /* synthetic */ long now() {
        long millis;
        millis = TimeUnit.NANOSECONDS.toMillis(nowNanos());
        return millis;
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // X.C0JO
    public long nowNanos() {
        return System.nanoTime();
    }
}
