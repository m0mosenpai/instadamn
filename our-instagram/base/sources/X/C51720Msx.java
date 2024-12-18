package X;

/* renamed from: X.Msx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51720Msx extends C0T6 {
    public static final C51720Msx A03 = new C51720Msx(false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51720Msx) {
                C51720Msx c51720Msx = (C51720Msx) obj;
                if (this.A02 != c51720Msx.A02 || this.A01 != c51720Msx.A01 || this.A00 != c51720Msx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02)));
    }

    public C51720Msx(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }

    public C51720Msx() {
        this(false, false, false);
    }
}
