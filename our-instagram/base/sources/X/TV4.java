package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TV4 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
