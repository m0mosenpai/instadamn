package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class MW6 extends C0T6 implements InterfaceC31098Dlg {
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MW6) {
                MW6 mw6 = (MW6) obj;
                if (!C14360o3.A0K(this.A03, mw6.A03) || this.A04 != mw6.A04 || !C14360o3.A0K(this.A01, mw6.A01) || !C14360o3.A0K(this.A02, mw6.A02) || !C14360o3.A0K(this.A00, mw6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public MW6(Boolean bool, Long l, String str, List list, boolean z) {
        this.A03 = list;
        this.A04 = z;
        this.A01 = l;
        this.A02 = str;
        this.A00 = bool;
    }
}
