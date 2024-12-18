package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TV0 implements ThreadFactory {
    public int A00;
    public String A01;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C64873TXz(runnable, this.A01, this.A00);
    }
}
