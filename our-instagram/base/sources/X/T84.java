package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class T84 implements InterfaceC28041Xi, Serializable {
    public final C2n2 A00;
    public final InterfaceC28041Xi A01;

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object a) {
        return this.A01.apply(this.A00.apply(a));
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object obj) {
        if (!(obj instanceof T84)) {
            return false;
        }
        T84 t84 = (T84) obj;
        if (!this.A00.equals(t84.A00) || !this.A01.equals(t84.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public T84(C2n2 p, InterfaceC28041Xi f) {
        this.A01 = f;
        this.A00 = p;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
