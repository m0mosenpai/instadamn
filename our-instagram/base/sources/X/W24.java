package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class W24 {
    public static final W24 A02;
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final Runnable A01 = new RunnableC71266Wqv(this);

    static {
        TimeUnit.DAYS.toMillis(1L);
        A02 = new W24();
    }
}
