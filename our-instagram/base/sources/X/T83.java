package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class T83 implements InterfaceC28041Xi, Serializable {
    public final InterfaceC28041Xi A00;

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object t) {
        return !this.A00.apply(t);
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object obj) {
        if (obj instanceof T83) {
            return this.A00.equals(((T83) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ (-1);
    }

    public T83(InterfaceC28041Xi predicate) {
        this.A00 = predicate;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Predicates.not(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
