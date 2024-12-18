package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final /* synthetic */ class TVI implements ThreadFactory {
    public static final ThreadFactory A00 = new Object();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
