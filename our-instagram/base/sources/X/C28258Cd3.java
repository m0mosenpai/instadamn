package X;

import java.util.List;

/* renamed from: X.Cd3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28258Cd3 {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28258Cd3) {
                C28258Cd3 c28258Cd3 = (C28258Cd3) obj;
                if (!C14360o3.A0K(this.A01, c28258Cd3.A01) || this.A00 != c28258Cd3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C28258Cd3(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EditHistoryState(history=");
        A1C.append(this.A01);
        A1C.append(", currentIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }

    public C28258Cd3() {
        this(AbstractC166987dD.A1E(), -1);
    }
}
