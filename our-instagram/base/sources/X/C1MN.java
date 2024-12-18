package X;

import sun.misc.Unsafe;

/* renamed from: X.1MN, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C1MN {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, Object obj3, Unsafe unsafe, long j) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
