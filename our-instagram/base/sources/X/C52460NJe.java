package X;

import java.util.List;

/* renamed from: X.NJe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52460NJe extends AbstractC53465Nks {
    public final C38686GzR A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52460NJe) {
                C52460NJe c52460NJe = (C52460NJe) obj;
                if (this.A02 != c52460NJe.A02 || !C14360o3.A0K(this.A00, c52460NJe.A00) || !C14360o3.A0K(this.A01, c52460NJe.A01) || this.A03 != c52460NJe.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC25225BEi.A08(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C52460NJe(C38686GzR c38686GzR, List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = c38686GzR;
        this.A01 = list;
        this.A03 = z2;
    }

    public C52460NJe() {
        this(null, null, false, false);
    }
}
