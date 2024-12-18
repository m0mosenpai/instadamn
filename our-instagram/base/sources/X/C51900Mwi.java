package X;

/* renamed from: X.Mwi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51900Mwi extends C0T6 implements InterfaceC57856PlM {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C51900Mwi(boolean z, boolean z2, int i) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C51900Mwi) {
            C51900Mwi c51900Mwi = (C51900Mwi) obj;
            if (c51900Mwi.A00 != i || this.A02 != c51900Mwi.A02 || this.A01 != c51900Mwi.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A02));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51900Mwi() {
        this(true, true, 1);
        this.A00 = 1;
    }
}
