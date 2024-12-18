package X;

import java.lang.Thread;

/* renamed from: X.TRp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64733TRp implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String A0R = AnonymousClass001.A0R("UncaughtException in ", thread.getName());
        new IllegalStateException(th);
        C14360o3.A0B(A0R, 2);
    }
}
