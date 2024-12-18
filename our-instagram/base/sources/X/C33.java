package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C33 extends CPU {
    public final int A00;
    public final List A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33(List list, List list2, int i) {
        super(list);
        C14360o3.A0B(list2, 3);
        this.A01 = list;
        this.A00 = i;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33) {
                C33 c33 = (C33) obj;
                if (!C14360o3.A0K(this.A01, c33.A01) || this.A00 != c33.A00 || !C14360o3.A0K(this.A02, c33.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OverflowAccountsResult(accounts=");
        A1C.append(this.A01);
        A1C.append(", totalCount=");
        A1C.append(this.A00);
        A1C.append(", overflowRecentlySearchedProfiles=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
