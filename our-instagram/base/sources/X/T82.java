package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class T82 implements InterfaceC28041Xi, Serializable {
    public final Object A00 = Object.class;

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object o) {
        return Object.class.equals(o);
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object obj) {
        if (obj instanceof T82) {
            return Object.class.equals(Object.class);
        }
        return false;
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Predicates.equalTo(");
        return AbstractC58323PtF.A0q(Object.class, A1C);
    }
}
