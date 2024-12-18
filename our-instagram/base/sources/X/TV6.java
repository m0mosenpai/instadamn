package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TV6 implements ThreadFactory {
    public final int A00;

    public TV6(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        switch (this.A00) {
            case 0:
                return new Thread(new TMz(this, runnable), "glide-active-resources");
            case 1:
                str = "com.facebook.papaya.scheduling_thread";
                return new Thread(runnable, str);
            default:
                str = "com.facebook.papaya.random_thread";
                return new Thread(runnable, str);
        }
    }
}
