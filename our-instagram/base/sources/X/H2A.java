package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H2A extends C0T6 implements JJJ {
    public final List A00;
    public final List A01;

    @Override // X.JJJ
    public final H2A EqW(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2A) {
                H2A h2a = (H2A) obj;
                if (!C14360o3.A0K(this.A00, h2a.A00) || !C14360o3.A0K(this.A01, h2a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public H2A(List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        this.A00 = list;
        this.A01 = list2;
    }

    @Override // X.JJJ
    public final JJJ E8e(C1DY c1dy) {
        return this;
    }
}
