package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.6LT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LT<K, V> extends AbstractC17010st<K, V> implements InterfaceC137496Ku<K, V> {
    public static final C6LT A03;
    public final Object A00;
    public final Object A01;
    public final C6LV A02;

    static {
        C6LU c6lu = C6LU.A00;
        C6LV c6lv = C6LV.A02;
        C14360o3.A0C(c6lv, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C6LT(c6lu, c6lu, c6lv);
    }

    @Override // X.AbstractC17010st
    public final int A00() {
        return this.A02.size();
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C64931Ta7(this);
    }

    @Override // X.AbstractC17010st
    public final java.util.Set A02() {
        return new C64946TaM(this);
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ java.util.Set A03() {
        return new C64947TaN(this);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A02.containsKey(obj);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final boolean equals(Object obj) {
        C6LW c6lw;
        C6LW c6lw2;
        InterfaceC16620sF interfaceC16620sF;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C6LT) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((C6LT) obj).A02.A00;
                    interfaceC16620sF = C58478Pw4.A00;
                } else if (map instanceof C58476Pw2) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((C58476Pw2) obj).A03.A04;
                    interfaceC16620sF = C65097TdU.A00;
                } else if (map instanceof C6LV) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((C6LV) obj).A00;
                    interfaceC16620sF = C65098TdV.A00;
                } else if (map instanceof Pw1) {
                    c6lw = this.A02.A00;
                    c6lw2 = ((Pw1) obj).A04;
                    interfaceC16620sF = C65099TdW.A00;
                } else {
                    return super.equals(obj);
                }
                return c6lw.A0G(interfaceC16620sF, c6lw2);
            }
        }
        return false;
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final Object get(Object obj) {
        C58477Pw3 c58477Pw3 = (C58477Pw3) this.A02.get(obj);
        if (c58477Pw3 != null) {
            return c58477Pw3.A02;
        }
        return null;
    }

    public C6LT(Object obj, Object obj2, C6LV c6lv) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = c6lv;
    }
}
