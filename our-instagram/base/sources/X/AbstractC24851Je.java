package X;

import com.google.common.collect.ImmutableCollection;

/* renamed from: X.1Je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24851Je {
    public abstract AbstractC24851Je add(Object element);

    public abstract ImmutableCollection build();

    public static int A00(int oldCapacity, int minCapacity) {
        if (minCapacity >= 0) {
            int i = oldCapacity + (oldCapacity >> 1) + 1;
            if (i < minCapacity) {
                int highestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
                if (highestOneBit < 0) {
                    return Integer.MAX_VALUE;
                }
                return highestOneBit;
            }
            return i;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
