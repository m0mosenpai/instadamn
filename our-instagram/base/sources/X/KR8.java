package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes8.dex */
public final class KR8 extends AbstractC46440Kh0 {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final DirectShareTarget A02;
    public final C3o9 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KR8) {
                KR8 kr8 = (KR8) obj;
                if (!C14360o3.A0K(this.A03, kr8.A03) || !C14360o3.A0K(this.A02, kr8.A02) || this.A04 != kr8.A04 || !C14360o3.A0K(this.A00, kr8.A00) || !C14360o3.A0K(this.A01, kr8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public KR8(ImageUrl imageUrl, ImageUrl imageUrl2, DirectShareTarget directShareTarget, C3o9 c3o9, boolean z) {
        this.A03 = c3o9;
        this.A02 = directShareTarget;
        this.A04 = z;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }
}
