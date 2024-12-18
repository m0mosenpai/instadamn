package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.S8c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62355S8c {
    public static final ExecutorService A00;
    public static final ThreadFactory A01;

    static {
        TVF tvf = TVF.A00;
        A01 = tvf;
        A00 = Executors.newCachedThreadPool(tvf);
    }
}
