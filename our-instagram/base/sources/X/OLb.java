package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class OLb {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLb) {
                OLb oLb = (OLb) obj;
                if (this.A01 != oLb.A01 || !C14360o3.A0K(this.A00, oLb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public OLb(List list, boolean z) {
        this.A01 = z;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VaultBioAuthPromptResult(isAuthenticated=");
        A1C.append(this.A01);
        A1C.append(", failureReasons=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
