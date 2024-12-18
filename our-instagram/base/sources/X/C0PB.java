package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Collections;

/* renamed from: X.0PB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PB {
    public static void A00(String str) {
        C0PC.A00().D2z(str, Collections.singletonMap("startTime", Long.toString(AwakeTimeSinceBootClock.INSTANCE.now())));
    }
}
