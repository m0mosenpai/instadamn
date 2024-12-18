package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125945ml {
    public static final C125955mm A00 = new InheritableThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00() {
        C125955mm c125955mm = A00;
        AtomicInteger atomicInteger = (AtomicInteger) c125955mm.get();
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            c125955mm.set(atomicInteger);
        }
        if (atomicInteger.get() <= 0) {
            return false;
        }
        return true;
    }
}
