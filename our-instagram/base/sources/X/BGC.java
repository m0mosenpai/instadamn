package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class BGC extends C0T6 implements InterfaceC31097Dlf {
    public final C9C9 A00;
    public final C31200Dnj A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public BGC(C9C9 c9c9, C31200Dnj c31200Dnj, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(imageUrl, 1);
        this.A03 = imageUrl;
        this.A02 = imageUrl2;
        this.A01 = c31200Dnj;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = num;
        this.A06 = z3;
        this.A00 = c9c9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGC) {
                BGC bgc = (BGC) obj;
                if (!C14360o3.A0K(this.A03, bgc.A03) || !C14360o3.A0K(this.A02, bgc.A02) || !C14360o3.A0K(this.A01, bgc.A01) || this.A05 != bgc.A05 || this.A07 != bgc.A07 || !C14360o3.A0K(this.A04, bgc.A04) || this.A06 != bgc.A06 || !C14360o3.A0K(this.A00, bgc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, (((AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
