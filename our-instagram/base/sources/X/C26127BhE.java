package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.BhE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26127BhE extends C0T6 implements InterfaceC31089DlX {
    public final UserMonetizationProductType A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C26127BhE(UserMonetizationProductType userMonetizationProductType, String str, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1G(str, 3, userMonetizationProductType);
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
        this.A01 = z3;
        this.A00 = userMonetizationProductType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26127BhE) {
                C26127BhE c26127BhE = (C26127BhE) obj;
                if (this.A03 != c26127BhE.A03 || this.A04 != c26127BhE.A04 || !C14360o3.A0K(this.A02, c26127BhE.A02) || this.A01 != c26127BhE.A01 || this.A00 != c26127BhE.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03)))));
    }
}
