package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC142916cr extends AtomicLong implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final boolean A02;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        StringBuilder sb = new StringBuilder(this.A01);
        sb.append('-');
        sb.append(incrementAndGet());
        String obj = sb.toString();
        if (this.A02) {
            thread = new Thread(runnable, obj);
        } else {
            thread = new Thread(runnable, obj);
        }
        thread.setPriority(this.A00);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return AnonymousClass001.A0g("RxThreadFactory[", this.A01, "]");
    }

    public ThreadFactoryC142916cr(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
