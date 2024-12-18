package X;

import java.util.List;

/* renamed from: X.9VF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VF extends AbstractC72460Xe6 {
    public final List A00;
    public final String A01 = "STRINGS";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VF) {
                C9VF c9vf = (C9VF) obj;
                if (!C14360o3.A0K(this.A01, c9vf.A01) || !C14360o3.A0K(this.A00, c9vf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9VF(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputStrings(type=");
        A1C.append(this.A01);
        A1C.append(", listStrings=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
