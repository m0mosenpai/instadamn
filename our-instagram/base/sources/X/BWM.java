package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes5.dex */
public final class BWM extends C0T6 implements InterfaceC31168DnC {
    public final MUG A00;
    public final ClipsMidCardSubtype A01;
    public final InstagramMidcardType A02;
    public final C26136BhN A03;
    public final C38663Gz4 A04;
    public final ImageUrl A05;
    public final InterfaceC30893Di6 A06;
    public final InterfaceC30893Di6 A07;
    public final InterfaceC30895Di8 A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;
    public final MidCardOverlayType A0D;
    public final C5QE A0E;
    public final C5QE A0F;
    public final C38321qM A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public BWM(MUG mug, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C26136BhN c26136BhN, MidCardOverlayType midCardOverlayType, C38663Gz4 c38663Gz4, C5QE c5qe, C5QE c5qe2, ImageUrl imageUrl, C38321qM c38321qM, InterfaceC30893Di6 interfaceC30893Di6, InterfaceC30893Di6 interfaceC30893Di62, InterfaceC30895Di8 interfaceC30895Di8, String str, String str2, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167007dF.A1I(str2, 5, clipsMidCardSubtype);
        AbstractC25229BEm.A1O(list2, 14, list3);
        C14360o3.A0B(list4, 16);
        this.A09 = str;
        this.A04 = c38663Gz4;
        this.A0L = z;
        this.A0D = midCardOverlayType;
        this.A0H = str2;
        this.A0A = list;
        this.A02 = instagramMidcardType;
        this.A01 = clipsMidCardSubtype;
        this.A03 = c26136BhN;
        this.A0F = c5qe;
        this.A0E = c5qe2;
        this.A05 = imageUrl;
        this.A0K = z2;
        this.A0B = list2;
        this.A0J = list3;
        this.A0I = list4;
        this.A0G = c38321qM;
        this.A06 = interfaceC30893Di6;
        this.A07 = interfaceC30893Di62;
        this.A08 = interfaceC30895Di8;
        this.A0C = z3;
        this.A0M = z4;
        this.A00 = mug;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BWM) {
                BWM bwm = (BWM) obj;
                if (!C14360o3.A0K(this.A09, bwm.A09) || !C14360o3.A0K(this.A04, bwm.A04) || this.A0L != bwm.A0L || this.A0D != bwm.A0D || !C14360o3.A0K(this.A0H, bwm.A0H) || !C14360o3.A0K(this.A0A, bwm.A0A) || this.A02 != bwm.A02 || this.A01 != bwm.A01 || !C14360o3.A0K(this.A03, bwm.A03) || !C14360o3.A0K(this.A0F, bwm.A0F) || !C14360o3.A0K(this.A0E, bwm.A0E) || !C14360o3.A0K(this.A05, bwm.A05) || this.A0K != bwm.A0K || !C14360o3.A0K(this.A0B, bwm.A0B) || !C14360o3.A0K(this.A0J, bwm.A0J) || !C14360o3.A0K(this.A0I, bwm.A0I) || !C14360o3.A0K(this.A0G, bwm.A0G) || !C14360o3.A0K(this.A06, bwm.A06) || !C14360o3.A0K(this.A07, bwm.A07) || !C14360o3.A0K(this.A08, bwm.A08) || this.A0C != bwm.A0C || this.A0M != bwm.A0M || !C14360o3.A0K(this.A00, bwm.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, (AbstractC166997dE.A0J(this.A0I, AbstractC166997dE.A0J(this.A0J, AbstractC166997dE.A0J(this.A0B, AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A0J(this.A05, (((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0K(this.A0H, (AbstractC167007dF.A0D(this.A0L, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A09))) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31))) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31))))) + AbstractC167017dG.A0M(this.A0G)) * 31))))) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.InterfaceC31168DnC
    public final ImageUrl Af7() {
        return this.A05;
    }

    @Override // X.InterfaceC31068DlA
    public final String Avy() {
        return this.A0H;
    }

    @Override // X.InterfaceC31068DlA
    public final List BRE() {
        return this.A0A;
    }

    @Override // X.InterfaceC31068DlA
    public final C38663Gz4 BTk() {
        return this.A04;
    }

    @Override // X.InterfaceC31068DlA
    public final MidCardOverlayType Bad() {
        return this.A0D;
    }

    @Override // X.InterfaceC31168DnC
    public final C5QE C3b() {
        return this.A0E;
    }

    @Override // X.InterfaceC31168DnC
    public final C5QE C8m() {
        return this.A0F;
    }

    @Override // X.InterfaceC31168DnC
    public final boolean CDf() {
        return this.A0M;
    }

    @Override // X.InterfaceC31168DnC
    public final MUG CH8() {
        return this.A00;
    }

    @Override // X.InterfaceC31168DnC
    public final boolean CdM() {
        return this.A0K;
    }

    @Override // X.InterfaceC31068DlA
    public final boolean Cfi() {
        return this.A0L;
    }

    @Override // X.InterfaceC31068DlA
    public final String getId() {
        return this.A09;
    }
}
