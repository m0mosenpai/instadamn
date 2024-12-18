package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TV2 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new TY0(this, runnable);
    }
}
