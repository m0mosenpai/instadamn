package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TTi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64774TTi implements Map, Serializable {
    public static final C64774TTi A05 = new C64774TTi(new Object[0], 0);
    public transient AbstractC64896TYw A00;
    public transient AbstractC60703RNf A01;
    public transient AbstractC60703RNf A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C64774TTi() {
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC64896TYw abstractC64896TYw = this.A00;
        if (abstractC64896TYw == null) {
            abstractC64896TYw = new C60706RNi(this.A04, 1, this.A03);
            this.A00 = abstractC64896TYw;
        }
        return abstractC64896TYw.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        AbstractC60703RNf abstractC60703RNf = this.A01;
        if (abstractC60703RNf == null) {
            C60710RNm c60710RNm = new C60710RNm(this, this.A04, this.A03);
            this.A01 = c60710RNm;
            return c60710RNm;
        }
        return abstractC60703RNf;
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
        AbstractC60703RNf abstractC60703RNf = this.A01;
        if (abstractC60703RNf == null) {
            abstractC60703RNf = new C60710RNm(this, this.A04, this.A03);
            this.A01 = abstractC60703RNf;
        }
        Iterator it = abstractC60703RNf.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        AbstractC60703RNf abstractC60703RNf = this.A02;
        if (abstractC60703RNf == null) {
            C60709RNl c60709RNl = new C60709RNl(new C60706RNi(this.A04, 0, this.A03), this);
            this.A02 = c60709RNl;
            return c60709RNl;
        }
        return abstractC60703RNf;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC64896TYw abstractC64896TYw = this.A00;
        if (abstractC64896TYw == null) {
            C60706RNi c60706RNi = new C60706RNi(this.A04, 1, this.A03);
            this.A00 = c60706RNi;
            return c60706RNi;
        }
        return abstractC64896TYw;
    }

    public C64774TTi(Object[] objArr, int i) {
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
