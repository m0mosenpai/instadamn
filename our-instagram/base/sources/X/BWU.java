package X;

import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes5.dex */
public final class BWU extends C0T6 implements InterfaceC31168DnC {
    public final C38685GzQ A00;
    public final C26123Bh8 A01;
    public final boolean A02;
    public final C38663Gz4 A03;
    public final C5QE A04;
    public final C5QE A05;
    public final ImageUrl A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public BWU(C38685GzQ c38685GzQ, C26123Bh8 c26123Bh8, C38663Gz4 c38663Gz4, C5QE c5qe, C5QE c5qe2, ImageUrl imageUrl, String str, String str2, List list, boolean z, boolean z2) {
        C14360o3.A0B(str2, 7);
        this.A08 = str;
        this.A03 = c38663Gz4;
        this.A01 = c26123Bh8;
        this.A00 = c38685GzQ;
        this.A07 = str2;
        this.A09 = list;
        this.A02 = z;
        this.A05 = c5qe;
        this.A04 = c5qe2;
        this.A06 = imageUrl;
        this.A0A = z2;
    }

    @Override // X.InterfaceC31068DlA
    public final MidCardOverlayType Bad() {
        return null;
    }

    @Override // X.InterfaceC31168DnC
    public final MUG CH8() {
        return null;
    }

    @Override // X.InterfaceC31168DnC
    public final boolean CdM() {
        return false;
    }

    @Override // X.InterfaceC31068DlA
    public final boolean Cfi() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BWU) {
                BWU bwu = (BWU) obj;
                if (!C14360o3.A0K(this.A08, bwu.A08) || !C14360o3.A0K(this.A03, bwu.A03) || !C14360o3.A0K(this.A01, bwu.A01) || !C14360o3.A0K(this.A00, bwu.A00) || !C14360o3.A0K(this.A07, bwu.A07) || !C14360o3.A0K(this.A09, bwu.A09) || this.A02 != bwu.A02 || !C14360o3.A0K(this.A05, bwu.A05) || !C14360o3.A0K(this.A04, bwu.A04) || !C14360o3.A0K(this.A06, bwu.A06) || this.A0A != bwu.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A08))));
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC167007dF.A0D(this.A0A, (AbstractC166997dE.A0J(this.A06, (((AbstractC167007dF.A0D(this.A02, (AbstractC166997dE.A0K(this.A07, AbstractC25225BEi.A05(A0J, A00)) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + A00) * 31);
    }

    @Override // X.InterfaceC31168DnC
    public final ImageUrl Af7() {
        return this.A06;
    }

    @Override // X.InterfaceC31068DlA
    public final String Avy() {
        return this.A07;
    }

    @Override // X.InterfaceC31068DlA
    public final List BRE() {
        return this.A09;
    }

    @Override // X.InterfaceC31068DlA
    public final C38663Gz4 BTk() {
        return this.A03;
    }

    @Override // X.InterfaceC31168DnC
    public final C5QE C3b() {
        return this.A04;
    }

    @Override // X.InterfaceC31168DnC
    public final C5QE C8m() {
        return this.A05;
    }

    @Override // X.InterfaceC31168DnC
    public final boolean CDf() {
        return this.A0A;
    }

    @Override // X.InterfaceC31068DlA
    public final String getId() {
        return this.A08;
    }
}
