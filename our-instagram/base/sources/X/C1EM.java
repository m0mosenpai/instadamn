package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1EM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C1EM {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReference atomicReference) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}