package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.5VS, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5VS<K, V> extends AbstractC06980Yp<K, V> implements C5VT<K, V> {
    public int A00;
    public C57O A01;
    public C5VU A02 = new Object();
    public Object A03;
    public int A04;
    public C57M A05;

    @Override // X.AbstractC06980Yp, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.A03 = null;
        C57O c57o = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.A01 = c57o.A0G(this, obj, obj2, i, 0);
        return this.A03;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int i;
        this.A03 = null;
        C57O c57o = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C57O A0F = c57o.A0F(this, obj, i, 0);
        if (A0F == null) {
            A0F = C57O.A04;
            C14360o3.A0C(A0F, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0F;
        return this.A03;
    }

    @Override // X.AbstractC06980Yp
    public final int A00() {
        return this.A04;
    }

    @Override // X.AbstractC06980Yp
    public final Collection A01() {
        return new C64934TaA(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A02() {
        return new C64939TaF(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A03() {
        return new C64940TaG(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5VU, java.lang.Object] */
    public final C57M A04() {
        if (this instanceof C5VR) {
            return ((C5VR) this).A06();
        }
        C57O c57o = this.A01;
        C57M c57m = this.A05;
        if (c57o != c57m.A00) {
            this.A02 = new Object();
            c57m = new C57M(c57o, size());
        }
        this.A05 = c57m;
        return c57m;
    }

    public final void A05(int i) {
        this.A04 = i;
        this.A00++;
    }

    @Override // X.C5VT
    public final /* bridge */ /* synthetic */ C57N AEM() {
        if (this instanceof C5VR) {
            return ((C5VR) this).A06();
        }
        return A04();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C57O c57o = C57O.A04;
        C14360o3.A0C(c57o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = c57o;
        A05(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        C57O c57o = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c57o.A0K(obj, i, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        C57O c57o = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c57o.A0J(i, obj, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.5VV, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C5VS c5vs;
        C57M A04;
        if (!(map instanceof C57M) || (A04 = (C57M) map) == null) {
            if ((map instanceof C5VS) && (c5vs = (C5VS) map) != null) {
                A04 = c5vs.A04();
            } else {
                super.putAll(map);
                return;
            }
        }
        ?? obj = new Object();
        obj.A00 = 0;
        int size = size();
        C57O c57o = this.A01;
        C57O c57o2 = A04.A00;
        C14360o3.A0C(c57o2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = c57o.A0E(this, c57o2, obj, 0);
        int size2 = (A04.size() + size) - obj.A00;
        if (size != size2) {
            A05(size2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5VU, java.lang.Object] */
    public C5VS(C57M c57m) {
        this.A05 = c57m;
        this.A01 = c57m.A00;
        this.A04 = c57m.size();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int size = size();
        C57O c57o = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C57O A0H = c57o.A0H(this, obj, obj2, i, 0);
        if (A0H == null) {
            A0H = C57O.A04;
            C14360o3.A0C(A0H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0H;
        if (size == size()) {
            return false;
        }
        return true;
    }
}
