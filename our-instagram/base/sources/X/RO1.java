package X;

/* loaded from: classes10.dex */
public abstract class RO1 extends AbstractC64898TYy implements java.util.Set {
    public transient RO3 A00;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // X.AbstractC64898TYy
    public RO3 A09() {
        RO3 ro3 = this.A00;
        if (ro3 == null) {
            RO3 A0A = A0A();
            this.A00 = A0A;
            return A0A;
        }
        return ro3;
    }

    public RO3 A0A() {
        Object[] array = toArray();
        return RO3.A03(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return S2p.A00(this);
    }
}
