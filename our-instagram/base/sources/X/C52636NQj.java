package X;

/* renamed from: X.NQj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52636NQj extends AbstractC53505NlW {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52636NQj) {
                C52636NQj c52636NQj = (C52636NQj) obj;
                if (this.A01 != c52636NQj.A01 || this.A00 != c52636NQj.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public C52636NQj(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
