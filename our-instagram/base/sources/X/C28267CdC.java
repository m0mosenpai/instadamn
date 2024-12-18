package X;

import java.util.List;

/* renamed from: X.CdC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28267CdC {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28267CdC) {
                C28267CdC c28267CdC = (C28267CdC) obj;
                if (this.A03 != c28267CdC.A03 || this.A02 != c28267CdC.A02 || this.A01 != c28267CdC.A01 || !C14360o3.A0K(this.A00, c28267CdC.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A03))));
    }

    public C28267CdC(List list, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WritePromptsState(isVisible=");
        A1C.append(this.A03);
        A1C.append(MSV.A00(67));
        A1C.append(this.A02);
        A1C.append(", isDisabled=");
        A1C.append(this.A01);
        A1C.append(", prompts=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28267CdC() {
        this(C16930sl.A00, true, true, true);
    }
}
