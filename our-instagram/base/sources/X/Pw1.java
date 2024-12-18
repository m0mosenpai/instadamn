package X;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Pw1<K, V> extends AbstractC06980Yp<K, V> implements InterfaceC65695TsH<K, V> {
    public int A00;
    public int A01;
    public Object A02;
    public C6LV A03;
    public C6LW A04;
    public C6LX A05;

    @Override // X.AbstractC06980Yp, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.A02 = null;
        C6LW c6lw = this.A04;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.A04 = c6lw.A0B(obj, obj2, this, i, 0);
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.SOO, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        Pw1 pw1;
        C6LV AEV;
        C14360o3.A0B(map, 0);
        if (!(map instanceof C6LV) || (AEV = (C6LV) map) == null) {
            if ((map instanceof Pw1) && (pw1 = (Pw1) map) != null) {
                AEV = pw1.AEV();
            } else {
                super.putAll(map);
                return;
            }
        }
        ?? obj = new Object();
        obj.A00 = 0;
        int size = size();
        C6LW c6lw = this.A04;
        C6LW c6lw2 = AEV.A00;
        C14360o3.A0C(c6lw2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A04 = c6lw.A0E(this, c6lw2, obj, 0);
        int size2 = (AEV.size() + size) - obj.A00;
        if (size != size2) {
            A05(size2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C6LW A0C = this.A04.A0C(obj, obj2, this, AbstractC25235BEs.A06(obj), 0);
        if (A0C == null) {
            A0C = C6LW.A04;
            C14360o3.A0C(A0C, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A04 = A0C;
        if (size == size()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC06980Yp
    public final int A00() {
        return this.A01;
    }

    @Override // X.AbstractC06980Yp
    public final Collection A01() {
        return new C64935TaB(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A02() {
        return new C65122Tdx(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A03() {
        return new C64941TaH(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6LX, java.lang.Object] */
    @Override // X.InterfaceC65695TsH
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final C6LV AEV() {
        C6LW c6lw = this.A04;
        C6LV c6lv = this.A03;
        if (c6lw != c6lv.A00) {
            this.A05 = new Object();
            c6lv = new C6LV(c6lw, size());
        }
        this.A03 = c6lv;
        return c6lv;
    }

    public final void A05(int i) {
        this.A01 = i;
        this.A00++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C6LW c6lw = C6LW.A04;
        C14360o3.A0C(c6lw, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A04 = c6lw;
        A05(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A04.A0F(obj, AbstractC25235BEs.A06(obj), 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
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
                if (map instanceof C6LV) {
                    c6lw = this.A04;
                    c6lw2 = ((C6LV) obj).A00;
                    interfaceC16620sF = C65093TdQ.A00;
                } else if (map instanceof Pw1) {
                    c6lw = this.A04;
                    c6lw2 = ((Pw1) obj).A04;
                    interfaceC16620sF = C65094TdR.A00;
                } else if (map instanceof C6LT) {
                    c6lw = this.A04;
                    c6lw2 = ((C6LT) obj).A02.A00;
                    interfaceC16620sF = C65095TdS.A00;
                } else if (map instanceof C58476Pw2) {
                    c6lw = this.A04;
                    c6lw2 = ((C58476Pw2) obj).A03.A04;
                    interfaceC16620sF = C65096TdT.A00;
                } else {
                    return AbstractC62826SSy.A01(this, map);
                }
                return c6lw.A0G(interfaceC16620sF, c6lw2);
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int i;
        C6LW c6lw = this.A04;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c6lw.A09(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.A02 = null;
        C6LW A0D = this.A04.A0D(obj, this, AbstractC25235BEs.A06(obj), 0);
        if (A0D == null) {
            A0D = C6LW.A04;
            C14360o3.A0C(A0D, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A04 = A0D;
        return this.A02;
    }
}
