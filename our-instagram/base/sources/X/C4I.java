package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C4I extends CA0 {
    public final List A00;
    public final boolean A01;

    public C4I(List list, boolean z) {
        C14360o3.A0B(list, 2);
        this.A01 = z;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4I) {
                C4I c4i = (C4I) obj;
                if (this.A01 != c4i.A01 || !C14360o3.A0K(this.A00, c4i.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FinishExtendedCapture(skipClicked=");
        A1C.append(this.A01);
        A1C.append(", pickedImages=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
