package X;

import java.util.List;

/* renamed from: X.Ee6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32925Ee6 extends AbstractC33553EsR {
    public final C5QE A00;
    public final C5QE A01;
    public final List A02;
    public final boolean A03;

    public C32925Ee6(C5QE c5qe, C5QE c5qe2, List list, boolean z) {
        C14360o3.A0B(list, 4);
        this.A01 = c5qe;
        this.A00 = c5qe2;
        this.A03 = z;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32925Ee6) {
                C32925Ee6 c32925Ee6 = (C32925Ee6) obj;
                if (!C14360o3.A0K(this.A01, c32925Ee6.A01) || !C14360o3.A0K(this.A00, c32925Ee6.A00) || this.A03 != c32925Ee6.A03 || !C14360o3.A0K(this.A02, c32925Ee6.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01))));
    }
}
