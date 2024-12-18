package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Pvy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58473Pvy extends AbstractC06970Yo implements Collection, InterfaceC15590qF, InterfaceC65696TsI {
    public static final C58473Pvy A03;
    public final Object A00;
    public final Object A01;
    public final C6LV A02;

    static {
        C6LU c6lu = C6LU.A00;
        C6LV c6lv = C6LV.A02;
        C14360o3.A0C(c6lv, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C58473Pvy(c6lu, c6lu, c6lv);
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A02.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A02.containsKey(obj);
    }

    @Override // X.AbstractC06970Yo, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        C6LW c6lw;
        C6LW c6lw2;
        InterfaceC16620sF interfaceC16620sF;
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (size() == set.size()) {
                if (set instanceof C58473Pvy) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((C58473Pvy) obj).A02.A00;
                    interfaceC16620sF = C65104Tdb.A00;
                } else if (set instanceof C58479Pw5) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((C58479Pw5) obj).A03.A04;
                    interfaceC16620sF = C65105Tdc.A00;
                } else {
                    return super.equals(obj);
                }
                return c6lw.A0G(interfaceC16620sF, c6lw2);
            }
        }
        return false;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C58474Pvz(this.A00, this.A02);
    }

    public C58473Pvy(Object obj, Object obj2, C6LV c6lv) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = c6lv;
    }
}
