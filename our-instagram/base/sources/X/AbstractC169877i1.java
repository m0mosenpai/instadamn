package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.7i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169877i1 {
    public static void A00(BitSet bitSet, String[] strArr, int i) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException(AnonymousClass001.A0R(AbstractC111324zv.A00(695), Arrays.toString(arrayList.toArray())));
        }
    }
}
