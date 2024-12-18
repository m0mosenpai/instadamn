package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TTh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64773TTh implements Map, Serializable {
    public static final C64773TTh A05 = new C64773TTh(new Object[0], 0);
    public transient AbstractC64895TYv A00;
    public transient RNO A01;
    public transient RNO A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C64773TTh() {
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC64895TYv abstractC64895TYv = this.A00;
        if (abstractC64895TYv == null) {
            abstractC64895TYv = new RNJ(this.A04, 1, this.A03);
            this.A00 = abstractC64895TYv;
        }
        return abstractC64895TYv.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        RNO rno = this.A01;
        if (rno == null) {
            RNN rnn = new RNN(this, this.A04, this.A03);
            this.A01 = rnn;
            return rnn;
        }
        return rno;
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
        RNO rno = this.A01;
        if (rno == null) {
            rno = new RNN(this, this.A04, this.A03);
            this.A01 = rno;
        }
        Iterator it = rno.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        RNO rno = this.A02;
        if (rno == null) {
            RNM rnm = new RNM(new RNJ(this.A04, 0, this.A03), this);
            this.A02 = rnm;
            return rnm;
        }
        return rno;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC64895TYv abstractC64895TYv = this.A00;
        if (abstractC64895TYv == null) {
            RNJ rnj = new RNJ(this.A04, 1, this.A03);
            this.A00 = rnj;
            return rnj;
        }
        return abstractC64895TYv;
    }

    public C64773TTh(Object[] objArr, int i) {
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
