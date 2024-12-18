package X;

import java.lang.Thread;
import java.lang.ref.WeakReference;

/* renamed from: X.7xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179017xD implements Thread.UncaughtExceptionHandler {
    public WeakReference A00;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C178987xA c178987xA = (C178987xA) this.A00.get();
        if (c178987xA != null) {
            c178987xA.A05.DRm(c178987xA, new RuntimeException(th));
        }
    }
}
