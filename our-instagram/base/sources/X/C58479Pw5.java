package X;

import java.util.Iterator;

/* renamed from: X.Pw5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58479Pw5<E> extends AnonymousClass041<E> implements InterfaceC65697TsJ<E> {
    public Object A00;
    public Object A01;
    public C58473Pvy A02;
    public final Pw1 A03;

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A03.size();
    }

    @Override // X.InterfaceC65697TsJ
    public final C58473Pvy AEW() {
        C6LV AEV = this.A03.AEV();
        C58473Pvy c58473Pvy = this.A02;
        if (AEV != c58473Pvy.A02) {
            c58473Pvy = new C58473Pvy(this.A00, this.A01, AEV);
        }
        this.A02 = c58473Pvy;
        return c58473Pvy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Pw1 pw1 = this.A03;
        if (pw1.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.A00 = obj;
            this.A01 = obj;
            pw1.put(obj, new C58524Pws());
            return true;
        }
        V v = pw1.get(this.A01);
        C14360o3.A0A(v);
        pw1.put(this.A01, new C58524Pws(((C58524Pws) v).A01, obj));
        pw1.put(obj, new C58524Pws(this.A01, C6LU.A00));
        this.A01 = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A03.clear();
        C6LU c6lu = C6LU.A00;
        this.A00 = c6lu;
        this.A01 = c6lu;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A03.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
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
                    c6lw = this.A03.A04;
                    c6lw2 = ((C58473Pvy) obj).A02.A00;
                    interfaceC16620sF = C65106Tdd.A00;
                } else if (set instanceof C58479Pw5) {
                    c6lw = this.A03.A04;
                    c6lw2 = ((C58479Pw5) obj).A03.A04;
                    interfaceC16620sF = C65107Tde.A00;
                } else {
                    return super.equals(obj);
                }
                return c6lw.A0G(interfaceC16620sF, c6lw2);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C65136TeB(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        Pw1 pw1 = this.A03;
        C58524Pws c58524Pws = (C58524Pws) pw1.remove(obj);
        if (c58524Pws == null) {
            return false;
        }
        Object obj3 = c58524Pws.A01;
        C6LU c6lu = C6LU.A00;
        if (obj3 != c6lu) {
            V v = pw1.get(obj3);
            C14360o3.A0A(v);
            obj2 = c58524Pws.A00;
            pw1.put(obj3, new C58524Pws(((C58524Pws) v).A01, obj2));
        } else {
            obj2 = c58524Pws.A00;
            this.A00 = obj2;
        }
        if (obj2 != c6lu) {
            V v2 = pw1.get(obj2);
            C14360o3.A0A(v2);
            pw1.put(obj2, new C58524Pws(obj3, ((C58524Pws) v2).A00));
            return true;
        }
        this.A01 = obj3;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6LX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Pw1, X.0Yp] */
    public C58479Pw5(C58473Pvy c58473Pvy) {
        this.A02 = c58473Pvy;
        this.A00 = c58473Pvy.A00;
        this.A01 = c58473Pvy.A01;
        C6LV c6lv = c58473Pvy.A02;
        ?? abstractC06980Yp = new AbstractC06980Yp();
        abstractC06980Yp.A03 = c6lv;
        abstractC06980Yp.A05 = new Object();
        abstractC06980Yp.A04 = c6lv.A00;
        abstractC06980Yp.A01 = c6lv.size();
        this.A03 = abstractC06980Yp;
    }
}
