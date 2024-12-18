package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.Pw2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58476Pw2<K, V> extends AbstractC06980Yp<K, V> implements InterfaceC65695TsH<K, V> {
    public Object A00;
    public Object A01;
    public C6LT A02;
    public final Pw1 A03;

    @Override // X.AbstractC06980Yp
    public final int A00() {
        return this.A03.size();
    }

    @Override // X.AbstractC06980Yp
    public final Collection A01() {
        return new C64936TaC(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A02() {
        return new C65123Tdy(this);
    }

    @Override // X.AbstractC06980Yp
    public final java.util.Set A03() {
        return new C64942TaI(this);
    }

    @Override // X.InterfaceC65695TsH
    public final InterfaceC137496Ku AEV() {
        C6LV AEV = this.A03.AEV();
        C6LT c6lt = this.A02;
        if (AEV != c6lt.A02) {
            c6lt = new C6LT(this.A00, this.A01, AEV);
        }
        this.A02 = c6lt;
        return c6lt;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A03.clear();
        C6LU c6lu = C6LU.A00;
        this.A00 = c6lu;
        this.A01 = c6lu;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A03.containsKey(obj);
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
                if (map instanceof C6LT) {
                    c6lw = this.A03.A04;
                    c6lw2 = ((C6LT) obj).A02.A00;
                    interfaceC16620sF = C65100TdX.A00;
                } else if (map instanceof C58476Pw2) {
                    c6lw = this.A03.A04;
                    c6lw2 = ((C58476Pw2) obj).A03.A04;
                    interfaceC16620sF = C65101TdY.A00;
                } else if (map instanceof C6LV) {
                    c6lw = this.A03.A04;
                    c6lw2 = ((C6LV) obj).A00;
                    interfaceC16620sF = C65102TdZ.A00;
                } else if (map instanceof Pw1) {
                    c6lw = this.A03.A04;
                    c6lw2 = ((Pw1) obj).A04;
                    interfaceC16620sF = C65103Tda.A00;
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
        C58477Pw3 c58477Pw3 = (C58477Pw3) this.A03.get(obj);
        if (c58477Pw3 != null) {
            return c58477Pw3.A02;
        }
        return null;
    }

    @Override // X.AbstractC06980Yp, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object obj3;
        C58477Pw3 c58477Pw3;
        Pw1 pw1 = this.A03;
        C58477Pw3 c58477Pw32 = (C58477Pw3) pw1.get(obj);
        if (c58477Pw32 != null) {
            obj3 = c58477Pw32.A02;
            if (obj3 == obj2) {
                return obj2;
            }
            c58477Pw3 = new C58477Pw3(obj2, c58477Pw32.A01, c58477Pw32.A00);
        } else {
            obj3 = null;
            if (isEmpty()) {
                this.A00 = obj;
                this.A01 = obj;
                C6LU c6lu = C6LU.A00;
                c58477Pw3 = new C58477Pw3(obj2, c6lu, c6lu);
            } else {
                Object obj4 = this.A01;
                Object obj5 = pw1.get(obj4);
                C14360o3.A0A(obj5);
                C58477Pw3 c58477Pw33 = (C58477Pw3) obj5;
                pw1.put(obj4, new C58477Pw3(c58477Pw33.A02, c58477Pw33.A01, obj));
                pw1.put(obj, new C58477Pw3(obj2, obj4, C6LU.A00));
                this.A01 = obj;
                return null;
            }
        }
        pw1.put(obj, c58477Pw3);
        return obj3;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        C58477Pw3 c58477Pw3 = (C58477Pw3) this.A03.get(obj);
        if (c58477Pw3 == null || !C14360o3.A0K(c58477Pw3.A02, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6LX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Pw1, X.0Yp] */
    public C58476Pw2(C6LT c6lt) {
        this.A02 = c6lt;
        this.A00 = c6lt.A00;
        this.A01 = c6lt.A01;
        C6LV c6lv = c6lt.A02;
        ?? abstractC06980Yp = new AbstractC06980Yp();
        abstractC06980Yp.A03 = c6lv;
        abstractC06980Yp.A05 = new Object();
        abstractC06980Yp.A04 = c6lv.A00;
        abstractC06980Yp.A01 = c6lv.size();
        this.A03 = abstractC06980Yp;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        Pw1 pw1 = this.A03;
        C58477Pw3 c58477Pw3 = (C58477Pw3) pw1.remove(obj);
        if (c58477Pw3 == null) {
            return null;
        }
        Object obj3 = c58477Pw3.A01;
        Object obj4 = C6LU.A00;
        if (obj3 != obj4) {
            Object obj5 = pw1.get(obj3);
            C14360o3.A0A(obj5);
            C58477Pw3 c58477Pw32 = (C58477Pw3) obj5;
            obj2 = c58477Pw3.A00;
            pw1.put(obj3, new C58477Pw3(c58477Pw32.A02, c58477Pw32.A01, obj2));
        } else {
            obj2 = c58477Pw3.A00;
            this.A00 = obj2;
        }
        if (obj2 != obj4) {
            Object obj6 = pw1.get(obj2);
            C14360o3.A0A(obj6);
            C58477Pw3 c58477Pw33 = (C58477Pw3) obj6;
            pw1.put(obj2, new C58477Pw3(c58477Pw33.A02, obj3, c58477Pw33.A00));
        } else {
            this.A01 = obj3;
        }
        return c58477Pw3.A02;
    }
}
