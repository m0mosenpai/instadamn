package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C2B extends AbstractC27446C9o {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2B) {
                C2B c2b = (C2B) obj;
                if (!C14360o3.A0K(this.A00, c2b.A00) || this.A01 != c2b.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C2B(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
