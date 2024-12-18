package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42021ws {
    public static final C42201xA A00() {
        return new C42201xA(new C42031wt());
    }

    public static final C42201xA A01(Object obj) {
        C42031wt c42031wt = new C42031wt();
        AtomicReference atomicReference = c42031wt.A03;
        AbstractC42141x4.A01(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
        return new C42201xA(c42031wt);
    }
}
