package X;

/* renamed from: X.Msw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51719Msw extends C0T6 {
    public static final C51719Msw A03 = new C51719Msw(false, true, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51719Msw) {
                C51719Msw c51719Msw = (C51719Msw) obj;
                if (this.A01 != c51719Msw.A01 || this.A00 != c51719Msw.A00 || this.A02 != c51719Msw.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A00, AbstractC25225BEi.A08(this.A01)));
    }

    public C51719Msw(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }

    public C51719Msw() {
        this(false, true, false);
    }
}
