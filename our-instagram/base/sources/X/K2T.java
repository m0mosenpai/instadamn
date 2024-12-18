package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K2T extends C0T6 implements MNJ {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2T) {
                K2T k2t = (K2T) obj;
                if (!C14360o3.A0K(this.A01, k2t.A01) || !C14360o3.A0K(this.A00, k2t.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public K2T(List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }
}
