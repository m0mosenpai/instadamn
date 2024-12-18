package X;

import java.lang.Thread;

/* renamed from: X.7sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176107sT implements Thread.UncaughtExceptionHandler {
    public C176137sW A00;
    public Thread.UncaughtExceptionHandler A01;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C176137sW c176137sW = this.A00;
        if (c176137sW != null) {
            c176137sW.A02();
            this.A00 = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A01;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
