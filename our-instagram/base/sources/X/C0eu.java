package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0eu, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eu {
    public static AtomicBoolean A00 = new AtomicBoolean(false);

    public static void A00() {
        boolean isEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!isEnabled, isEnabled)) {
            C0ev.A02(false, false);
        }
    }
}
