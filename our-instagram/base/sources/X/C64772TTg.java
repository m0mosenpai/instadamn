package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TTg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64772TTg implements Map, Serializable {
    public static final C64772TTg A05 = new C64772TTg(new Object[0], 0);
    public transient AbstractC64894TYu A00;
    public transient RN8 A01;
    public transient RN8 A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C64772TTg() {
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC64894TYu abstractC64894TYu = this.A00;
        if (abstractC64894TYu == null) {
            abstractC64894TYu = new RN3(this.A04, 1, this.A03);
            this.A00 = abstractC64894TYu;
        }
        return abstractC64894TYu.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        RN8 rn8 = this.A01;
        if (rn8 == null) {
            RN7 rn7 = new RN7(this, this.A04, this.A03);
            this.A01 = rn7;
            return rn7;
        }
        return rn8;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return AbstractC58323PtF.A0n(obj, this.A04, this.A03);
    }

    @Override // java.util.Map
    public final int hashCode() {
        RN8 rn8 = this.A01;
        if (rn8 == null) {
            rn8 = new RN7(this, this.A04, this.A03);
            this.A01 = rn8;
        }
        Iterator it = rn8.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        RN8 rn8 = this.A02;
        if (rn8 == null) {
            RN6 rn6 = new RN6(new RN3(this.A04, 0, this.A03), this);
            this.A02 = rn6;
            return rn6;
        }
        return rn8;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC64894TYu abstractC64894TYu = this.A00;
        if (abstractC64894TYu == null) {
            RN3 rn3 = new RN3(this.A04, 1, this.A03);
            this.A00 = rn3;
            return rn3;
        }
        return abstractC64894TYu;
    }

    public C64772TTg(Object[] objArr, int i) {
        this.A04 = objArr;
        this.A03 = i;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC167007dF.A1W(get(obj));
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(size());
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    public final String toString() {
        StringBuilder A0t = AbstractC58323PtF.A0t(size());
        Iterator it = entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            if (!z) {
                AbstractC58318PtA.A1S(A0t);
            }
            AbstractC58323PtF.A1R(A0t, A1K);
            z = false;
        }
        return AbstractC167027dH.A0R(A0t);
    }
}
