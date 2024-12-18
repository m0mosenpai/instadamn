package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Puq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ThreadFactoryC58412Puq implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new RunnableC58413Pur(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public ThreadFactoryC58412Puq(String str) {
        C3U5.A03(str, "Name must not be null");
        this.A00 = str;
    }
}
