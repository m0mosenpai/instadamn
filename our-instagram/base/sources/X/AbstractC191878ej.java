package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.8ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191878ej {
    public static void A00(BitSet bitSet, String[] strArr) {
        int i = 0;
        if (bitSet.nextClearBit(0) < 2) {
            ArrayList arrayList = new ArrayList();
            do {
                if (!bitSet.get(i)) {
                    arrayList.add(strArr[i]);
                }
                i++;
            } while (i < 2);
            throw new IllegalStateException(AnonymousClass001.A0R(AbstractC111324zv.A00(695), Arrays.toString(arrayList.toArray())));
        }
    }
}
