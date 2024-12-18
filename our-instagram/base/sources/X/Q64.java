package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Q64 extends SPB implements Iterator, C0s1 {
    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A00();
            return entry.getValue();
        }
        throw AbstractC58318PtA.A0Z();
    }
}
