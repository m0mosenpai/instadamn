package X;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public final class T80 implements InterfaceC28041Xi, Serializable {
    public final List A00;

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object t) {
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i < list.size()) {
                if (!((InterfaceC28041Xi) list.get(i)).apply(t)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object obj) {
        if (obj instanceof T80) {
            return this.A00.equals(((T80) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.A00;
        StringBuilder A0s = AbstractC58318PtA.A0s("Predicates.");
        A0s.append("and");
        A0s.append('(');
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                A0s.append(',');
            }
            A0s.append(obj);
            z = false;
        }
        return AbstractC167017dG.A0p(A0s);
    }

    public T80(List components) {
        this.A00 = components;
    }
}
