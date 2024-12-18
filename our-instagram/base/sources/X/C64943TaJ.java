package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TaJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64943TaJ extends AbstractC06970Yo implements java.util.Set, Collection, InterfaceC15590qF {
    public final C57M A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C57O c57o = this.A00.A00;
        AbstractC128315r0[] abstractC128315r0Arr = new AbstractC128315r0[8];
        int i = 0;
        do {
            abstractC128315r0Arr[i] = new AbstractC128315r0();
            i++;
        } while (i < 8);
        return new AbstractC128345r3(c57o, abstractC128315r0Arr);
    }

    public C64943TaJ(C57M c57m) {
        this.A00 = c57m;
    }
}
