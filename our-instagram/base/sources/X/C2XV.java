package X;

import android.os.Looper;

/* renamed from: X.2XV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XV {
    public static final boolean A01() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final void A00() {
        if (!C2V3.isEndToEndTestRun && !A01()) {
            throw new IllegalStateException(AnonymousClass001.A0R("This must run on the main thread; but is running on ", Thread.currentThread().getName()));
        }
    }
}
