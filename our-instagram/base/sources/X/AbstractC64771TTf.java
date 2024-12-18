package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TTf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64771TTf implements Map, Serializable {
    public static final Map.Entry[] A01 = new Map.Entry[0];
    public transient RM5 A00;

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((RM0) this).A00.contains(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0010, code lost:
    
        if (r1 < 0) goto L6;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = r4
            X.RM0 r3 = (X.RM0) r3
            X.RM4 r0 = r3.A01
            r2 = -1
            if (r5 == 0) goto L12
            X.RLz r1 = r0.A01     // Catch: java.lang.ClassCastException -> L12
            java.util.Comparator r0 = r0.A02     // Catch: java.lang.ClassCastException -> L12
            int r1 = java.util.Collections.binarySearch(r1, r5, r0)     // Catch: java.lang.ClassCastException -> L12
            if (r1 >= 0) goto L13
        L12:
            r1 = -1
        L13:
            if (r1 != r2) goto L17
            r0 = 0
            return r0
        L17:
            X.RLz r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64771TTf.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return ((RM0) this).A01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return ((RM0) this).A00;
    }

    @Override // java.util.Map
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final RM5 entrySet() {
        RM5 rm5 = this.A00;
        if (rm5 == null) {
            RM0 rm0 = (RM0) this;
            if (rm0.isEmpty()) {
                rm5 = RM3.A05;
            } else {
                rm5 = new RM2(rm0);
            }
            this.A00 = rm5;
        }
        return rm5;
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
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
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
        int size = size();
        if (size >= 0) {
            StringBuilder A0t = AbstractC58323PtF.A0t(size);
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
        throw AbstractC25230BEn.A0n("size cannot be negative but was: ", size);
    }
}
