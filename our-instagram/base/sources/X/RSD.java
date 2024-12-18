package X;

/* loaded from: classes10.dex */
public abstract class RSD extends TZR {
    public final InterfaceC75173Zi A00() {
        if (this instanceof RS6) {
            return ((RS6) this).A00;
        }
        RS5 rs5 = (RS5) this;
        if (rs5 instanceof RQO) {
            return ((RQO) rs5).A00;
        }
        return rs5.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        if (!(o instanceof AbstractC62759SPq)) {
            return false;
        }
        AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) o;
        if (abstractC62759SPq.A00() <= 0 || A00().AL0(abstractC62759SPq.A01()) != abstractC62759SPq.A00()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object object) {
        if (object instanceof AbstractC62759SPq) {
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) object;
            Object A01 = abstractC62759SPq.A01();
            int A00 = abstractC62759SPq.A00();
            if (A00 != 0) {
                return A00().ESE(A01, A00, 0);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }
}
