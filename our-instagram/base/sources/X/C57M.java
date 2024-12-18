package X;

import java.util.Collection;

/* renamed from: X.57M, reason: invalid class name */
/* loaded from: classes3.dex */
public class C57M<K, V> extends AbstractC17010st<K, V> implements C57N<K, V> {
    public static final C57M A02 = new C57M(C57O.A04, 0);
    public final C57O A00;
    public final int A01;

    @Override // X.AbstractC17010st
    public final int A00() {
        return this.A01;
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C64929Ta5(this);
    }

    @Override // X.AbstractC17010st
    public final java.util.Set A02() {
        return new C128305qz(this);
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ java.util.Set A03() {
        return new C64943TaJ(this);
    }

    public final C57M A04(Object obj, Object obj2) {
        int i;
        C57O c57o = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C57e A0C = c57o.A0C(obj, obj2, i, 0);
        if (A0C == null) {
            return this;
        }
        return new C57M(A0C.A00, size() + A0C.A01);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5VT, X.5VS, X.5VR] */
    @Override // X.C57N
    public final /* bridge */ /* synthetic */ C5VT AEz() {
        if (this instanceof C59O) {
            C59O c59o = (C59O) this;
            ?? c5vs = new C5VS(c59o);
            c5vs.A00 = c59o;
            return c5vs;
        }
        return new C5VS(this);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        C57O c57o = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c57o.A0K(obj, i, 0);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public Object get(Object obj) {
        int i;
        C57O c57o = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c57o.A0J(i, obj, 0);
    }

    public C57M(C57O c57o, int i) {
        this.A00 = c57o;
        this.A01 = i;
    }
}
