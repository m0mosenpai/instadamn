package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Ta6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64930Ta6 extends AbstractC17040sw implements Collection, InterfaceC15590qF {
    public final C6LV A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C6LW c6lw = this.A00.A00;
        C14360o3.A0B(c6lw, 1);
        TT7[] tt7Arr = new TT7[8];
        int i = 0;
        do {
            tt7Arr[i] = new TT7();
            i++;
        } while (i < 8);
        return new TTE(c6lw, tt7Arr);
    }

    public C64930Ta6(C6LV c6lv) {
        this.A00 = c6lv;
    }
}
