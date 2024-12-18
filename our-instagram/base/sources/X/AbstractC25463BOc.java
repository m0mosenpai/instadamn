package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BOc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25463BOc {
    public static final AtomicBoolean A01;
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public static final AtomicInteger A03 = new AtomicInteger(0);

    static {
        C17280tP A0y = AbstractC166987dD.A0y();
        A01 = new AtomicBoolean(AbstractC167017dG.A1b(A0y, A0y.A0J, C17280tP.A4G, 171));
    }
}
