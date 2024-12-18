package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C32 extends CPU {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32) {
                C32 c32 = (C32) obj;
                if (!C14360o3.A0K(this.A01, c32.A01) || this.A00 != c32.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C32(List list, int i) {
        super(list);
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VerticalAccountsResult(accounts=");
        A1C.append(this.A01);
        A1C.append(", totalCount=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
