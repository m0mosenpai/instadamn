package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.B1l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ThreadFactoryC24937B1l implements ThreadFactory {
    public final int A00;
    public final String A01;

    public ThreadFactoryC24937B1l(String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = str;
        } else {
            this.A01 = str;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.A00;
        String str = this.A01;
        if (i != 0) {
            return new Thread(runnable, str);
        }
        Thread thread = new Thread(runnable, str);
        thread.setPriority(3);
        return thread;
    }
}
