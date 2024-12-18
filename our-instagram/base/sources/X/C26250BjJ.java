package X;

import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.BjJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26250BjJ extends C0T6 implements InterfaceC31168DnC {
    public final C22P A00;
    public final C38663Gz4 A01;
    public final List A02;
    public final boolean A03;
    public final C5QE A04;
    public final C5QE A05;
    public final ImageUrl A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C26250BjJ(C22P c22p, C38663Gz4 c38663Gz4, C5QE c5qe, C5QE c5qe2, ImageUrl imageUrl, String str, String str2, List list, boolean z, boolean z2) {
        AbstractC25229BEm.A1L(str2, 5, c22p);
        this.A08 = str;
        this.A01 = c38663Gz4;
        this.A0A = true;
        this.A07 = str2;
        this.A02 = list;
        this.A05 = c5qe;
        this.A04 = c5qe2;
        this.A06 = imageUrl;
        this.A09 = true;
        this.A03 = z;
        this.A00 = c22p;
        this.A0B = z2;
    }

    @Override // X.InterfaceC31068DlA
    public final MidCardOverlayType Bad() {
        return null;
    }

    @Override // X.InterfaceC31168DnC
    public final MUG CH8() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26250BjJ) {
                C26250BjJ c26250BjJ = (C26250BjJ) obj;
                if (!C14360o3.A0K(this.A08, c26250BjJ.A08) || !C14360o3.A0K(this.A01, c26250BjJ.A01) || this.A0A != c26250BjJ.A0A || !C14360o3.A0K(this.A07, c26250BjJ.A07) || !C14360o3.A0K(this.A02, c26250BjJ.A02) || !C14360o3.A0K(this.A05, c26250BjJ.A05) || !C14360o3.A0K(this.A04, c26250BjJ.A04) || !C14360o3.A0K(this.A06, c26250BjJ.A06) || this.A09 != c26250BjJ.A09 || this.A03 != c26250BjJ.A03 || this.A00 != c26250BjJ.A00 || this.A0B != c26250BjJ.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A06, (((((AbstractC166997dE.A0K(this.A07, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A08))) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)))));
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
        return this.A02;
    }

    @Override // X.InterfaceC31068DlA
    public final C38663Gz4 BTk() {
        return this.A01;
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
        return this.A0B;
    }

    @Override // X.InterfaceC31168DnC
    public final boolean CdM() {
        return this.A09;
    }

    @Override // X.InterfaceC31068DlA
    public final boolean Cfi() {
        return this.A0A;
    }

    @Override // X.InterfaceC31068DlA
    public final String getId() {
        return this.A08;
    }
}
