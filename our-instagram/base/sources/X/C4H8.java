package X;

import java.util.BitSet;
import java.util.Iterator;

/* renamed from: X.4H8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4H8 {
    public static final void A00(Iterable iterable, BitSet bitSet) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bitSet.set(Character.toLowerCase(((String) it.next()).charAt(0)) % 30);
        }
    }
}
