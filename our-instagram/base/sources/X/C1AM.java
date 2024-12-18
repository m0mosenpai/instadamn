package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1AM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C1AM {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReferenceArray atomicReferenceArray, int i) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
