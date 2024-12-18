package X;

import java.util.List;

/* renamed from: X.JwD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45022JwD extends C0T6 {
    public final C47318KvT A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45022JwD) {
                C45022JwD c45022JwD = (C45022JwD) obj;
                if (this.A02 != c45022JwD.A02 || !C14360o3.A0K(this.A01, c45022JwD.A01) || !C14360o3.A0K(this.A00, c45022JwD.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC25225BEi.A08(this.A02)));
    }

    public C45022JwD(C47318KvT c47318KvT, List list, boolean z) {
        AbstractC167017dG.A1R(list, c47318KvT);
        this.A02 = z;
        this.A01 = list;
        this.A00 = c47318KvT;
    }
}
