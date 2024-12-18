package X;

import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class T81 implements InterfaceC28041Xi, Serializable {
    public final Collection A00;

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object t) {
        try {
            return this.A00.contains(t);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object obj) {
        if (obj instanceof T81) {
            return this.A00.equals(((T81) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public T81(Collection target) {
        target.getClass();
        this.A00 = target;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Predicates.in(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
