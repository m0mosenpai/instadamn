package X;

import java.util.Iterator;

/* renamed from: X.S2n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62218S2n {
    public static Object A00(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
