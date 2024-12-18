package X;

/* loaded from: classes8.dex */
public final class M9N implements C17w {
    public final Comparable A00;
    public final Comparable A01;

    @Override // X.C17w
    public final Comparable B1t() {
        return this.A00;
    }

    @Override // X.C17w
    public final Comparable BzZ() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M9N) {
            if (!isEmpty() || !((M9N) obj).isEmpty()) {
                M9N m9n = (M9N) obj;
                if (C14360o3.A0K(this.A01, m9n.A01) && C14360o3.A0K(this.A00, m9n.A00)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C17w
    public final boolean isEmpty() {
        return AbstractC167007dF.A1O(this.A01.compareTo(this.A00));
    }

    public M9N(Comparable comparable, Comparable comparable2) {
        this.A01 = comparable;
        this.A00 = comparable2;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("..");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
