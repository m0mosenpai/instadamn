package X;

import java.util.List;

/* renamed from: X.MsN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51692MsN extends C0T6 {
    public static final C51692MsN A03;
    public static final C51692MsN A04;
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51692MsN) {
                C51692MsN c51692MsN = (C51692MsN) obj;
                if (this.A02 != c51692MsN.A02 || this.A01 != c51692MsN.A01 || !C14360o3.A0K(this.A00, c51692MsN.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C16930sl c16930sl = C16930sl.A00;
        A03 = new C51692MsN(c16930sl, false, false);
        A04 = new C51692MsN(c16930sl, true, false);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02)));
    }

    public C51692MsN(List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = list;
    }
}
