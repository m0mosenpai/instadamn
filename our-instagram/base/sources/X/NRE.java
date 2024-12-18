package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NRE extends AbstractC53511Nld {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NRE) {
                NRE nre = (NRE) obj;
                if (!C14360o3.A0K(this.A00, nre.A00) || !C14360o3.A0K(this.A01, nre.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public NRE(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
