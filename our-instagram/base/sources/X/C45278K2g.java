package X;

import java.util.Map;

/* renamed from: X.K2g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45278K2g extends C0T6 implements InterfaceC37093GWc {
    public final Map A00;
    public final java.util.Set A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45278K2g) {
                C45278K2g c45278K2g = (C45278K2g) obj;
                if (this.A02 != c45278K2g.A02 || !C14360o3.A0K(this.A01, c45278K2g.A01) || !C14360o3.A0K(this.A00, c45278K2g.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC25225BEi.A08(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45278K2g(Map map, java.util.Set set, boolean z) {
        this.A02 = z;
        this.A01 = set;
        this.A00 = map;
    }
}
