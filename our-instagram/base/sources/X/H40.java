package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;

/* loaded from: classes7.dex */
public final class H40 extends C0T6 implements InterfaceC43558JLs {
    public final InterestPivotRedirect A00;
    public final InterestPivotStyle A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43558JLs
    public final H40 Evk() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H40) {
                H40 h40 = (H40) obj;
                if (!C14360o3.A0K(this.A02, h40.A02) || this.A00 != h40.A00 || !C14360o3.A0K(this.A03, h40.A03) || this.A01 != h40.A01 || !C14360o3.A0K(this.A04, h40.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43558JLs
    public final String BEi() {
        return this.A02;
    }

    @Override // X.InterfaceC43558JLs
    public final InterestPivotRedirect BlM() {
        return this.A00;
    }

    @Override // X.InterfaceC43558JLs
    public final String Bqp() {
        return this.A03;
    }

    @Override // X.InterfaceC43558JLs
    public final InterestPivotStyle C34() {
        return this.A01;
    }

    @Override // X.InterfaceC43558JLs
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTInterestPivotDict", AbstractC40035HpM.A00(this));
    }

    @Override // X.InterfaceC43558JLs
    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public H40(InterestPivotRedirect interestPivotRedirect, InterestPivotStyle interestPivotStyle, String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = interestPivotRedirect;
        this.A03 = str2;
        this.A01 = interestPivotStyle;
        this.A04 = str3;
    }
}
