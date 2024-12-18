package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C2C extends AbstractC27446C9o {
    public final List A00;
    public final boolean A01;

    public C2C(List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2C) {
                C2C c2c = (C2C) obj;
                if (!C14360o3.A0K(this.A00, c2c.A00) || this.A01 != c2c.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Sections(sections=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(67));
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
