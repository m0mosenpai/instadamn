package X;

import java.util.Map;

/* renamed from: X.ACh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23008ACh {
    public final String A00;
    public final Map A01;
    public final java.util.Set A02;
    public final java.util.Set A03;

    public final boolean equals(Object obj) {
        java.util.Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23008ACh) {
            C23008ACh c23008ACh = (C23008ACh) obj;
            if (C14360o3.A0K(this.A00, c23008ACh.A00) && C14360o3.A0K(this.A01, c23008ACh.A01) && C14360o3.A0K(this.A02, c23008ACh.A02)) {
                java.util.Set set2 = this.A03;
                if (set2 == null || (set = c23008ACh.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C23008ACh(String str, Map map, java.util.Set set, java.util.Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TableInfo{name='");
        A1C.append(this.A00);
        A1C.append("', columns=");
        A1C.append(this.A01);
        A1C.append(", foreignKeys=");
        A1C.append(this.A02);
        A1C.append(", indices=");
        A1C.append(this.A03);
        return AbstractC167027dH.A0R(A1C);
    }
}
