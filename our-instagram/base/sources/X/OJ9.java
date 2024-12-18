package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class OJ9 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof OJ9)) {
            return false;
        }
        OJ9 oj9 = (OJ9) obj;
        if (!C14360o3.A0K(this.A04, oj9.A04) || !C14360o3.A0K(this.A03, oj9.A03) || !C14360o3.A0K(this.A02, oj9.A02) || this.A01 != oj9.A01 || this.A00 != oj9.A00) {
            return false;
        }
        return true;
    }

    public OJ9(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 && i != Integer.MIN_VALUE) {
            throw AbstractC166987dD.A12("Position must be non-negative");
        }
        list.isEmpty();
        if (i2 < 0 && i2 != Integer.MIN_VALUE) {
            throw AbstractC166987dD.A12("List size + position too large, last item in list beyond totalCount.");
        }
    }
}
