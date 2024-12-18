package X;

/* renamed from: X.0Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06970Yo<E> extends AbstractC17040sw<E> implements java.util.Set<E>, InterfaceC15590qF {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0B(set, 1);
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int i2 = 0;
        for (E e : this) {
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
