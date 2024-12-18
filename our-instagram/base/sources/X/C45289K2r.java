package X;

import java.util.List;

/* renamed from: X.K2r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45289K2r extends C0T6 implements MNW {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45289K2r) {
                C45289K2r c45289K2r = (C45289K2r) obj;
                if (!C14360o3.A0K(this.A00, c45289K2r.A00) || this.A02 != c45289K2r.A02 || this.A01 != c45289K2r.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public C45289K2r(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }

    public C45289K2r() {
        this(C16930sl.A00, false, false);
    }
}
