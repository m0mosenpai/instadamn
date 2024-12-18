package X;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SVt {
    public static final int A01;
    public static final int A02;
    public static final SVt A03 = new SVt();
    public final Executor A00 = new Object();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        A01 = availableProcessors + 1;
        A02 = (availableProcessors * 2) + 1;
    }
}
